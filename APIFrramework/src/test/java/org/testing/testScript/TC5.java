package org.testing.testScript;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testStep.HTTPMethods;
import org.testing.utilities.Json;
import org.testing.utilities.JsonVariable;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC5 
{
	@Test
   public void testCase5() throws IOException
   {
	   Properties pr=LoadPropertiesFile.propertiesFile("../APIFrramework/URI.Properties");
	   String bodyData=Json.loadjsonFile("../APIFrramework/src/test/java/org/testing/payload/bodydataupdate.json");
	   bodyData=JsonVariable.jasonvariableName(bodyData, "id", TC1.responceidValue);
	   HTTPMethods http=new HTTPMethods(pr);
	   Response res=http.updateMethod("QA_Env_APIBatch_URI",TC1.responceidValue,bodyData);
	   System.out.println("********************T5*******************************");
	   System.out.println("Responce code is:-");
	   System.out.println(res.getStatusCode());
	   System.out.println("Responce is:-");
	   System.out.println(res.asString());
	   
   }
}
