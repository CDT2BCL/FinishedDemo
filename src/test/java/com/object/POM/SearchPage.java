package com.object.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends Base{

	By SearchBar = By.xpath("//*[@id='twotabsearchtextbox']");
	By SearchButton = By.xpath("//*[@class='nav-right']");
	By SearchedItem = By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']");
	
	public SearchPage(WebDriver driver) {
		super(driver);
		
		
	}

	public void enterCriteria() throws InterruptedException {
		Thread.sleep(4000);
		type("phone case", SearchBar);
	}
	public void searchButton () throws InterruptedException {
		Thread.sleep(4000);
		click(SearchButton);
		
		
	}
	public String navigateSearchedPage () {
		if(isDisplayed(SearchedItem)=="1-16 of over 7,000 results for \"phone case\"") {
			System.out.println("Expected 1-16 of over 7,000 results for \"phone case\"");
		
			
		}else {
			System.out.println(isDisplayed(SearchedItem));
		}return "Verified";
		
		
		}
}
