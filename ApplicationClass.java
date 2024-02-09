package seleniumproject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ApplicationClass {
	
	 WebDriver driver;
	 @Test
	public  void setup() throws IOException, InterruptedException{
		
		driver	 = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.opencart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		StringBuilder exceptedTitle =new StringBuilder("OpenCart - Open Source Shopping Cart Solution");
		String actualTitle =driver.getTitle();
		if(actualTitle.contentEquals(exceptedTitle)) {
			System.out.println("Title get verified");
		}else if(!actualTitle.equals(exceptedTitle)) {
			System.out.println("We got diffrent title");
		}
		
		driver.findElement(By.xpath("//*[@class='btn btn-black navbar-btn']")).click();
		WebElement regiElement =driver.findElement(By.cssSelector(".col-md-7 > h3"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wdWait.until(ExpectedConditions.visibilityOf(regiElement));
		
		String reTex=driver.findElement(By.cssSelector(".col-md-7 > h3")).getText();
		if(reTex.equals("Register for OpenCart account")) {
			System.out.println("testcase passed uptill now");
		}
		driver.close();
		
	}
}
