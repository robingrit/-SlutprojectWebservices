package com.example.demo.Kalkulator;

import java.util.List;

public class KalkulatorService {
	
	
	
	public String toJasonString(String result) {
		
		String pattern ="{ \"Result\":\"%s\"}";
		return String.format(pattern, result);
	}
	
	public String rakna (String raknesatt, List<Integer> values) {
		//Switch Case
		
				String Sättet = raknesatt;
			switch (Sättet) {
			  case "plus":
				  try {
						
						// Konventerar nummer String to Integer i 2 variabler
						Integer summan =0;
						
						
						for(int i=0;i<values.size();i++){
							if(i== 0) {
								
								summan += values.get(i);
							}
							else {
								
							
							 summan += values.get(i);
							
						    }
						} 
						
						// adderar ihop talen
						
						 // Skickar tillbacka svaret samt omvandlar tillbaka till string på summan.
						return toJasonString(String.valueOf(summan));
						}
						catch (Exception e) {
						      return("Something went wrong. Try using numbers insted of text");
						    } 
			    
			  case "minus":
				  try {
						Integer summan =0 ;
						
						for(int i=0;i<values.size();i++){
							if(i==0) {
								summan= values.get(i);
							   
							}
							else {
							 summan -= values.get(i);
							 
						} 
						}
						 
						return toJasonString(String.valueOf(summan));}
						catch (Exception e) {
						      return("Something went wrong. Try using numbers insted of text");
						    }

			    
			    
			  case "multiplikation":
				  try {
						Integer summan =0;
						
						for(int i=0;i<values.size();i++){
							if(i==0) {
								summan= values.get(i);
							    
							}
							
							else {
							 summan *= values.get(i);
							  
							
						} 
						}
						
						 
						return toJasonString(String.valueOf(summan));}
						catch (Exception e) {
						      return("Something went wrong. Try using numbers insted of text");
						    }
			    
			}
			return "Något blev fel välj ett av räkne sätten";
			}
	}

	


