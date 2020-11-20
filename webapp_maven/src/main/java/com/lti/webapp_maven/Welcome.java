package com.lti.webapp_maven;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class Welcome {

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Hello REST Api";
	}
}
