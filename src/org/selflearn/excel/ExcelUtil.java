package org.selflearn.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;






import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static void main(String[] args) throws IOException {
		
		//FileInputStream fis=new FileInputStream("D:\\learn.xlsx");
		Workbook wb=new XSSFWorkbook();
		Sheet sh= wb.createSheet("test");
		
		Row r=sh.createRow(0);
		Cell c=r.createCell(0);
		
		c.setCellValue("satish");
		
		//r.removeCell(c);
		
		FileOutputStream fos=new FileOutputStream("D:\\learn.xlsx");
		
		wb.write(fos);
		fos.close();
		wb.close();
		
		
		
		
		

	}

}
