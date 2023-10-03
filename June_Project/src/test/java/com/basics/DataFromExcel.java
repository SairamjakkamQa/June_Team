package com.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFromExcel {

	public static void main(String[] args) throws Throwable {

	File file=new File("./target/testread.xlsx");
		
	FileInputStream	stream=new FileInputStream(file);
	
	XSSFWorkbook workbook=new XSSFWorkbook(stream);
	
	XSSFSheet sheet=workbook.getSheetAt(1);
	
	int rows=sheet.getPhysicalNumberOfRows();//4
	
	int cells=sheet.getRow(0).getLastCellNum();//2
	
	for(int i=1;i<rows;i++) {
		
		for (int j=0;j<cells;j++) {//0 1
			
			DataFormatter df=new DataFormatter();
			
			System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
			
		}
		
	}
	
	stream.close();
	workbook.close();
	
	}

}
