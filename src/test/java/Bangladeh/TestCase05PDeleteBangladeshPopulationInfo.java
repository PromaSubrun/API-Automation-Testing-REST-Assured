package Bangladeh;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class TestCase05PDeleteBangladeshPopulationInfo {
	@Test
	public void Delete() {

		baseURI = "http://localhost:3000";

		when().patch("/Bangladeh/4").then().statusCode(204).log().all();
	}
}
