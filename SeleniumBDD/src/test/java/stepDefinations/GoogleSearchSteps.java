package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class GoogleSearchSteps {

	WebDriver driver=null;
	@Given("Browseris open")
	public void browseris_open() {
		String path=System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("User is in google search page")
	public void user_is_in_google_search_page() {
		driver.get("https://www.google.co.in");
	}

	@When("user enter a tect in google search box")
	public void user_enter_a_tect_in_google_search_box() {
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search result page")
	public void user_is_navigated_to_search_result_page() {
	
		driver.getPageSource().contains("Automation Step by Step: Never Stop Learning");
		driver.close();
		driver.quit();
	}

}
