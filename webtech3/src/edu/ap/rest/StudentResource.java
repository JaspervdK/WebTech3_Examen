package edu.ap.rest;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONObject;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class StudentResource extends ServerResource {
	@Get
	public String retVal() {

		return "ok";
	}
	
	@Post("txt")
	public void newRegistration(String json){
		JSONObject newRegistration = new JSONObject(json);
		String datehour = newRegistration.getString("datehour");
	    String name = newRegistration.getString("name");
	    String birthdate = newRegistration.getString("birthdate");
	    String nurse = newRegistration.getString("nurse");
	    String diagnose = newRegistration.getString("diagnose");
	    
	    try( FileWriter fw = new FileWriter("filename.txt", true);
	    	BufferedWriter bw = new BufferedWriter(fw);
	    	PrintWriter out = new PrintWriter( bw )  ){
	        out.println("{");
	        out.println("New registration: ");
	    	out.println( "Date and hour: " + datehour );
	        out.println( "Name: " + name );
	        out.println( "Birthdate: " + birthdate );
	        out.println( "Name Nurse: " + nurse );
	        out.println( "Diagnose: " + diagnose );
	        out.println("}");
	        out.println();
	    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}