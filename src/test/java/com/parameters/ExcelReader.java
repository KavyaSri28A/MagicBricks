package com.parameters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReader {
	static File f;
	static FileOutputStream fis;
	static HSSFWorkbook wb;
	static HSSFSheet sh;
	static HSSFRow rw;
	static HSSFCell cell10;
	static String url;
	
	
	public static String geturl() throws FileNotFoundException	{
		 
		f= new File(System.getProperty("user.dir")+"//MBExcelData//MBData.xlsx");
		fis= new FileOutputStream(f);
		wb= new HSSFWorkbook();  // to call the value from workbook
		sh= wb.getSheet("MBData.xlsx"); // getting the sheet using wb method dont give space in sheet name
		rw= sh.getRow(1);
		
	    cell10= rw.getCell(0);
		url=cell10.getStringCellValue();
	return url;
	 
	}
	}