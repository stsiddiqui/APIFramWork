package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class JsonParcing
{
   public static String jsonParse(String responce,String keyName) 
   {
	   JSONObject ob=new JSONObject(responce);
	   return ob.get(keyName).toString();
   }
   public static void jsonParseAllkeys(String responce,String keyName) 
   {
	 JSONArray js=new JSONArray(responce);
	 int L=js.length();
	 for(int i=0;i<L;i++)
	 {
		 JSONObject ob=js.getJSONObject(i);
		 System.out.println(ob.get(keyName));
	 }
   }
   public static String jsonParseUsingjsonpath(Response res,String jsonPath)
   {
	   return res.jsonPath().get(jsonPath);
   }
}
