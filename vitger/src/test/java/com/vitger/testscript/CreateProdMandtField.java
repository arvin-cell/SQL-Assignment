package com.vitger.testscript;

import org.openqa.selenium.By;
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
public class CreateProdMandtField extends Baseclass
{
	@Test
	public void createproductmandtoryfield() throws Throwable
	{
		Home hm=new Home(driver); 
		webdr.waitAndClick(hm.getProdtlink());
		hm.getProdtlink().click();
		
		Product p=new Product(driver);
		webdr.waitAndClick(p.getCreateprod());
		p.getCreateprod().click();
		
		Createnewproduct cp=new Createnewproduct(driver);
		String productName = excel.getexceldata("Sheet1", 1, 0)+javare.random();
		cp.getProdtname().sendKeys(productName);
		cp.getSavebtn().click();
		

		hm.getProdtlink().click();
		p.getserachtxt().sendKeys(productName);
		webdr.selectdropdown(driver.findElement(By.xpath("//td/div/select[@id='bas_searchfield']")), "Product Name");
		
		p.getsearch().click();
		driver.findElement(By.xpath("//table[@class='lvt small']//td/a[text()='"+productName+"']")).click();
		
		String actual = driver.findElement(By.xpath("//span[contains(text(),'Updated today')]")).getText();
		
		String expected="Updated";		
		Assert.assertTrue(actual.contains(expected));
		
	}
}
