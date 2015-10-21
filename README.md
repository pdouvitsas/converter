How to use

The following factory can be called            
INumberToStringConverter<Integer> integerConverter = NumberToStringFactory.createConverter(null, null);

and the following function that converts a number,to a String, in British English words.     
String convertedWord = integerConverter.convert(number);

It is a maven build project. It is a Java library that could be packaged as a jar (javadoc can also be generated)

