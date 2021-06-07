package model;

import java.util.ArrayList;
import org.apache.commons.lang3.tuple.Pair;

public class PostedComments {
	private int postId;
	private int id;
	private String name;
	private String email;
	private String body;
	
	public PostedComments(int postId, int id, String name, String email, String body) {
		setpostId(postId);
		setId(id);
		setname(name);
		setemail(email);
		setbody(body);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setpostId(int postId) {
		this.postId = postId;
	}
	
	public int getpostId() {
		return this.postId;
	}
	
	public void setemail(String email) {
		this.email= email;
	}
	
	public String getemail() {
		return this.email;
	}
	
	public void setbody(String body) {
		this.body= body;
	}
	
	public String getbody() {
		return this.body;
	}
	
	public void setname(String name) {
		this.name= name;
	}
	
	public String getname() {
		return this.name;
	}
	
}
