import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class LaunchingDifferentBrowsers {
	@Test
	public void Chrome() throws InterruptedException
	{
		//setting the path of the chrome driver
		System.setProperty("webdriver.chrome.driver", "/home/vani/selenium components/chromedriver_linux64/chromedriver");
		//launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//maximize the chrome
		driver.manage().window().maximize();
		//applying implicit wait to load the elements in the web page
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//going to login page
		driver.get("https://account.magento.com/customer/account/login?_ga=2.265932235.510907174.1542724507-2006733131.1542216966");
	    //writing the email address in the text box
		driver.findElement(By.id("email")).sendKeys("pavanigunturu536@gmail.com");
	    //writing the password in the password field
		driver.findElement(By.id("pass")).sendKeys("Welcome123");
	    //click on login
		driver.findElement(By.id("send2")).click();
		//click on log out
	    driver.findElement(By.linkText("Log Out")).click();
	    //closing the browser
		driver.close();
	}
	@Test
	public void Firefox() throws InterruptedException
	{
		//setting the path of the gecko driver
		System.setProperty("webdriver.gecko.driver","/home/vani/selenium components/geckodriver-v0.23.0-linux64/geckodriver");
		//launch the firefox browser
		WebDriver driver=new FirefoxDriver();
		//applying implicit wait to load the elements in the web page
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//going to login page
		driver.get("https://account.magento.com/customer/account/login?_ga=2.265932235.510907174.1542724507-2006733131.1542216966");
	    //writing the email address in the email field
		driver.findElement(By.id("email")).sendKeys("pavanigunturu536@gmail.com");
	    //writing the password in the password field
		driver.findElement(By.id("pass")).sendKeys("Welcome123");
	    //click on login
		driver.findElement(By.id("send2")).click();
		//click on log out
	    driver.findElement(By.linkText("Log Out")).click();
	    //closing the browser
		driver.close();
	}
}
