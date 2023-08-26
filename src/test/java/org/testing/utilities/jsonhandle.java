package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class jsonhandle 
{
	public static String loadjsonfile(String filepath) throws FileNotFoundException
	{
		File f=new File(filepath);
		FileInputStream fs=new FileInputStream(f);
		JSONTokener jt=new JSONTokener(fs);
		JSONObject j=new JSONObject(jt);
		return j.toString();
	}
}
