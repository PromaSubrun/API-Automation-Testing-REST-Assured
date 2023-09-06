package TestCases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestOnLocalApi {

	@Test

	public void get() {
		baseURI = "http://localhost:3000";
		given().get("/users").then().statusCode(200).log().all();

	}

	// @Test
	public void Post() {

		JSONObject request = new JSONObject();
		request.put("firstName", "Bode");
		request.put("lastName", "Locke");
		request.put("subjectId", "1");
		System.out.println(request.toJSONString());

		baseURI = "http://localhost:3000";

		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().post("/users").then().statusCode(201).log().all();
	}

	@Test
	public void Put() {

		JSONObject request = new JSONObject();
		request.put("firstName", "Duncan");
		request.put("lastName", "Locke");
		request.put("subjectId", "2");
		System.out.println(request.toJSONString());

		baseURI = "http://localhost:3000";

		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().put("/users/W9393VZ").then().statusCode(200).log().all();
	}

	@Test
	public void Patch() {

		JSONObject request = new JSONObject();

		request.put("firstName", "Bode");

		System.out.println(request.toJSONString());

		baseURI = "http://localhost:3000";

		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().patch("/users/W9393VZ").then().statusCode(200).log().all();
	}

	@Test
	public void Delete() {

		baseURI = "http://localhost:3000";

		when().patch("/users/4").then().statusCode(204).log().all();
	}

}
