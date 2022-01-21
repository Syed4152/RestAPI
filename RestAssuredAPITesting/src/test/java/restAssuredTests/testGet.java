package restAssuredTests;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class testGet {

	@Test
	
	public void getInfo() 
	{
 RestAssured.baseURI = "https://rahulshettyacademy.com";
 
 given().queryParam("key", "qa123").header("Content-Type", "application/json;charset=UTF-8")
 .body("{\r\n"
 		+ "  \"location\": {\r\n"
 		+ "    \"lat\": -38.383447,\r\n"
 		+ "    \"lng\": 33.427362\r\n"
 		+ "  },\r\n"
 		+ "  \"accuracy\": 50,\r\n"
 		+ "  \"name\": \"Frontline house\",\r\n"
 		+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
 		+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
 		+ "  \"types\": [\r\n"
 		+ "    \"shoe park\",\r\n"
 		+ "    \"shop\"\r\n"
 		+ "  ],\r\n"
 		+ "  \"website\": \"http://google.com\",\r\n"
 		+ "  \"language\": \"French-IN\"\r\n"
 		+ "}\r\n"
 		+ "")
 .when().post("maps/api/place/add/json")
 .then().assertThat().statusCode(200);
		
		
		
	}
	
}
