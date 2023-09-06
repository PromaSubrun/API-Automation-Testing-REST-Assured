package Bangladeh;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestCase01GetBangladeshPopulationInfo {

	@Test

	public void get() {
		baseURI = "http://localhost:3000";
		given().get("/Bangladesh").then().statusCode(200).log().all();

	}
}