package stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import endpoints.BaseEndpoints;
import endpoints.PostedCommentsEndPoint;

public class SearchUserPostedComments {
	private World world;
	private BaseEndpoints be = new BaseEndpoints();
	private PostedCommentsEndPoint posted_comments_EndPoint = new PostedCommentsEndPoint();
	
	public SearchUserPostedComments(World world) {
		this.world = world;
	}

	@When("^I search for an user id with \\\"([^\\\"]*)\\\" comments details$")
	public void search_comments_for_userId(String userid) {
		world.setResponse(posted_comments_EndPoint.getPostedCommentById(world.getRequest(),userid));
	}
	 
	
	@Then("^the requests response comments has all email in correct format$")
	public void the_postedCommentsSearch_response_contains_the_correct_json_data() {
		posted_comments_EndPoint.verifyCommentsEmailAreAsExpected(world.getResponse());
	}
	
	@When("^the response status code should be \\\"([^\\\"]*)\\\"$")
	public void searching_Posted_Comments_For_InvalidUser(int Status_Expected) { 
		posted_comments_EndPoint.VerifyResponseStatus(Status_Expected);
	}

 
}
