package com.object.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//yo
public class Base {
	protected WebDriver driver;
	
	public Base (WebDriver driver){
		this.driver=driver;
		}
	
	public WebDriver chromeDriverConnection() {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/casa/Desktop/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		return driver;
		}
	 
	
	//Wrapper1
    public WebElement findElement(By locator) {
	return driver.findElement(locator); 
	
	}
	public java.util.List<WebElement> findElements(By locator){
		return driver.findElements(locator);
			
	}

	public String getText(WebElement element) {
		return element.getText();
	}
	public String getText(By locator) { 
		return driver.findElement(locator).getText();
		
	}
	public void type(String imputText,By locator){
		driver.findElement(locator).sendKeys(imputText);
		
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public String isDisplayed(By locator) {
		
		 
		 return driver.findElement(locator).getText();
		}
	
	public Boolean isSelected(By locator) {
			try {
				return driver.findElement(locator).isSelected();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				return false;
			}
	}

   public void visit(String url) {
        driver.get(url);	 

   }
   

}
