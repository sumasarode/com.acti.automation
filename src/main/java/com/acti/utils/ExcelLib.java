package com.acti.utils;


	import java.io.File;
	import java.io.FileInputStream;

	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	/*
	 * Name: ExcelLib
	 * Description: This class is used to fetch the data from excel sheet by creating an object where required
	 * Developed By: sirisha@test.com
	 * Approved By: shantosh@test.com
	 * Approval Date: 14-6-23
	 * Last Modified: 14-6-23
	 */

	public class ExcelLib {

		XSSFWorkbook wb;

		public ExcelLib(String excelPath) {
			try 
			{
				File file = new File(excelPath);
				FileInputStream fis = new FileInputStream(file);
				wb = new XSSFWorkbook(fis);
			} 
			catch (Exception e) 
			{
				System.out.println("unable to load the excel file please check");
				e.printStackTrace();
			}
		}

		public int getRowCount(String sheetName) 
		{
			int count = wb.getSheet(sheetName).getLastRowNum() + 1;
			return count;
		}

		public int getRowCount(int sheetNum) 
		{
			return wb.getSheetAt(sheetNum).getLastRowNum() + 1;
		}

		public String getCellData(String sheetName, int row, int col) 
		{
			String data = wb.getSheet(sheetName).getRow(row).getCell(col).toString();
			return data;
		}

		public String getCellData(int sheetNum, int row, int col) 
		{
			String data = wb.getSheetAt(sheetNum).getRow(row).getCell(col).toString();
			return data;
		}

	

}
