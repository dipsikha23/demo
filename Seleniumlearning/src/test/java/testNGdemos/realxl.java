package testNGdemos;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class realxldata() throws IOException 
{
  File src=new File("C:\\Users\\training_b6b.01.07\\Desktop\\name.xlsx");
  FileInputStream fis= new FileInputStream(src);
  XSSWorkbook wb= new XSSFWorkbook(fis);
  XSSFWorkbook sheet1= wb.getSheetAt(0);
  
  int rowCount= sheet1.getLastRowNum();
  System.out.println("total no of rows is:"+rowCount);
  
  for(int i=1;i<=rowCount;i++)
  {
	  String firstname=sheet1.getRow(i).getCell(0).getStringCellValue();
	  System.out.println("First name is :"+firstname);
	  
	  String user=sheet1.getRow(i).getCell(1).getStringCellValue();
	  System.out.println("user is :"+user);
	  
	  String password=sheet1.getRow(i).getCell(2).getStringCellValue();
	  System.out.println("password is :"+password);
	  
	  String confpwd=sheet1.getRow(i).getCell(3).getStringCellValue();
	  System.out.println("confirm password is :"+confpwd);
	  
  }
  wb.close();
}
