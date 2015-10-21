package com.converter.impl;

import com.converter.INumberToStringConverter;

/**
 * factory class
 * @param  typeOfNumber what type of number to convert, default value "INT" (for Integer values)
 * @param  language the language that the number is going to be translated, default value "EN" (for British English words)
 */
public class NumberToStringFactory {
	  public static INumberToStringConverter createConverter (String typeOfNumber, String language) {
	  if (typeOfNumber==null){
		  typeOfNumber = EnumWordProvider.DEFAULT_TYPE;
	  }
	  if (language ==null){
		  language = EnumWordProvider.DEFAULT_LANGUAGE;
	  }
	  
	  if (EnumWordProvider.DEFAULT_TYPE.equals(typeOfNumber) && EnumWordProvider.DEFAULT_LANGUAGE.equals(language)){
		  return new IntToEnStringConverter();
	  }
	 throw new IllegalArgumentException(EnumWordProvider.ERROR_CALL_FACTORY);

	  
      }
}
