package restAssuredTests;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class testGet {

	@Test
	
	public void getInfo() 
	{
		
		given()
		.when().get("https://reqres.in/api/users?page=2").then().statusCode(200).assertThat().body("email", equalTo("michael.lawson@reqres.in"));
		
		
	}
	
}
