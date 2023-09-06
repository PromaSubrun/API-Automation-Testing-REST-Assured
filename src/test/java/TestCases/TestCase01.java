package TestCases;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestCase01 {
	@Test
	public void TestCase01() {
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test
	public void TestCase02() {
		// baseURL = "https://reqres.in/api";
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
	}
}
