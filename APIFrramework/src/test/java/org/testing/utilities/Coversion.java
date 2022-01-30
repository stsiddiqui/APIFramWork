package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class Coversion 
{
	public static String jsonToXML(String xmlData) 
	{
		JSONObject js=XML.toJSONObject(xmlData);
		return js.toString();
		
	}
	public static String xmlTojson(String jsonData) 
	{
		JSONObject obj=new JSONObject(jsonData);
		String xml_data=XML.toString(jsonData);
		return xml_data;
	}
}
