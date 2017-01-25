package edu.ap.rest;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class QuotesResource extends ServerResource{
	
	@Get
	public String allQuotes(){
	    String result = "";

		try (BufferedReader br = new BufferedReader(new FileReader("oscar_wilde.txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       result = result  + line + "\n";
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
