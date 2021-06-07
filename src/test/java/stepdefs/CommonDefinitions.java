package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import endpoints.BaseEndpoints;
import endpoints.PostedCommentsEndPoint;
import io.restassured.RestAssured;

public class CommonDefinitions {
	
	private World world;
	private BaseEndpoints be = new BaseEndpoints();
	
	public CommonDefinitions(World world) {
		this.world = world;
	}
	
	@Given("^the posted comments API is available$") 
	public void user_postedComments_api_is_available() {
		String url = be.getBaseUrl();
		be.sendRequest(null, BaseEndpoints.GET_REQUEST, url, null).then().statusCode(200);
	}

}
