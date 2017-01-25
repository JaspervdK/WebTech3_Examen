package edu.ap.rest;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class SearchQuotesResource extends ServerResource{
	
	@Get
	public String returnQuotes(String search){
		return "hello, world 2";
	}
	
	@Post("txt")
	public void searchQuotes(String searchTerm){
		
	}

}
