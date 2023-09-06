package Source;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestCase04PatchSourcePopulationInfo {
	@Test
	public void Patch() {

		JSONObject request = new JSONObject();

		request.put("source_name","macrotrends.net");

		System.out.println(request.toJSONString());

		baseURI = "http://localhost:3000";

		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().patch("/Source/2").then().statusCode(200).log().all();
	}
}
