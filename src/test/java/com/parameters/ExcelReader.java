package com.parameters;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	static File f;
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow rw;
	static XSSFCell cell10;
	static String url;
	static String data;
	static String data1;
public static String geturl() throws IOException{
	f= new File(System.getProperty("user.dir")+"//MBExcelData//MBData.xlsx");
	fis= new FileInputStream(f);
	wb= new XSSFWorkbook(fis);  // to call the value from workbook
	sheet= wb.getSheetAt(0); // getting the sheet using wb method dont give space in sheet name
	rw= sheet.getRow(1);
	
cell10= rw.getCell(0);
url=cell10.getStringCellValue();
return url;

}
public static String getSecondUrl() throws IOException {
	f= new File(System.getProperty("user.dir")+"//MBExcelData//MBData.xlsx");
	fis= new FileInputStream(f);
	wb= new XSSFWorkbook(fis);  // to call the value from workbook
	sheet= wb.getSheetAt(0); // getting the sheet using wb method dont give space in sheet name
	rw= sheet.getRow(2);
	
cell10= rw.getCell(0);
url=cell10.getStringCellValue();
return url;
}
public static String getUserDetail() throws IOException {
	f= new File(System.getProperty("user.dir")+"//MBExcelData//MBData.xlsx");
	fis= new FileInputStream(f);
	wb= new XSSFWorkbook(fis);  // to call the value from workbook
	sheet= wb.getSheetAt(0); // getting the sheet using wb method dont give space in sheet name
	rw= sheet.getRow(3);
	
cell10= rw.getCell(0);
data=cell10.getStringCellValue();
return data;
}

public static String getEmail() throws IOException {
	f= new File(System.getProperty("user.dir")+"//MBExcelData//MBData.xlsx");
	fis= new FileInputStream(f);
	wb= new XSSFWorkbook(fis);  // to call the value from workbook
	sheet= wb.getSheetAt(0); // getting the sheet using wb method dont give space in sheet name
	rw= sheet.getRow(4);
	
cell10= rw.getCell(0);
data=cell10.getStringCellValue();
return data;
}

}
