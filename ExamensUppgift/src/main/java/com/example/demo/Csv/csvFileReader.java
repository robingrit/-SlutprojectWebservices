package com.example.demo.Csv;

import org.springframework.core.io.ClassPathResource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;

public class csvFileReader {
	CsvService csvService = new CsvService();

	
	
	public String readFile(String fileName ) throws FileNotFoundException, IOException 
	{
		var csvFile = new ClassPathResource(fileName);
		ArrayList<CsvBean> result = new ArrayList<CsvBean>();
		String Json = "";
		
		try (Scanner myScanner = new Scanner(csvFile.getFile())) {
			while(myScanner.hasNextLine())
			{
				result.add(processLine(myScanner.nextLine()));
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		 
		
		Json =csvService.Jsonhandler(result);												 		
		return Json;
	}
	
	
	
	public CsvBean processLine(String textLine) {
		
		
		
		
		String[] fields = textLine.split("[,]");
		
		String orderDate = fields[0];
		String region = fields[1];
	    String rep1 = fields[2];
		String rep2 = fields[3];
		String item = fields[4];
		String units = fields[5];
	    String unitCost = fields[6];
		String total = fields[7];
		
		CsvBean oneRow = new CsvBean(orderDate,region,rep1,rep2,item,units,unitCost,total);
		
		return oneRow;
	
}}
