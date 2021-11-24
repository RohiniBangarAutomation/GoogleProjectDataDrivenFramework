package DD_TestUtility;

import java.util.ArrayList;

import DD_Utility.Xls_Reader;

public class TestUtil {
	static Xls_Reader reader;
	public static ArrayList<Object[]> getdatafromexcel()
	{
	ArrayList<Object[]> mydata=new ArrayList<Object[]>();
	try
	{
		 reader = new Xls_Reader(
					"/Users/Mithun/Documents/AutomationClass/GoogleDataDrivenFramework/src/DD_PropertiesTestdata/facebooktestdata.xlsx");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	for(int rownum=2;rownum<=reader.getRowCount("Sheet1");rownum++)
	{
		String Username=reader.getCellData("Sheet1", "Username", rownum);
		System.out.println(Username);
		String password = reader.getCellData("Sheet1", "Password", rownum);
		System.out.println(password);
		Object[] obj= {Username,password};
		mydata.add(obj);
	}
	return mydata;

}
}
