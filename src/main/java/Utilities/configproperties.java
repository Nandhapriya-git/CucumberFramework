package Utilities;

import java.io.File;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class configproperties {
	
	public Properties intializeproperties() {
		
		Properties prop = new Properties();
		File file= new File("user.dir"+"\\src\\test\\resources\\config.properties");
		
		try {
			FileInputStream fin= new FileInputStream(file);
			prop.load(fin);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return prop;
	}

}
