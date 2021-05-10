package com.vtiger.genericresource;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @author Arvind
 *
 */
public class Javaresource
{
	Date dateobj=new Date();
	public int random()
	{
		Random r=new Random();
		int num = r.nextInt(1000);
		return num;
		
	}
	public String getcurrentsystemdate()
	{
		Date date=new Date();
		String currentdate=date.toString();
		return currentdate;
		
	}
}
