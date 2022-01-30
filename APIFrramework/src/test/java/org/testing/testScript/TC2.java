package org.testing.testScript;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.Responcevalidation.ResponceValidation;
import org.testing.testStep.HTTPMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2 
{
	@Test
   public void testCase2() throws IOException
   {
	   Properties pr= LoadPropertiesFile.propertiesFile("../APIFrramework/URI.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.getMethod("QA_Env_APIBatch_URI", TC1.responceidValue);
		System.err.println("*****************************TC2**********************");
		System.out.println("responce code is:-");
		System.out.println(res.getStatusCode());
		System.out.println("Responce is:-");
		System.out.println(res.asString());
		ResponceValidation.statusCodevalidation(200, res);
		ResponceValidation.dataValidation("SHADAB", res, "fisrtname");
   }
}
