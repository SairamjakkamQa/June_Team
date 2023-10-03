package com.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Samdemo {

	public static void main(String[] args) throws Throwable {

		File a = new File("./target/demodata.xlsx");

		FileInputStream stream = new FileInputStream(a);

		XSSFWorkbook workbook = new XSSFWorkbook(stream);

		XSSFSheet sheet = workbook.getSheetAt(0);

		int rows = sheet.getPhysicalNumberOfRows();

		int cells = sheet.getRow(1).getLastCellNum();

		for (int i = 1; i < rows; i++) {

			for (int j = 0; j < cells; j++) {

				DataFormatter df = new DataFormatter();

				System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));

			}
		}

	}

}
