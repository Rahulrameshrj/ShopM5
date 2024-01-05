package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	
private static final String IpathConstant = null;
public String dataFromPropertiesFile(String key) throws Throwable {
File file = new File(IpathConstant.propertiespath);
FileInputStream fis = new FileInputStream(file);
Properties pro = new Properties();
pro.load(fis);
String value = pro.getProperty(key);
return value;
}

public String dataFromExcelFile(String SheetName, int RowNum , int colNum) throws Throwable {
	File file= new file(IpathConstant.Excelpath);
	FileInputStream fis= new FileInputStream(file);
	Workbook workbook = WorkbookFactory.create(fis);
	
	Sheet sheet = workbook.getSheet(SheetName);
	Row row = sheet.getRow(RowNum);
	
	DataFormatter formatter= new DataFormatter();
	String value = formatter.formatCellValue(row.getCell(colNum));
	return value;
}
public Object[][] accessAllAddress()throws Throwable{
	object[][]ref=new object[1][9];
	System.out.println("second test case");
	File file=new File(IpathConstant.ExcelIpath);
	FileInputStream fis=new FileInputStream(file);
	Workbook workbook=Workbook.getSheet("Sheet1");
	DataFormatter form=new DataFormatter();
	int count=0;
	for(int i=1;i<Sheet.getFirstRownum();i++) {
		for(int j=0;j<Sheet.getRow(i).getLastCellNum();j++) {
			ref[count][j]=form.formatCellValue(Sheet.getRow(i).getCell(j)).toString();
		}
		count++;
		
		}
		return ref;
		
	}
}

}
