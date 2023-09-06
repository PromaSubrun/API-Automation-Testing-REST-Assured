package Bangladeh;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestCase02PostBangladeshPopulationInfo {

    @Test
	public void Post() {

		JSONObject request = new JSONObject();
		request.put("Country", "Bangladesh");
		request.put("Continent", "South Asia");
		request.put("Year", "2018");
		request.put("population", "163,683,958");
		System.out.println(request.toJSONString());

		baseURI = "http://localhost:3000";

		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().post("/Bangladesh").then().statusCode(201).log().all();
	}
}
