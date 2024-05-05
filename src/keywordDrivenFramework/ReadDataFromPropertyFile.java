package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./data/configproperties");
		
		//read the data from config.properties
		Properties prop=new Properties();
		//Make the file ready to read
		prop.load(fis);
		//Read any which you want from property file
		String propertyData=prop.getProperty("Username");
		System.out.println(propertyData);
	}

}
