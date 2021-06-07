package endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.PostedComments;
import stepdefs.World;
import org.apache.commons.validator.routines.EmailValidator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

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

	public Response getPostedCommentById(RequestSpecification request, int id) {
		String url = getBaseUrl() + getPostPath() + id + this.getPath() ;
		return sendRequest(request, BaseEndpoints.GET_REQUEST, url, null);
	}

	public void verifyCommentsEmailAreAsExpected(Response response) {
		//String expectedPhotoUrls[] = pet.getPhotoUrls();
		String idVal = response.jsonPath().getString("email");
		System.out.println(idVal);
		//verifyTrue(idVal != null);
		
		//verifyTrue(!idVal.equalsIgnoreCase(""));
		//verifyTrue(idVal.contains("@"));
		//boolean valid = EmailValidator.getInstance().isValid(idVal);
		//System.out.println(valid);
		//idVal.replaceAll("[","");
		//idVal.replaceAll("]","");
	
		List < String > listToConvert = Arrays.asList(idVal.split(","));
		 for (String s: listToConvert) {
			 s=s.replace("[", "");
			 s=s.replace("]", "");
			   System.out.println(s);
			 //  EmailValidator validator = EmailValidator.getInstance();
			  // System.out.println(validator.isValid(s));
			  }
	}

}
