package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constant;


public class ExcelUtility
{
	static FileInputStream f; // Inbuilt class from IO Package, used to read data from the file
	static XSSFWorkbook wb; // Inbuilt class from Apache used to read data from Excel Workbook
	static XSSFSheet   sh; // Inbuilt class from Apache used to read data from Excelsheet
	
	
	public static String getStringData(int a,int b, String Sheet) throws IOException // a represents Row value, b represents Cell value, String sheet for Sheet
	{
		f=new FileInputStream(Constant.TESTDATAFILE);
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet(Sheet);  //"getSheet" Method used to get values/data from the sheet
		XSSFRow r =sh.getRow(a);   // XSSFRow class - Inbuilt class in Apache & getRow is method used to read value from row
		XSSFCell c = r.getCell(b);   // XSSFCell class -  Inbuilt class in Apache & getCell is method used to read value from Cell
		return c.getStringCellValue();  // "getStringCellValue" method used to get String data from Cell
	}
	
public static String getIntegerData(int a, int b, String Sheet) throws IOException
	
	{
		f= new FileInputStream (Constant.TESTDATAFILE);
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet(Sheet);
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		int x=(int)c.getNumericCellValue(); // getNumericCellValue method used to get double value to Int value -Type casting
		return String.valueOf(x); //valueOf method used for Type convertion -One data type to another , Integer Data type to String Data type
		
	}
	
	

}
