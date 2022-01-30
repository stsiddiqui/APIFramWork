package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//Perpose of this class
//it will load the Properties file
public class LoadPropertiesFile 
{
    public static Properties propertiesFile(String path) throws IOException
    {
    	File f=new File(path);
    	FileInputStream fI=new FileInputStream(f);
    	Properties pr=new Properties();
    	pr.load(fI);
    	
    	return pr;
    }
}
