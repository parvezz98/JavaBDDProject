package testpackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSol {
 public static void main(String []args) {
	 WebDriver driver;
	String path=System.getProperty("user.dir");
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/Drivers/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://web.whatsapp.com");
	driver.findElement(By.cssSelector("span[data-testid='chat']")).click();
	driver.findElement(By.cssSelector("div[class='g6kkip0l p357zi0d f8m0rgwh ppled2lx tkdu00h0 gfz4du6o r7fjleex jv8uhy2r lhggkp7q qq0sjtgm ln8gz9je tm2tP copyable-area'] div div[title='Search input textbox']")).sendKeys("Sektor");
    driver.findElement(By.cssSelector("div[class='_3Bc7H KPJpj'] div div div[class='_3uIPm WYyr1'] div[class='_3m_Xw'] div span[title='Sektorr']")).click();
    
    driver.findElement(By.cssSelector(".p3_M1")).click();
    
 }
}
