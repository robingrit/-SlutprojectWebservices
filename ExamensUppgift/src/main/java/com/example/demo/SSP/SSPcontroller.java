package com.example.demo.SSP;




import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/stensaxpåse")
public class SSPcontroller {
	String player = "";
	
	SSPBean Valen = new SSPBean();
	
	
	
	
	
	
	@RequestMapping(path = "/", method = RequestMethod.POST )

	public String game(@RequestParam String val ) { 
		SSPService match = new SSPService(val);
		
		String svar =match.getOutcome();
		if (svar.equals("win")) {
			Valen.addWon();
		}
		else if(svar.equals("lost")) {
			Valen.addLost();
		}
		else {
			Valen.addTie();
		}
		
		
		
		 String Json = "{\"Computer move\":\""+match.getComputerchoice()+"\",\"Outcome\":\""+match.getOutcome()+"\"}";
		 return Json;
		
	}
	@RequestMapping(path = "/form", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE )
	public String myForm() {
		String htmlForm = "<html><body><h1>Välj mellan Sten, Sax eller Påse<h1><form action=\"http://localhost:8080/stensaxpåse/\"  method=\"POST\"><select name=\"val\"><option value=\"sten\">Sten</option>Värde 2: <option type=\"Sax\">Sax</option>Värde 3: <option type=\"påse\">påse</option> </select> <input type=\"submit\" value=\"Submit\"></form></body></html>";
		return htmlForm;
	}
	
	
	
	@RequestMapping(value = "/",
			method = RequestMethod.GET,
			  produces = MediaType.APPLICATION_JSON_VALUE
			)
	public String showOrdersjason() {
		String result = "";
		
		
	
		
		result = Valen.toJasonString();
		
		result = "{\"Spelet\":["+result+"]}";
		return result;	
		
	}
	
	
	
	
	
	
	

}
