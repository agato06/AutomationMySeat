import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven extends Main{
	private static String pasword = "Charlie20$";
	private static String email = "agato@opentrends.net";
	public  static String excSheet;
	public  static XSSFWorkbook wb ;
	public  static XSSFSheet sheet ;
	public  static XSSFRow row ;
	public  static XSSFCell cell ;
	public  static FileInputStream fis ;
	public  static FileOutputStream fos ;
	public  static String excelloc="C:\\Users\\Agato\\eclipse-workspace\\MySeatAutomation\\src\\data.xlsx";
	
public static String getCelldata(String excSheet,int rownum, int columnum) throws IOException {
	
	fis = new FileInputStream(excelloc);

	wb = new XSSFWorkbook(fis);
	sheet = wb.getSheet(excSheet);
	row = sheet.getRow(rownum); // Rownum , filas
	cell = row.getCell(columnum);//Columna num
	fis.close();
	return cell.getStringCellValue();
}
public static String setCelldata(String excSheet,String text,int rownum, int columnum) throws IOException {
	fis = new FileInputStream(excelloc);

	wb = new XSSFWorkbook(fis);
	sheet = wb.getSheet(excSheet);
	row = sheet.getRow(rownum); // Rownum , filas
	cell = row.getCell(columnum);//Columna num
	cell.setCellValue(text);
	fos = new FileOutputStream(excelloc);
	wb.write(fos);
	fos.close();
	
	String celldata1=cell.getStringCellValue();
	return celldata1;
	
}
}

