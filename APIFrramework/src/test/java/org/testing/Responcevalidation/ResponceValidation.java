package org.testing.Responcevalidation;

import org.testing.utilities.JsonParcing;
import org.testng.Assert;

import io.restassured.response.Response;

public class ResponceValidation 
{
	public static void statusCodevalidation(int expectedResponceCode,Response res)
	{
		/*if(res.statusCode()==expectedResponceCode)
		{
			System.out.println("Status code is matchin" +res.statusCode());
		}
		else
		{
			System.err.println("Status code is not Matchin" +res.statusCode());
		}*/
		Assert.assertEquals(res.statusCode(), expectedResponceCode,"ts match");
	}
	public static void dataValidation(String expectedResponce, Response res,String jsonPath)
	{
		String actualData=JsonParcing.jsonParseUsingjsonpath(res, jsonPath);
		if(actualData.endsWith(expectedResponce))
		{
			System.out.println("Data is Matching");
		}
		else
		{
			System.out.println("Data is not Matching");
		}
}
}
