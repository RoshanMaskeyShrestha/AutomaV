package qspiders;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class handlinhSetExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis= new FileInputStream("./data/TestData.xlsx");
Workbook wb = WorkbookFactory.create(fis);
wb.getSheet("Invalid Data").getRow(1).getCell(6).setCellValue("pass");
FileOutputStream fos=new FileOutputStream("./data/TestData.xlsx");
wb.write(fos);
wb.close();

	}

}
