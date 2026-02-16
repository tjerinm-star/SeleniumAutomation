package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant.Constant;

public class ExcelUtility {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;

	public static String getStringData(int a, int b, String Sheet) throws IOException {
		f = new FileInputStream(Constant.TEST_DATA_PATH);
		w = new XSSFWorkbook(f);
		s = w.getSheet(Sheet);
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();
	}

	public static int getIntegerData(int a, int b, String Sheet) throws IOException {
		f = new FileInputStream(Constant.TEST_DATA_PATH);
		w = new XSSFWorkbook(f);
		s = w.getSheet(Sheet);
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);
		// typecasting : convertion of one data type to another
		int y = (int) c.getNumericCellValue();
		return y;
	}

}
