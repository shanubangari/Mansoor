package com.crm.Jiwaku_Project_Genericutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.protobuf.DescriptorProtos.FileOptions;

public class ExcelUtility {
	/**
	 * @author Jyoti H M
	 * This method is used to read the data from excel by specifying Sheet Number, Row Number, Cell Number
	 * @return 
	 * @throws Throwable 
	 */
	public String getExcelData(String sheetname, int rownum, int cellnum) throws Throwable {
		FileInputStream file=new FileInputStream(IPathConstant.EXCELPATH1);
		Workbook wb = WorkbookFactory.create(file);
		String data = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
	}

	public Object[][] getExcelData2(String sheetName) throws Throwable{
		FileInputStream fis=new FileInputStream(IPathConstant.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sht = wb.getSheet(sheetName);
		int lastRow=sht.getLastRowNum();
		short lastCell = sht.getRow(0).getLastCellNum();
		Object[][] data=new Object[lastRow][lastCell];
		for(int i=0; i<lastRow; i++) {
			for(int j=0; j<lastCell; j++) {
				data[i][j]=sht.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return data;
	}


	public void writeExcelData(String sheetName, int rownum, int column, String value ) throws Throwable {
		FileInputStream file=new FileInputStream(IPathConstant.EXCELPATH);
		Workbook wb = WorkbookFactory.create(file);
		wb.createSheet(sheetName).createRow(rownum).createCell(column).setCellValue(value);
		FileOutputStream fout=new FileOutputStream(IPathConstant.EXCELPATH);
		wb.write(fout);


	}



}
