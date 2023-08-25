package org.testing.utilities;

import java.util.regex.Pattern;

public class repalcevalue 
{
	public static String value(String responsedata,String variablename, String variablevalue)
	{
		return responsedata.replaceAll(Pattern.quote("{{"+variablename+"}}"), variablevalue);
	}
}
