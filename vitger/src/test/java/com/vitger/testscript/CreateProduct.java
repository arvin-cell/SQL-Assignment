package com.vitger.testscript;

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
public class CreateProduct extends Baseclass
{
	
	@Test
	public void createProduct() throws Throwable
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
	
	webdr.moveToExpectedElemnet(driver, hm.getAdminimg());
	hm.getAdminimg().click();
	hm.getSignout().click();
	}
}
