package SimilarCountries;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class TestCase05PDeleteSimilarCountriesPopulationInfo {
	@Test
	public void Delete() {

		baseURI = "http://localhost:3000";

		when().patch("/SimilarCountries/4").then().statusCode(204).log().all();
	}
}
