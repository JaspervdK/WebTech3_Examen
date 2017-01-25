package edu.ap.rest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.restlet.resource.ClientResource;

public class StudentClient {

    // http://hc.apache.org/
     public static void main(String[] args) {
           
             try {
            	ClientResource resource = new ClientResource("http://127.0.0.1:8181/students/studentsTable");
            	
            	JSONObject json1 = new JSONObject();
            	json1.put("datehour", "25/01/2017 13:00");
            	json1.put("name", "Jasper van de Kant");
            	json1.put("birthdate", "04/12/1992");
            	json1.put("nurse", "Jan Janssen");
            	json1.put("diagnose", "Van alles mee mis.");
            	System.out.println(json1.toString());
            	resource.post(json1.toString());
            	
            	JSONObject json2 = new JSONObject();
            	json2.put("datehour", "25/01/2017 14:00");
            	json2.put("name", "Gerry Berry");
            	json2.put("birthdate", "21/1/1995");
            	json2.put("nurse", "Sanne Panne");
            	json2.put("diagnose", "Gebroken arm.");
            	resource.post(json2.toString());

            }
            catch (Exception e) {
            	System.out.println("In main : " + e.getMessage());
            }
        }
    }
