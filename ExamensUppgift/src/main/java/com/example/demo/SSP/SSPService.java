package com.example.demo.SSP;

import java.util.Random;



public class SSPService {
	String computerchoice = "";
	
	String outcome;
	
	

	public SSPService(String player) {
		super();
		
		
		computerchoice();
		match(player);
		
	}
	

	private void computerchoice() {
		
		 Random random = new Random();
	        int randomNumber = random.nextInt(3);
	        computerchoice = "";
	        
	        if (randomNumber == 0) {
	        	computerchoice= "sten";
	        	
	        	
	        }
	        else if(randomNumber == 1) {
	        	computerchoice= "sax";
	        	
	        }
	        else {
	        	computerchoice = "påse";
	        	 
	        }
	        System.out.println(computerchoice);
			

}
	public String match (String player) {
		String outcome = "";
		switch (player){
		
		case "sten":
			if(computerchoice.equals("sten")) {
				System.out.println("Det blev lika");
				setOutcome("tie");
				
				 
				
			}
			else if (computerchoice.equals("sax")) {
				System.out.println("Du Vinner"); 
				setOutcome("win");
				
			}
			else {
				System.out.println("Du förlorare");
				setOutcome("lost");
			}
			
			break;
		case "sax":
			if(computerchoice.equals("sten")) {
				System.out.println("Du fölora"); 
				setOutcome("lost");
				
				
			}
			else if (computerchoice.equals("sax")) {
				System.out.println("Det blev lika"); 
				setOutcome("tie");
				
			}
			else {
				System.out.println("Du vinner");
				setOutcome("win");
				
				
			}
			break;
		case "påse":
			if(computerchoice.equals("sten")) {
				System.out.println("Du Vinner"); 
				setOutcome("win");
				
				
				
			}
			else if (computerchoice.equals("sax")) {
				System.out.println("Du förlora"); 
				setOutcome("lost");
				
			}
			else {
				System.out.println("Det blev lika"); 
				setOutcome("tie");
			
			}
			break;
		default:
			System.out.println("error"); 
			
	
	}
		return outcome;
		
		
		
	}
	public String getOutcome() {
		return outcome;
	}


	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}
	
	public String getComputerchoice() {
		return computerchoice;
	}


	
	
}
