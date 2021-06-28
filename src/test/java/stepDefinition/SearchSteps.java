package stepDefinition;

import org.openqa.selenium.WebDriver;


import com.object.POM.SearchPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	
private WebDriver driver;

SearchPage searchPage;
	
	//hello
@Given("User loads homepage")
public void user_loads_homepage() {
	
	searchPage = new SearchPage(driver);
	driver = searchPage.chromeDriverConnection();

}

@And("Enters the sear criteria")
public void enters_the_sear_criteria() throws InterruptedException {
    searchPage.enterCriteria();
}

@When("User click the search button")
public void user_click_the_search_button() throws InterruptedException {
searchPage.searchButton();
}

@Then("User navigates to searched page")
public void user_navigates_to_searched_page() throws InterruptedException {
	searchPage.navigateSearchedPage();
	
}
@And("User verifies the boxe is unchecked")
public void user_verifies_the_boxe_is_unchecked() throws InterruptedException {
	searchPage.identifyBox();
}

@When("user checks the Carbon Fiber box")
public void user_checks_the_carbon_fiber_box() throws InterruptedException {
	searchPage.checkTheBox();		
   
}

@And("User navigate to Carbon Fiber product")
public void user_navigate_to_carbon_fiber_product() throws InterruptedException {
	searchPage.UserSelects();

}
@Then("User gets products and prices")
public void User_gets_products_and_prices() throws InterruptedException {
	searchPage.ProductsAndPrices();
}
}
