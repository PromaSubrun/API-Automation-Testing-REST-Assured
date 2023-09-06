package TestCases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;


public class TestCase02 {

	@Test
    public void TestCase02() {
    	baseURI = "https://reqres.in/api";
		given().get("/users?page=2").then().statusCode(200);
    	given().get("/users?page=2").then().statusCode(200).body("data[1].id",equalTo(8)).log().all();

	}


	
}
