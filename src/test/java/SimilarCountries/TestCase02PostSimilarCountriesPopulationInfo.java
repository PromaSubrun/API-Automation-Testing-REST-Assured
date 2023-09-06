package SimilarCountries;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestCase02PostSimilarCountriesPopulationInfo {

    @Test
	public void Post() {

		JSONObject request = new JSONObject();
		request.put("Country","Bangladesh");
		request.put("Year","2023");
		request.put("population", "161,793,964");
		System.out.println(request.toJSONString());

		baseURI = "http://localhost:3000";

		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().post("/SimilarCountries").then().statusCode(201).log().all();
	}
}
