package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 
{
	@Test
	public void Script1()
	{
	System.setProperty("webdriver.chrome.driver", "E:\\SEL_Sotware\\Chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.14.0");
	driver.manage().window().maximize();
	driver.close();
	}


}
