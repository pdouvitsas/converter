package com.converter.impl;
import java.util.HashMap;
import java.util.Map;

/**
 * enumeration of all the texts needed
 * 
 */
 enum EnumWordProvider {
	INSTANCE;
	 
	public static final String SPACE = " ";
	public static final String DEFAULT_LANGUAGE = "EN";
	public static final String DEFAULT_TYPE = "INT";
	
	public static final String END_AND_SPACE = "and ";
	public static final String MILLION_LOWERCASE = "million ";
	public static final String THOUSAND_LOWERCASE = "thousand ";
	
	public static final String ZERO = "zero";
    public static final String ONE = "one";
    public static final String TWO = "two";
    public static final String THREE = "three";
    public static final String FOUR = "four";
    public static final String FIVE = "five";
    public static final String SIX = "six";
    public static final String SEVEN = "seven";
    public static final String EIGHT = "eight";
    public static final String NINE = "nine";
    public static final String TEN = "ten";
    public static final String ELEVEN = "eleven";
    public static final String TWELVE = "twelve";
    public static final String THIRTEEN = "thirteen";
    public static final String FOURTEEN = "fourteen";
    public static final String FIFTEEN = "fifteen";
    public static final String SIXTEEN = "sixteen";
    public static final String SEVENTEEN = "seventeen";
    public static final String EIGHTEEN = "eighteen";
    public static final String NINETEEN = "nineteen";
    public static final String TWENTY = "twenty";
    
    public static final String THIRTY = "thirty";
    public static final String FORTY = "forty";
    public static final String FIFTY = "fifty";
    public static final String SIXTY = "sixty";
    public static final String SEVENTY = "seventy";
    public static final String EIGHTY = "eighty";
    public static final String NINETY = "ninety";
    
    public static final String HUNDRED = "hundred";
    public static final String THOUSAND = "thousand";
    public static final String MILLION = "million";
    public static final String AND = "and";
    
    public static final String ERROR_CALL_FACTORY = "Only Integers and english translations are perimtted for the time being";
    
    public static final String ERROR_NULL_PARAMETER= "Value cannot be null";

    public static final String ERROR_RANGE_OF_VALUES = "Value should be between 0 to 999,999,999";
		
	private Map<Integer, String> allWords;
 
	private EnumWordProvider(){
		populateWords();
	}
 
	
	/**
	 * populates the hashmap allWords only in the constructor and only once
	 * 
	 */
	private void populateWords(){
		allWords=new HashMap<Integer, String>();
		allWords.put(0, ZERO);
		allWords.put(1, ONE);
		allWords.put(2, TWO);
		allWords.put(3, THREE);
		allWords.put(4, FOUR);
		allWords.put(5, FIVE);
		allWords.put(6, SIX);
		allWords.put(7, SEVEN);
		allWords.put(8, EIGHT);
		allWords.put(9, NINE);
		allWords.put(10, TEN);
		allWords.put(11, ELEVEN);
		allWords.put(12, TWELVE);
		allWords.put(13, THIRTEEN);
		allWords.put(14, FOURTEEN);
		allWords.put(15, FIFTEEN);
		allWords.put(16, SIXTEEN);
		allWords.put(17, SEVENTEEN);
		allWords.put(18, EIGHTEEN);
		allWords.put(19, NINETEEN);
		allWords.put(20, TWENTY);
		
		allWords.put(30, THIRTY);
		allWords.put(40, FORTY);
		allWords.put(50, FIFTY);
		allWords.put(60, SIXTY);
		allWords.put(70, SEVENTY);
		allWords.put(80, EIGHTY);
		allWords.put(90, NINETY);
	}
 
	public String findWordByKey(Integer key) {
		return allWords.get(key);
	}
}
