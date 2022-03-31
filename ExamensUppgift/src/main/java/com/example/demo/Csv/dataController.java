package com.example.demo.Csv;


import java.io.IOException;




import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dataController {
	
	CsvBean csvBean;
	

	
	
	
	@RequestMapping(
			value = "/showCsvFileJson",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public  String showCsvFileJason3(HttpServletResponse response) throws IOException {
		
         csvFileReader myReader = new csvFileReader();
         
         
		 String Json = myReader.readFile("sample.csv");		 		
		
		return Json;
	}}
	


