package com.Epsomdoms.ExcelFileLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Epsomdoms.GenericLibrary.FrameworkConstant;

public class ReadExcelFile implements FrameworkConstant{
	public  FileInputStream fis = null;
	public  Workbook wb = null;
	public FileOutputStream fos = null;

	public String readSingleData(String sheetname, int row, int cell) {

		// 1. Convert Physical File into Java Readable
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// 2.Create the workbook using Workbook factory
		try {

			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 3.Using WorkBook get the sheet control
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;

		// 4.Using sheet get the Row control
		// 5.Using Row Get the Cell/Column Control
		// 6.Using Cell/Column get the Cell data
	}

	public  void readMultipleData(String sheetname) {
		// 1. Convert Physical File into Java Readable
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// 2.Create the workbook using Workbook factory
		try {

			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 3.Using WorkBook get the sheet control
		int rowcount = wb.getSheet(sheetname).getLastRowNum();
		for(int i=0;i<rowcount;i++) {
	    wb.getSheet(sheetname).getRow(i).getCell(1).setCellValue("Data will Pass");

		}
	
		
		// 4.Using sheet get the Row control
		// 5.Using Row Get the Cell/Column Control
		// 6.Using Cell/Column get the Cell data
	}

	public  void writeData(String sheetname, int row, int cell, String data) {
		// Convert Physical File into Java Readable
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// 2.Create the workbook using Workbook factory
		try {

			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 3.Using WorkBook get the sheet control
		wb.getSheet("Sheetname we will pass").getRow(0).createCell(0).setCellValue("String data we will pass");
		// 4.Using sheet get the Row control
		// 5.Using Row Create the Column
		// 6.Using Column Set the Cell data

		// 7.Convert java Readable file into Physical File
		try {
			fos = new FileOutputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 8. Write the data
		try {
			wb.write(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 9.close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
