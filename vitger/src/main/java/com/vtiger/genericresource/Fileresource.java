package com.vtiger.genericresource;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author Arvind
 *
 */
public class Fileresource
{
	/**
	 * 
	 * @param key
	 * @return Returns value according to key from property file
	 * @throws Exception
	 */

	public String getpropertyfile(String key) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(Pathresourcse.profilepath);
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value; 
		
	}

}
