package org.testing.testScript;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.Responcevalidation.ResponceValidation;
import org.testing.testStep.HTTPMethods;
import org.testing.utilities.Json;
import org.testing.utilities.JsonParcing;
import org.testing.utilities.JsonVariable;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.RandomData;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1 
{
	static String responceidValue;
	@Test
   public void testCase1() throws IOException 
   {
	String bodyData=Json.loadjsonFile("../APIFrramework/src/test/java/org/testing/payload/bodydata.json");
	String randomID=RandomData.random();
	bodyData=JsonVariable.jasonvariableName(bodyData,"id",randomID);
	//System.out.println(bodyData);
	Properties pr= LoadPropertiesFile.propertiesFile("../APIFrramework/URI.Properties");
	HTTPMethods http=new HTTPMethods(pr);
	Response res=http.PostMethod(bodyData,"QA_Env_APIBatch_URI");
	System.out.println("**********************TC1****************************************");
	System.out.println("responce code is:-");
	System.out.println(res.getStatusCode());
	System.out.println("Responce is:-");
	System.out.println(res.asString());
	responceidValue=JsonParcing.jsonParse(res.asString(),"id");
	ResponceValidation.statusCodevalidation(201, res);
	//System.out.println(bodyData);
	
	
	
}
}
