package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\seleniumwebdriver\\testdata\\data.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("sheet1");
	
	int totalrow=sheet.getLastRowNum();
	int totalcol=sheet.getRow(0).getLastCellNum();
	System.out.println("total rows"+totalrow);
	System.out.println("total column"+totalcol);
	
	}
	}
