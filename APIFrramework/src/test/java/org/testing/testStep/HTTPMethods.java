package org.testing.testStep;

import static io.restassured.RestAssured.*;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPMethods 
{
	Properties pr;
	public HTTPMethods(Properties pr) 
	{
	    this.pr=pr;
	}
   public Response PostMethod(String bodydata,String UriKey)
   {
	   Response res=
			   given()
	   .contentType(ContentType.JSON)
	   .body(bodydata)
	   .when()
	   .post(pr.getProperty(UriKey));
	   System.out.println("Staus code is:-" +res.statusCode());
	   return res;
   }
   public Response getMethod(String Urikey,String id) 
   {
	   String uri=pr.getProperty(Urikey)+"/"+id;
	   Response res=
	   given().contentType(ContentType.JSON)
	   .when().get(uri);
	   
	   return res;
   }
   public Response getAllMethod(String Urikey) 
   {
	   String uri=pr.getProperty(Urikey);
	   Response res=
	   given().contentType(ContentType.JSON)
	   .when().get(uri);
	   return res;
   }
   public Response updateMethod(String Urikey,String id,String bodyData)
   {
	   String uri=pr.getProperty(Urikey)+"/"+id;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(bodyData)
				.when()
				.put(uri);
				
				return res;
	   /*Response res=
			   given()
	   .contentType(ContentType.JSON)
	   .body(bodydata)
	   .when().put(pr.getProperty(Urikey));
	   System.out.println("Staus code is:-" +res.statusCode());
	   return res;*/
  }
   public Response deleteMethod(String Urikey,String id)
   {
	   String uri=pr.getProperty(Urikey)+"/"+id;
	   Response res=
			   given()
	   .contentType(ContentType.JSON)
	   .when().delete(uri);
	   System.out.println("Staus code is:-" +res.statusCode());
	   return res;
   }
}
