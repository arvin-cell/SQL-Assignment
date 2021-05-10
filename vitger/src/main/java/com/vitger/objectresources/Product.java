package com.vitger.objectresources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Arvind
 *
 */
public class Product 
{

	public Product(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createprodlink;
	
	@FindBy(xpath="//span[@id='dtlview_Product Active']")
	private WebElement chkproductactive;
	
	@FindBy(name="discontinued")
	private WebElement chkbox;
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchtxt;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement search;
	
	public WebElement getsearch()
	{
		return search;
	}
	
	public WebElement getserachtxt()
	{
		return searchtxt;
	}
	public WebElement getChkbox() {
		return chkbox;
	}

	public WebElement getChkproductactive() {
		return chkproductactive;
	}

	public WebElement getCreateprod() {
		return createprodlink;
	}
	
	
}
