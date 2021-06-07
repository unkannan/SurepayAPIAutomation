package stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import endpoints.BaseEndpoints;
import endpoints.PostedCommentsEndPoint;

public class SearchUserPostedComments {
	private World world;
	private BaseEndpoints be = new BaseEndpoints();
	private PostedCommentsEndPoint petEndpoint = new PostedCommentsEndPoint();

	
	public SearchUserPostedComments(World world) {
		this.world = world;
	}

	@When("^I search for an user id with '(\\d+)' comments details$")
	public void search_comments_for_userId(int userid) {
		world.setResponse(petEndpoint.getPostedCommentById(world.getRequest(),userid));
	}
	 
	
	@Then("^the requests response comments has all email in correct format$")
	public void the_postedCommentsSearch_response_contains_the_correct_json_data() {
		petEndpoint.verifyCommentsEmailAreAsExpected(world.getResponse());
	}

 
}
