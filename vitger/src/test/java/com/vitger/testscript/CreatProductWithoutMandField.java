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
public class CreatProductWithoutMandField extends Baseclass
{
	@Test
	
	public void creatproductwthoutmandtoryfield() throws Throwable
	{
		Home hm=new Home(driver);
		webdr.waitAndClick(hm.getProdtlink());
		hm.getProdtlink().click();
		
		Product p=new Product(driver);
		webdr.waitAndClick(p.getCreateprod());
		p.getCreateprod().click();
		

		Createnewproduct cp=new Createnewproduct(driver);
		cp.getSavebtn().click();
		webdr.alerttAccept(driver);
		

		webdr.moveToExpectedElemnet(driver, hm.getAdminimg());
		hm.getAdminimg().click();
		hm.getSignout().click();
	}
}
