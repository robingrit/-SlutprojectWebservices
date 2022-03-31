package com.example.demo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class RootController implements ErrorController {
	private RootService rootservice = new RootService();
	@RequestMapping(
			value = "/",
			method = RequestMethod.GET)
	public String Root() {
		return rootservice.html();
		
		/* Inte städat upp detta medvetet.
		 * return "Url Kalkylator " + "det finns 3 räknesätt plus,minus,multiplikation"
		 * +"Man använder sig av urln"
		 * +" För Addition Exempel 1: localhost:8080/rakna?raknesatt=plus&values=1&values=4&values=2 "
		 * +" för minus Exempel 2: localhost:8080/rakna?raknesatt=minus&values=1&values=4&values=2"
		 * ;
		 */
		
		
	}
	@RequestMapping(value = "/error", produces = MediaType.TEXT_HTML_VALUE)
	public String error() {
		return "No function that url please try the following<br>" + rootservice.html(); 
	}

}
