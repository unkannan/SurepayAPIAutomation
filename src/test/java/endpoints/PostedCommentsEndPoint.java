package endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.PostedComments;
import stepdefs.World;
import util.HelperClass;

import org.apache.commons.validator.routines.EmailValidator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.validator.routines.EmailValidator;

public class PostedCommentsEndPoint extends BaseEndpoints{
	private final String POSTCOMMENT_ENDPOINT_PATH = "/comments";
	private final String POST_ENDPOINT_PATH="posts/";
	
	public PostedCommentsEndPoint() {
		super();
	}

	public String getPath() {
		return this.POSTCOMMENT_ENDPOINT_PATH;
	}
	public String getPostPath() {
		return this.POST_ENDPOINT_PATH;
	}
	
	/*public void verifyResponseStatusValue() {
		String url = getBaseUrl();
		be.sendRequest(null, BaseEndpoints.GET_REQUEST, url, null).then().statusCode(200);
		sendRequest(null, BaseEndpoints.GET_REQUEST, url, null).then().statusCode(200);
		assertThat(response.getStatusCode(), is(expectedCode));
	}*/

	public Response getPostedCommentById(RequestSpecification request, String id) {
		String url = getBaseUrl() + getPostPath() + id + this.getPath() ;
		System.out.println(url);
		return sendRequest(request, BaseEndpoints.GET_REQUEST, url, null);
	}

	public void verifyCommentsEmailAreAsExpected(Response response) {
		String idVal = response.jsonPath().getString("email");
		idVal=idVal.replace("[", "");
		idVal=idVal.replace("]", "");
		 
		List < String > listToConvert = Arrays.asList(idVal.split(","));
		 for (String emailId: listToConvert) {
			  verifyTrue(HelperClass.validEmail(emailId));
			   
			  }
	}
}
