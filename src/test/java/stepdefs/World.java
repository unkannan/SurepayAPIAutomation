package stepdefs;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.PostedComments;

public class World {
	private Response response;
	private RequestSpecification request;
	private PostedComments postedcomments;

	public void setResponse(Response response) {
		this.response = response;
	}
	
	public Response getResponse() {
		return this.response;
	}
	
	public void setRequest(RequestSpecification request) {
		this.request = request;
	}

	public RequestSpecification getRequest() {
		return this.request;
	}
	
	public void setPet(PostedComments postedcomments) {
		this.postedcomments = postedcomments;
	}
	
	public PostedComments getPet() {
		return this.postedcomments;
	}
}
