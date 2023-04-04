package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FieldLib {

	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/seledata.property");
		Properties p =new Properties();
		p.load(fis);
		 String data = p.getProperty("key");
		 return data;
		
		

	}
	public  String getExcelData(String SheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("SheetName").getRow(row).getCell(cell).getStringCellValue();
		return data;
		
		
		
		
	}
	public void setExcelValue(String SheetName,int row,int cell ,String data) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(SheetName).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos= new FileOutputStream("./data/TestData.xlsx");
		wb.write(fos);
		wb.close();
		
		
		
	}
	

}
