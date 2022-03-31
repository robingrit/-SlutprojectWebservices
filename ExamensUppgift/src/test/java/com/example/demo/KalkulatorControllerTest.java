package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.demo.Kalkulator.KalkulatorController;


public class KalkulatorControllerTest {
	private KalkulatorController sut;
	@BeforeAll
	public void setUp() {
		 this.sut = new KalkulatorController();
		
	}

	@Test
	public void testplus() {
		List<Integer> values = new ArrayList<Integer>();
		values.add(2);
		values.add(3);
		values.add(3);
		
		String actual = sut.rakna( "plus", values);
		String expected = "Summan av alla värden 2 + 3 + 3= 8";
		//kollar om det stämmer
		assertEquals(expected, actual);
	}
	@Test
	public void testminus() {
		List<Integer> values = new ArrayList<Integer>();
		values.add(2);
		values.add(3);
		values.add(3);
		
		String actual = sut.rakna( "minus", values);
		String expected = "Differensen mellan 2 - 3 - 3 = -4";
		//kollar om det stämmer
		assertEquals(expected, actual);
	}
	@Test
	public void testmultiplikationFail() {
		List<Integer> values = new ArrayList<Integer>();
		values.add(91232);
		values.add(123123);
		
		
		String actual = sut.rakna( "multiplikation", values);
		String expected = " Produkten av 91232 * 123123 = 11232757536";
		//kollar om det stämmer
		assertNotEquals(expected, actual);
	}
	@Test
	public void testmultiplikationSuccses() {
		List<Integer> values = new ArrayList<Integer>();
		values.add(3);
		values.add(3);
		
		
		String actual = sut.rakna( "multiplikation", values);
		String expected = " Produkten av 3 * 3 = 9";
		//kollar om det stämmer
		assertEquals(expected, actual);
	}

}
