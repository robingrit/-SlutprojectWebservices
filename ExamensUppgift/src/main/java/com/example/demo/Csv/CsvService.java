package com.example.demo.Csv;

import java.util.ArrayList;

public class CsvService {
	
	
	public String Jsonhandler (ArrayList<CsvBean> input) {
		
		
		ArrayList<CsvBean> orders = input;
		
		int i = orders.size() - 1;
		// % Betyder placeholder för en variable s säger att variable Typen är String
		String pattern = "{ \"Orders\" : [ %s ]}"; 
		String Json= "";
		for (CsvBean csvBean : orders) {
			
			
			
			if(i-- == 0 ) {
				Json += csvBean.toJasonString();
				
			}
			else {
				Json += csvBean.toJasonString()+ ",";
				
			}
		}
		
		
		//Json = Json.replaceAll(",]","]");
		
		return String.format(pattern, Json);
		
	}

	

}
