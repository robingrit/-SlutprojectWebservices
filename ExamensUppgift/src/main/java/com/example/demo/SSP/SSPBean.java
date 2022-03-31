package com.example.demo.SSP;





public class SSPBean {
	
	
	
	private int won;
	private int lost;
	private int tie;
	
	private String computerchoice;
	
	
	
	
	
	



	public SSPBean() {
		// TODO Auto-generated constructor stub
	}



	
	public String toJasonString() {
		String pattern ="{ \"games\":\"%s\", \"wins\":\"%s\", \"losses\":\"%s\", \"ties\": \"%s\"}";
		return String.format(pattern, getGames(),getWon(), getLost(), getTie());
	}



	public int getWon() {
		return won;
	}
	
	



	public String getComputerchoice() {
		return computerchoice;
	}



	public void setComputerchoice(String computerchoice) {
		this.computerchoice = computerchoice;
	}



	public void addWon() {
		this.won++;
	}



	public int getLost() {
		return lost;
	}

	public int getGames() {
		return getWon() + getLost() + getTie();
	}


	public void addLost() {
		this.lost++;
	}



	public int getTie() {
		return tie;
	}



	public void addTie() {
		this.tie++;
	}
	      
	}

		

