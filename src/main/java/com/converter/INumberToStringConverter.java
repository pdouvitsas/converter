package com.converter;

/**
 * Provides the interface.
 * @param <T> is the number type
 */
public interface INumberToStringConverter<T> {
	/**
	 * The conversion to string of type T.
	 * @return the converted value
	 */
	String convert(T number) throws IllegalArgumentException;
	/**
	 * The validation of type T
	 * @return the if the validation is successful
	 */
	boolean isValid(T number)throws IllegalArgumentException;
}
