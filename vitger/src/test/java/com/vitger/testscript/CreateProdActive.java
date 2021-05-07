package com.vitger.testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vitger.objectresources.Createnewproduct;
import com.vitger.objectresources.Home;
import com.vitger.objectresources.Product;
import com.vtiger.genericresource.Baseclass;
/**
 * 
 * @author Arvind
 *
 */
public class CreateProdActive extends Baseclass
{
	@Test
	public void createproductactive() throws Throwable
	{
		Home hm=new Home(driver);
		webdr.waitAndClick(hm.getProdtlink());
		hm.getProdtlink().click();
		
		Product p=new Product(driver);
		webdr.waitAndClick(p.getCreateprod());
		p.getCreateprod().click();		

		Createnewproduct cp=new Createnewproduct(driver);
		cp.getProdtname().sendKeys(excel.getexceldata("Sheet1", 1, 0)+javare.random());
		cp.getSavebtn().click();
		
		String actualresult = p.getChkproductactive().getText();
		String expected="yes";		
		Assert.assertTrue(actualresult.contains(expected));
		
	}
}
