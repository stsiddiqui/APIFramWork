package org.testing.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LoadxmlData 
{
	
  public static String readXMLdata(String path) throws IOException 
  {
	  File f=new File(path);
	  FileReader fr=new FileReader(f);
	  BufferedReader b=new BufferedReader(fr);
	  String s;
	  String data="";
	  while((s=b.readLine())!=null)
	  {
		  data=data+s;
		  //System.out.println(s);
	  }
	  return data;
			  
	  
  }
}
