package org.testing.teststeps;

import java.util.Properties;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class httpmethod 
{
	 static Properties pr;
	public httpmethod(Properties pr)
	{
		this.pr=pr;
	}
	public static void post(String urikeyname, String responsedata)
	{
		String urivalue=pr.getProperty(urikeyname);
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(responsedata)
				.when()
				.post(urivalue);
		
		System.out.println(res.statusCode());
		System.out.println(res.asString());
	}
}
