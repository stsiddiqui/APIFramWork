package org.testing.testScript;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testStep.HTTPMethods;
import org.testing.utilities.JsonParcing;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4 
{
	@Test
   public void testCase4() throws IOException
   {
		Properties pr=LoadPropertiesFile.propertiesFile("../APIFrramework/URI.Properties");
		  HTTPMethods http=new HTTPMethods(pr);
		  Response res=http.getAllMethod("QA_Env_APIBatch_URI");
		  System.out.println("*******************************T6******************************");
		  System.out.println("Status Code is:");
		  System.out.println(res.getStatusCode());
		  System.out.println("Rsponce is:-");
		  System.out.println(res.asString());
		  JsonParcing.jsonParseAllkeys(res.asString(),"id");
   }
}
