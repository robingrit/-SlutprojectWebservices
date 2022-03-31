package com.example.demo.Kalkulator;


import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calc")
public class KalkulatorController {
	private KalkulatorService kalkservice = new KalkulatorService();
	
	@GetMapping("/")
	// Tar emot 3 Stringar 
	public String rakna(String raknesatt, @RequestParam List<Integer> values) {
		
		return kalkservice.rakna(raknesatt, values);
 
	}
	
	
	
		
	
	
	
	

}
