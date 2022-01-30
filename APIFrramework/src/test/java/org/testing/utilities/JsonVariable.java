package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonVariable 
{
  public static String jasonvariableName(String data,String keyname, String Keyvalue) 
  {
	  data=data.replaceAll(Pattern.quote("{{"+keyname+"}}"), Keyvalue);
	  return data;
  }
}
