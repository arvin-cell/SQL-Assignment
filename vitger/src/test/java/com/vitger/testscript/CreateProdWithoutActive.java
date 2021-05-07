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
public class CreateProdWithoutActive extends Baseclass
{
	@Test
	public void createproductwhithoutactive() throws Throwable
	{
		Home hm=new Home(driver);
		webdr.waitAndClick(hm.getProdtlink());
		hm.getProdtlink().click();
		
		Product p=new Product(driver);
		webdr.waitAndClick(p.getCreateprod());
		p.getCreateprod().click();		

		Createnewproduct cp=new Createnewproduct(driver);
		cp.getProdtname().sendKeys("acer4");
		p.getChkbox().click();
		cp.getSavebtn().click();
		
		String actualresult = p.getChkproductactive().getText();
		String expected="no ";		
		Assert.assertTrue(actualresult.contains(expected));
		
	}
}
