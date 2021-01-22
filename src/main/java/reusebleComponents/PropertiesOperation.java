package reusebleComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

import bsh.StringUtil;

public class PropertiesOperation {
	
	public static Properties prop=new Properties();
	public static String getpropertyValueBYKey(String keyValue) throws Exception
	{
		String propFilePath=System.getProperty("user.dir")+"/src/test/resources/config.properties";
		FileInputStream fis=new FileInputStream(propFilePath);
		prop.load(fis);
		 String value=(String) prop.get(keyValue);
		
		 if(StringUtils.isEmpty(value))
		 {
			 throw new Exception("Value is not specifed for key: "+value +" in properties file.");
		 }
		 return value;
	}
}
