package com.example.demo;

public class RootService {
	public String hej() {
		return "Välkommen till Rooten";
	}
	String HtmlStart = "<html><body>";
	String HtmlEnd = "</body></html>";
	String p = "<p>";
	String h1 = "<h1>";
	String h3 = "<h2>";
	String br = "<br>";
	String dokumentetion = "";
	public String html() {
		dokumentetion = HtmlStart + h1 + "Detta API har fyra funktionsgrupper: Kalkylator, SSP,bildbank och CvsToJson </h1>"
	+br + br+ h1 + Calcdoc()+ br+ SSPDoc() + br+ ImgDoc() + br+ CsvDoc()+TestingDoc()+HtmlEnd;
		
		return dokumentetion;
	}
	public String Calcdoc() {
		String rubrik = "Grupp Kalkylator (/calc)"+ br+"Räknar plus, minus och multiplikation ";
		String paragraf = 
				 "[Get] Endpoint /calc/?raknesatt=plus&values=1&values=4&values=2"+br
				+ "[Get] Endpoint /calc/?raknesatt=minus&values=1&values=4&values=2"+br
				+ "[Get] Endpoint /calc/?raknesatt=multiplikation&values=1&values=4&values=2"+br
				+ "> Query parameter values [List<Integer>]"+br
				+ "> Query parameter values [List<Integer>]"+ br
				+ "> Query parameter values [List<Integer>]"+ br
				+ "< Returns Json => { \"result\": Svaret }"+br
				;
		String text =dokmentStruckture(rubrik ,paragraf);
		
		
		return text;
		
	}
	public String SSPDoc(){
		String rubrik = "Grupp SSP (/stensaxpåse)"+ br
				+ "Spelar Sten, sax och påse";
		
		String paragraf = "[GET] Endpoint /stensaxpåse/"+ br
				+ "! Visar resultat av pågående match" +br
				+ "> Inga parameterar" +br
				+ "< Returns Json => { \"wins\": value, \"losses\": value }"+br
				+br+ "[POST] Endpoint /stensaxpåse/form " +br
						+ "! Gör ett drag" + br
						+ "> header: Content-Type = application/x-www-form-urlencoded"+ br 
						+ "> body parameter: choice [String] - valid values are sten, sax, påse"+ br
						+ "< Returns Json => { \"Computer move\": value, \"Winner\": value }"+ br+ br
						;
		String text =dokmentStruckture(rubrik ,paragraf);
		return text;
	}
	public String ImgDoc(){
		String rubrik = "Grupp img (/img)";
		String paragraf = "[GET] Endpoint /img" + br+ "Visar en random bild på bär det random mellan 2 bilder" + br+
				"< Returns Image ";
		String text =dokmentStruckture(rubrik ,paragraf);
		return text;
		
	}
	public String CsvDoc() {
		String rubrik = "Grupp Csv (/showCsvFileJson)";
		String paragraf = "[GET] Endpoint /showCsvFileJson" + br+ "Visar Csv fil i Jsonformat" + br+
				 "> Inga parameterar" +br+
				"< Returns Cvs in Json ";
		String text =dokmentStruckture(rubrik ,paragraf);
		return text;
	}
	public String TestingDoc() {
		String rubrik = "Kalkulator Testing "; 
		String paragraf = "Testing finns för de olika räknesätten ser om de fungerar"+ br+"Endpoint testing finns även till kalkulatorn";
		String text =dokmentStruckture(rubrik ,paragraf);
		return text;
	}
	
	public String dokmentStruckture(String text, String paragraf) {
		dokumentetion =  h3 + text+"</h2>" 
	+br + p +paragraf+ "</p>";
		
		return dokumentetion;
	}

}
