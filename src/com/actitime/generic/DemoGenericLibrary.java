package com.actitime.generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class DemoGenericLibrary {



	public static void main(String[] args) throws EncryptedDocumentException, IOException {
     FieldLib f= new FieldLib();
     String un = f.getPropertyData("username");
     System.out.println(un);
    String  un2=f.getExcelData("Create Username", 1, 1);
    System.out.println(un2);
    f.setExcelValue("Invalid Data", 1, 6,"pass");
     
		
	}

}
