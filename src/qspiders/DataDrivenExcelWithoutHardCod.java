package qspiders;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenExcelWithoutHardCod {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int count=wb.getSheet("Create Username").getLastRowNum();
		int count1=wb.getSheet("Create Username").getRow(0).getLastCellNum();
		for (int i = 1; i <=count; i++) {
			
			for (int j =0; j<count1; j++) {
				
			String data =wb.getSheet("Create Username").getRow(i).getCell(j).getStringCellValue();
			System.out.print(data+" ");
			
		
		}
			System.out.println();}

	}

}
