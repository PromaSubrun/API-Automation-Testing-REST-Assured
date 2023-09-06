package Source;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestCase01GetSourcePopulationInfo {

	@Test

	public void get() {
		baseURI = "http://localhost:3000";
		given().get("/Source").then().statusCode(200).log().all();

	}
}