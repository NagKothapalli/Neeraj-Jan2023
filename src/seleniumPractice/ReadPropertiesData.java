package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesData
{
	public static String readData(String key) throws IOException
	{
		FileInputStream myfile = new FileInputStream("TestData/DevData.properties");//news papaer
		Properties prop = new Properties(); // news reader
		prop.load(myfile);
		String a = prop.getProperty(key);
		return a;
	}

}
