package org.selflearn.string;

public class StringSort {

	public static void main(String[] args) {

		String[] str={"Satish", "Viraj", "Anil"};
		
		int size=str.length;
		System.out.println(size);
		String temp;
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for(int k=0;k<size;k++)
		{
			System.out.println(str[k]);
		}
	}

}
