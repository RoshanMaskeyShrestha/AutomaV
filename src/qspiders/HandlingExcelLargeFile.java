package qspiders;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelLargeFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int count=wb.getSheet("Create Username").getLastRowNum();
		for (int i = 1; i <=count; i++) {
			String un =wb.getSheet("Create Username").getRow(i).getCell(0).getStringCellValue();
			String pw = wb.getSheet("Create Username").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un + " " + pw);
		}
		
		
		
		
		

	}

}
