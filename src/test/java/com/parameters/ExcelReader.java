package com.parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	static File file;
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell00;
	static String st,st1;
	public static String getStrValue() throws IOException {
		file= new File(System.getProperty("user.dir")+"//MBExcelData//MBData.xlsx");
		fis = new FileInputStream(file);
		wb= new XSSFWorkbook(fis);  
		sheet= wb.getSheetAt(0); 
		row= sheet.getRow(0);
		cell00= row.getCell(0);
		//cell10=row.getCell(0);
		
		st=cell00.getStringCellValue();
		System.out.println(st);
		//st1=
		return st;
		
	}
	public static void main(String[] args) throws IOException {
//		file= new File(System.getProperty("user.dir")+"//MBExcelData//MBData.xlsx");
//		fis = new FileInputStream(file);
//		wb= new XSSFWorkbook(fis);  
//		sheet= wb.getSheetAt(0); 
//		row= sheet.getRow(0);
//		cell10= row.getCell(0);
//		
//		url=cell10.getStringCellValue();
//		System.out.println(url);
	}

}
