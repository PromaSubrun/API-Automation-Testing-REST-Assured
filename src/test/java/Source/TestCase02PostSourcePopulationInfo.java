package Source;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestCase02PostSourcePopulationInfo {

    @Test
	public void Post() {

		JSONObject request = new JSONObject();
		request.put("measures","Population");
		request.put("source_name","macrotrends.net");
		request.put("source_description","macrotrends.net conducts surveys of Bangladeh Population, including Similar Countries Ranked by Population");
		request.put("table_name","Bangladesh - Historical Population Data");
		request.put("dataset_link","https://www.macrotrends.net/countries/BGD/bangladesh/population");
		System.out.println(request.toJSONString());

		baseURI = "http://localhost:3000";

		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().post("/Source").then().statusCode(201).log().all();
	}
}
