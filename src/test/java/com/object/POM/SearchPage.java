package com.object.POM;

import static org.junit.Assert.assertEquals;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends Base{

	By SearchBar      = By.xpath("//*[@id='twotabsearchtextbox']");
	By SearchButton   = By.xpath("//*[@class='nav-right']");
	By SearchedItem   = By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']");
	By carbonFiberBox = By.cssSelector("#p_n_feature_ten_browse-bin\\/17731927011 > span > a > span");
	By products       = By.tagName("h2");
	By price          = By.xpath("//span[@class='a-price-whole']");
	By fractionOfPrice= By.xpath("//span[@class='a-price-fraction']");
	
	
	public SearchPage(WebDriver driver) {
	super(driver);
		//Product and Price list

	
	}
	
	public void enterCriteria() throws InterruptedException {
	Thread.sleep(1000);
	type("phone case", SearchBar);
	}
	
	public void searchButton () throws InterruptedException {
	Thread.sleep(1000);
	click(SearchButton);
	}
	
	public String navigateSearchedPage () throws InterruptedException {
	Thread.sleep(1000);
	if(isDisplayed(SearchedItem)=="1-16 of over 7,000 results for \"phone case\"") {
	System.out.println("1-16 of over 7,000 results for \"phone case\"");
	}else {
	System.out.println(isDisplayed(SearchedItem));
	}return "Verified";
	}
	
	public void identifyBox() throws InterruptedException {
		Thread.sleep(1000);
	System.out.println(getText(carbonFiberBox));
	}
	
    public void checkTheBox() throws InterruptedException {
    	Thread.sleep(1000);
	click(carbonFiberBox);
	}
	
	public void UserSelects() throws InterruptedException {
		Thread.sleep(1000);
	isSelected(carbonFiberBox);
    }
	
	public void ProductsAndPrices () throws InterruptedException {
		Thread.sleep(2000);
		java.util.List<WebElement> productsName = driver.findElements(products);
		java.util.List<WebElement> prodPrice = driver.findElements(price);
		java.util.List<WebElement> prodPriceFrac = driver.findElements(fractionOfPrice);
		try {
		for(int i=0;i<productsName.size();i++) {
		if(productsName.get(i).getText().equals("Need help?")) {
        productsName.remove(i);
		}
		System.out.println(i+". "+productsName.get(i).getText().substring(0,30)+"------Price:: $"+prodPrice.get(i).getText()+"."+prodPriceFrac.get(i).getText());
		}
		}
    	catch(IndexOutOfBoundsException e) {
        System.out.println("Passed ");
		}
		driver.quit();
		
	}
}
