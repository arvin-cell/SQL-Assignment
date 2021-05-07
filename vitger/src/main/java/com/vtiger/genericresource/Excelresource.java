package com.vtiger.genericresource;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Arvind
 *
 */

public class Excelresource 
{
	public String getexceldata(String sheetname, int rownum,int colnum) throws Throwable
	{
		
		FileInputStream fis =new FileInputStream(Pathresourcse.excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rownum);
		String data = row.getCell(colnum).getStringCellValue();
		wb.close();
		return  data ;
		
	}
	
	public int getRowCount(String sheetName)throws Throwable 
	{
		FileInputStream fis = new FileInputStream(Pathresourcse.excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);	
		return sh.getLastRowNum();			
	} 
	
	public void setExcelData(String shettName , int rowNum , int colNum ,String data) throws Throwable 
	{
		FileInputStream fis = new FileInputStream(Pathresourcse.excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(shettName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(colNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(Pathresourcse.excelpath);
		wb.write(fos);
		wb.close();
	}
	
	
}
