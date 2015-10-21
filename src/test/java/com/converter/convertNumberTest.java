package com.converter;

import org.junit.Test;

import com.converter.INumberToStringConverter;
import com.converter.impl.NumberToStringFactory;

import static org.junit.Assert.assertEquals;

public class convertNumberTest {

	
	INumberToStringConverter<Integer> integerConverter = NumberToStringFactory.createConverter(null, null);

	//first all the single digits
	@Test
	public void convert0() {
		int number = 0;
		String word = "zero";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	@Test
	public void convert1() {
		int number = 1;
		String word = "one";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	@Test
	public void convert2() {
		int number = 2;
		String word = "two";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	@Test
	public void convert3() {
		int number = 3;
		String word = "three";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	@Test
	public void convert4() {
		int number = 4;
		String word = "four";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	@Test
	public void convert5() {
		int number = 5;
		String word = "five";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	@Test
	public void convert6() {
		int number = 6;
		String word = "six";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	@Test
	public void convert7() {
		int number = 7;
		String word = "seven";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	@Test
	public void convert8() {
		int number = 8;
		String word = "eight";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	@Test
	public void convert9() {
		int number = 9;
		String word = "nine";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	//some tests with two digits
	@Test
	public void convert12() {
		int number = 12	;
		String word = "twelve";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	@Test
	public void convert18() {
		int number = 18	;
		String word = "eighteen";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	@Test
	public void convert99() {
		int number = 99	;
		String word = "ninety nine";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	//some digits with 3 numbers
	@Test
	public void convert100() {
		int number = 100	;
		String word = "one hundred";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	@Test
	public void convert111() {
		int number = 111	;
		String word = "one hundred and eleven";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	@Test
	public void convert999() {
		int number = 999	;
		String word = "nine hundred and ninety nine";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	//some digits with 4 numbers
	@Test
	public void convert1000() {
		int number = 1000	;
		String word = "one thousand";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	@Test
	public void convert1005() {
		int number = 1005	;
		String word = "one thousand and five";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	//some digits with 5 numbers
	@Test
	public void convert10000() {
		int number = 10000	;
		String word = "ten thousand";
		
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	@Test
	public void convert10001() {
		int number = 10001	;
		String word = "ten thousand and one";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);

	}
	
	@Test
	public void convert11111() {
		int number = 11111	;
		String word = "eleven thousand one hundred and eleven";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	//some digits with 6 numbers
	@Test
	public void convert1000000() {
		int number = 100000	;
		String word = "one hundred thousand";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
		
	}
	
	//some digits with 6 numbers
	@Test
	public void convert1010000() {
		int number = 101000	;
		String word = "one hundred and one thousand";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	//some digits with 7 numbers
	@Test
	public void convert10000000() {
		int number = 1000000	;
		String word = "one million";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	@Test
	public void convert10100001() {
		int number = 1010001	;
		String word = "one million and ten thousand and one";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	//some digits with 8 numbers
	@Test
	public void convert100000000() {
		int number = 10000000	;
		String word = "ten million";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	@Test
	public void convert10010001() {
		int number = 10010001	;
		String word = "ten million and ten thousand and one";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	@Test
	public void convert56945781() {
		int number = 56945781	;
		String word = "fifty six million nine hundred and forty five thousand seven hundred and eighty one";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	//some digits with 9 numbers
	@Test
	public void convert999999999() {
		int number = 999999999	;
		String word = "nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine";
		String convertedWord = integerConverter.convert(number);
		assertEquals(word, convertedWord);
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void negativeNumber() {
		int number = -2	;
		String convertedWord = integerConverter.convert(number);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void nullNumber() {
		Integer number = null;
		String convertedWord = integerConverter.convert(null);
	}
	
}


