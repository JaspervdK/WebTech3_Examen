package edu.ap.rest;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class StudentApplication extends Application {

	@Override
	public synchronized Restlet createInboundRoot(){
		Router router = new Router(getContext());
		
		router.attach("/studentsTable", StudentResource.class);
		
		return router;
	}
    

}