package com.parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
	static XSSFCell cell10;
	static String url;
	
	public static String geturl()throws IOException{
		file= new File(System.getProperty("user.dir")+"//MBExcelData//MBData.xlsx");

		fis= new FileInputStream(file);

		wb= new XSSFWorkbook(fis);  // to call the value from workbook

		sheet= wb.getSheetAt(0); // getting the sheet using wb method dont give space in sheet name

		row= sheet.getRow(1);

		cell10= row.getCell(0);
		
		url=cell10.getStringCellValue();
		
		return url;
//	}
//	
//}

//package com.parameters;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class ExcelReader {
//    static File file;
//    static FileInputStream fis;
//    static HSSFWorkbook wb;
//    static HSSFSheet sheet;
//    static HSSFRow row;
//    static HSSFCell cell10;
//    static String url;
////    
//    public static void main(String Args[]) throws IOException {
//         Provide the correct path to your Excel file
//        file = new File(System.getProperty("user.dir") + "//MBExcelData//MBData.xlsx");
//
//        // Use FileInputStream for reading data from the Excel file
//        fis = new FileInputStream(file);
//    	Properties prop=FileReading.reader();
//		System.out.println(prop.get("firstname"));

//        // Open the workbook in read mode
//        wb = new HSSFWorkbook(fis);  // Open the existing workbook
//
//        // Get the sheet (Make sure the sheet name is correct)
//        sheet = wb.getSheet("MBData"); // Replace with actual sheet name if needed
//
//        // Get the first row (index starts from 0)
//        row = sheet.getRow(1); // Assuming you want to read data from row 2 (index 1)
//
//        // Get the first cell in the row (index starts from 0)
//        cell10 = row.getCell(0); // Assuming URL is in the first column (index 0)
//
//        // Fetch the string value from the cell
//        url = cell10.getStringCellValue();
//        
//        // Print the fetched URL
//        System.out.println(url);
//        
//        // Close the FileInputStream and workbook
//        fis.close();
//        wb.close();
    	
//    	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//MBExcelData//MBData.xlsx");
//
//        // Use XSSFWorkbook for .xlsx files
//        XSSFWorkbook wb = new XSSFWorkbook(fis);
//        Sheet sheet = wb.getSheetAt(0);
//        Row row = sheet.getRow(1);
//        Cell cell = row.getCell(0);
//        String url = cell.getStringCellValue();
//
//        System.out.println(url);
//
//        fis.close();
//        wb.close();
    }
}

