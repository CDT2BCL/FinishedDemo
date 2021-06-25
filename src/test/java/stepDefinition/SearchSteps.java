package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.object.POM.SearchPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	
private WebDriver driver;

SearchPage searchPage;
	
	
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
public void user_navigates_to_searched_page() {
	searchPage.navigateSearchedPage();
	
}

}
