package com.converter.impl;

import java.text.NumberFormat;
import java.util.Locale;

import com.converter.INumberToStringConverter;
/**
 * Provides the implementation.
 * @param <T> is the integer that is converted
 */
class IntToEnStringConverter implements INumberToStringConverter<Integer>{
	
	/**
	 * The actual conversion to string of type integer
	 * @param  number an integer between 0 -999,999,999
	 * @return the equivalent number, as a String, in British English words.
	 */
	public String convert(Integer number) {
		
		//validate number if it is range
		isValid(number);
		
		if (number==0){
			return EnumWordProvider.ZERO;
		}
				
		String strWithCommas = NumberFormat.getNumberInstance(Locale.ENGLISH).format(number);
		
		String[] parts = strWithCommas.split(",");
		int lenght = parts.length;
		int internalNumber;
		StringBuilder words = new StringBuilder();
		for (int i=0;i<lenght; i++){
			internalNumber = Integer.parseInt(parts[i]);
			String part = convertNumberToWords(internalNumber);
			if (lenght==3 && i==0){
				if (part.startsWith(EnumWordProvider.END_AND_SPACE)){
					words.append(part.substring(4));
				}
				else{
					words.append(part);
				}
				
				if (part.endsWith(EnumWordProvider.SPACE)){
					words.append(EnumWordProvider.MILLION_LOWERCASE);	
				}else{
					words.append(EnumWordProvider.SPACE).append(EnumWordProvider.MILLION_LOWERCASE);	
				}
			}
			else if (lenght==2 && i==0){
				if (part.startsWith(EnumWordProvider.END_AND_SPACE)){
					words.append(part.substring(4));
				}
				else{
					words.append(part);
				}
				if (part.endsWith(EnumWordProvider.SPACE)){
					words.append(EnumWordProvider.THOUSAND_LOWERCASE);
				}
				else{
					words.append(EnumWordProvider.SPACE).append(EnumWordProvider.THOUSAND_LOWERCASE);
				}
			}
			else if (lenght==3 && i==1 && internalNumber>0){
				words.append(part);
				if (part.endsWith(EnumWordProvider.END_AND_SPACE)){
					words.append(EnumWordProvider.THOUSAND_LOWERCASE);
				}
				else{
					words.append(EnumWordProvider.SPACE).append(EnumWordProvider.THOUSAND_LOWERCASE);
				}
				
			}
			
			else{
				words.append(part);
			}
			
		}
		
		String end = words.toString();
		if (end.startsWith(EnumWordProvider.END_AND_SPACE)){
			end = end.substring(4);
		}
		return end.trim();
		
	}
	
	private String convertNumberToWords(int number){
		if (number<=99){
			return convertLessThan100ToWords(number);
		}
		else{
			return convertLessThan1000ToWords(number);
		}
	}
	
	private String convertLessThan100ToWords(int number){
		if (number<=20){
			if (number==0){
				return "";
			}
			String word = EnumWordProvider.INSTANCE.findWordByKey(number);
			StringBuilder sb = new StringBuilder();
			sb.append(EnumWordProvider.END_AND_SPACE);
			sb.append(word);
			return sb.toString();
		}
		else if (number>=20 && number<=99){
			int greatestDigit = number/10;
			greatestDigit = greatestDigit * 10;
			int remainingDigit = number%10;
			String big = EnumWordProvider.INSTANCE.findWordByKey(greatestDigit);
			String small = EnumWordProvider.INSTANCE.findWordByKey(remainingDigit);
			
			
			
			StringBuilder sb = new StringBuilder();
			sb.append(EnumWordProvider.END_AND_SPACE).append(big).append(EnumWordProvider.SPACE).append(small);
			return sb.toString();
		}
		else{
			return "";
		}
	}
	
	private String convertLessThan1000ToWords(int number){
		if (number>99 && number<1000){
			
			int greatestDigit = number/100;
			int remainingDigit = number%100;
			String big = EnumWordProvider.INSTANCE.findWordByKey(greatestDigit);
			
			String remain = convertLessThan100ToWords(remainingDigit);
			StringBuilder sb = new StringBuilder();
			sb.append(big).append(" hundred ").append(remain);
			return sb.toString();
		}
		else{
			return "";
		}
	}

	/**
	 * The validation.
	 * @return true if successful
	 */
   public boolean isValid(Integer number) throws IllegalArgumentException{
		if (number==null){
			throw new IllegalArgumentException(EnumWordProvider.ERROR_NULL_PARAMETER);

		}
		if (number<0 ||number>999999999){
			throw new IllegalArgumentException(EnumWordProvider.ERROR_RANGE_OF_VALUES);
		}
		return true;
	}
	
}
