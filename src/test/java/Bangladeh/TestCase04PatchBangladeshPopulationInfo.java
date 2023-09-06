package Bangladeh;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestCase04PatchBangladeshPopulationInfo {
	@Test
	public void Patch() {

		JSONObject request = new JSONObject();

		request.put("Continent", "SouthAsia");

		System.out.println(request.toJSONString());

		baseURI = "http://localhost:3000";

		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().patch("/Bangladeh/3").then().statusCode(200).log().all();
	}
}
