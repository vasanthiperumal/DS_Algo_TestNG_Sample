package utilitues;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import Testcase.Baseclass;

public class Excelutility extends Baseclass {
	
	

	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	String path=null;
	
	
	public Excelutility(String path){
		this.path=path;
	}

	public int getrowcount(String sheetname) throws IOException {
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet =workbook.getSheet(sheetname);
		int rowcount=sheet.getLastRowNum();
		workbook.close();
		fi.close();
		return rowcount;
	}
	
	public int getcellcount(String sheetname,int rownumber) throws IOException {
		
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet =workbook.getSheet(sheetname);
		row=sheet.getRow(rownumber);
		int cellcount=row.getLastCellNum();
		workbook.close();
		fi.close();
		return cellcount;
		
	}
	
	
	
	public String getcelldata(String sheetname,int rownumber,int colnumber) throws IOException {
		
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet =workbook.getSheet(sheetname);
		row=sheet.getRow(rownumber);
		cell=row.getCell(colnumber);
		
		DataFormatter formatter=new DataFormatter();//dataformatter is used to return data in string format
		String data;
		
		try {
			data=formatter.formatCellValue(cell);
		} 
		catch (Exception e) {
		
			e.printStackTrace();
			data="";
			
		}
		workbook.close();
		fi.close();
		return data;
		
	}	
	
	
}

