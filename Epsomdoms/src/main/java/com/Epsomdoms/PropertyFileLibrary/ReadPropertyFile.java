package com.Epsomdoms.PropertyFileLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.Epsomdoms.GenericLibrary.FrameworkConstant;

/**
 * This class is used to read and Write Data From Property File
 * @author SURYA REDDY*/
public class ReadPropertyFile implements FrameworkConstant{

	public static FileInputStream fis;
	public static Properties property;
	public static FileOutputStream fos;
    
	/**
	 * This Method provides Reusable Methods to Read Data from Property File
	 * @param String key
	 * @return String*/
	public String readData(String key) {

		// 1.Convert the physical file into Java Readable

		try {
			fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// 2.Create an object for Properties class
		property = new Properties();

		// 3.Load all the keys datas
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 4.Fetch the data
		String data = property.getProperty(key);
		return data;

	}

	public void writeData(String key, String value) {
		//// 1.Convert the physical file into Java Readable

		try {
			fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// 2.Create an object for Properties class
		property = new Properties();

		// 3.Load all the keys Datas
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 4.Write the Data

		property.put(key, value);

		// 5.Convert java Readable into Physical file

		try {
			fos = new FileOutputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// 6.Store the Data
		try {
			property.store(fos, "Latest Key Upadated Sucessfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
