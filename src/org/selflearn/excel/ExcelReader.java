package org.selflearn.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static HashMap loadExcelLines(String file)
	{
		//HashMap<String, LinkedHashMap<Integer,List>> outerMap=new HashMap<String, LinkedHashMap<Integer, List>>();
		
		LinkedHashMap<Integer, List> linkMap=new LinkedHashMap<Integer, List>();
		//HashMap<Integer, List> linkMap=new HashMap<Integer, List>();
		String sheetName=null;
		FileInputStream fis=null;
		
		try{
			
			fis=new FileInputStream(file);
			
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			
			
				XSSFSheet sh=wb.getSheetAt(0);
				sheetName=sh.getSheetName();
				
				Iterator rows=sh.rowIterator();
				
				while(rows.hasNext())
				{
					XSSFRow row=(XSSFRow)rows.next();
					
					Iterator cells=row.cellIterator();
					
					List data=new LinkedList();
					
					while(cells.hasNext())
					{
						XSSFCell cell=(XSSFCell)cells.next();
						
						cell.setCellType(Cell.CELL_TYPE_STRING);
						
						data.add(cell);
					}
					
					linkMap.put(row.getRowNum(),data);
					
				}
				
				//outerMap.put(sheetName, linkMap);
			
		}
		catch(IOException e){
			
			e.printStackTrace();
			
		}	
		
		
		//return outerMap;	
		return linkMap;
		
		
	}
	
	
	public static void main(String[] args)
	{
		HashMap map=ExcelReader.loadExcelLines("D:\\learn.xlsx");
		
		Set s= map.entrySet();
		System.out.println(s);
	}

}
