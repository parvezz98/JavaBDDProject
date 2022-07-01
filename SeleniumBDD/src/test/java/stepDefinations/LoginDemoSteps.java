package stepDefinations;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginDemoSteps {

	WebDriver driver=null;
	LoginPage loginn;
	@Given("browser is open")
	public void browser_is_open() {
		String path=System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@And("user is on home page")
	public void user_is_on_home_page() {
	   driver.get("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws Exception{
	 
		
    loginn= new LoginPage(driver);
	  loginn.enterUsername(username);
      loginn.enterPassword(password);
      loginn.clickLogin();
	//	driver.findElement(By.id("name")).sendKeys(username);
	//   driver.findElement(By.id("password")).sendKeys(password);
	   
	  
	}
	@And("user clicks on login")
	public void user_clicks_on_login() throws Exception {
	loginn.clickLogin();
	//	driver.findElement(By.id("login")).click();
	 Thread.sleep(20000);
	}

	@Then("user is naviagted to home page")
	public void user_is_naviagted_to_home_page() {
		loginn.isLogoutDisplayed();
		//driver.findElement(By.id("logout")).click();
	   driver.close();
	   driver.quit();
	}

}
