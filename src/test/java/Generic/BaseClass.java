package Generic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class BaseClass {
	
	public String setpath(String path)
	{
		String currentDirectoryPath=System.getProperty("user.dir");
		currentDirectoryPath= currentDirectoryPath+ path;
		return currentDirectoryPath;
		
	}
	
	public void ReadExcel()
	{
		//File dataFile= new File(this.setpath("\\src\\test\\java\\DataSheet\\"+filename));
		//FileInputStream fls;
		
		//fls=new
	}
	
	public void WriteExcel(String filename,HashSet<String> lhs)
	{
		
		File dataFile= new File(this.setpath("\\src\\test\\java\\DataSheet\\"+filename));
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		int i=0;
		for(String value: lhs)
		{
		XSSFRow row=sheet.createRow(i);//insteda of create cell get cell
		XSSFCell cell=row.createCell(0);//getrow
		cell.setCellValue("values");//getcellvalue
		}
		
		try {
			FileOutputStream fos= new FileOutputStream(dataFile);//for read, fileInputstreaem.It should be the 1st statement
			workbook.write(fos);
			workbook.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
