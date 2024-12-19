package com.parameters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReader {
	static File file;
	static FileOutputStream fos;
	static HSSFWorkbook wb;
	static HSSFSheet sheet;
	static HSSFRow row;
	static HSSFCell cell10;
	static String url;
	public static String geturl() throws FileNotFoundException {
		file= new File(System.getProperty("user.dir")+"//TestData//MBData.xls");
		fos= new FileOutputStream(file);
		wb= new HSSFWorkbook();  
		sheet= wb.getSheet("MBData.xlsx"); 
		row= sheet.getRow(0);
		cell10= row.getCell(0);
		System.out.println(cell10.getStringCellValue());
		return url;
		
	}

}
