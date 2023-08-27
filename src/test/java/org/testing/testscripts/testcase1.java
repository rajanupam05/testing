package org.testing.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.teststeps.httpmethod;
import org.testing.utilities.jsonhandle;
import org.testing.utilities.propertieshandle;
import org.testing.utilities.repalcevalue;
import org.testng.annotations.Test;

public class testcase1 
{
	@Test
	public static void tc1() throws FileNotFoundException, IOException
	{
		Properties pr=propertieshandle.loadpropertieshandle("../third/uri.properties");
		String data=jsonhandle.loadjsonfile("../third/src/test/java/org/testing/resources/request.payload.json");
		Random r=new Random();
		Integer input=r.nextInt();
		String responsebody=repalcevalue.value(data, "id", input.toString());
		httpmethod http=new httpmethod(pr);
		http.post("uri3", responsebody);
	}
}
