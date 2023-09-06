package Bangladeh;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestCase03PutBangladeshPopulationInfo {

	@Test
	public void Put() {

		JSONObject request = new JSONObject();
		request.put("Continent", "SouthAsia");
		request.put("Year", "2018");
		request.put("Country", "BD");
		request.put("population", "161,793,964");
		System.out.println(request.toJSONString());

		baseURI = "http://localhost:3000";

		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().put("/Bangladeh/H-NamO4").then().statusCode(200).log().all();
	}
}
