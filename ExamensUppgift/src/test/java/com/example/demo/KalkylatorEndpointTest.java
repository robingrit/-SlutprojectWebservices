package com.example.demo;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.demo.HttpHelper.httpHelper;



public class KalkylatorEndpointTest {

	private String sut;

	@BeforeAll
	public void setUp() throws Exception {
		sut = "http://localhost:8080";
	}

	@Test
	public void testControllerService() throws IOException {
		String baseText = "hej";
		

		String testData = "plus";
		String expectedData = "Summan av alla värden 1 + 5= 6";
		String testData2 = "&values=1&values=5";
		
		String expected =  expectedData;
		
		String notExpected = expected + " not match";

		String url = sut + "/rakna";
		String params = "?raknesatt=" + testData + testData2;
		String query = url + params;
		String actual = httpHelper.UrlResponse(query, "GET", null);
		
		assertEquals(actual, expected);
		assertNotEquals(actual, baseText);
		
		assertNotEquals(actual, notExpected);
	}
}


