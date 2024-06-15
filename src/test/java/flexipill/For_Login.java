package flexipill;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class For_Login {
	
	WebDriver driver;
	@BeforeTest
	
	public void set_up() {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
	    	driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.get("https://flexipill-ui-new-staging.vercel.app");
		
	}
 @Test(priority = 0)
 public void Login() throws InterruptedException {
	 driver.findElement(By.xpath("//a[text()='Login']")).click();
	 Thread.sleep(4000);
	 
	 driver.findElement(By.xpath("//input[@placeholder='Enter your number']")).sendKeys("1111111111");
	 Thread.sleep(4000);
	 
	 driver.findElement(By.xpath("//p[text()='Continue']")).click();
	 Thread.sleep(4000);
	 
	 driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input platinumrx-1x5jdmq']")).sendKeys("1111");
	 Thread.sleep(4000);
	 

 }
 @Test(priority = 1)
	public void Add_To_Cart() throws InterruptedException {
	 JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		WebElement scrollUpto = driver.findElement(By.xpath("//p[@class='landing-page_landing__sectionTitle__maj1m']"));
		js.executeScript("arguments[0].scrollIntoView();", scrollUpto );
		
		driver.findElement(By.xpath("(//span[@class='MuiTypography-root MuiTypography-p platinumrx-8ygzv4'][normalize-space()='Add to Cart'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='MuiTypography-root MuiTypography-p platinumrx-8ygzv4'][normalize-space()='Add to Cart'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='Header_cartButton__Giyrb']")).click();
		
		
		
	}
 @Test(priority = 2)
 public void Create_order() throws InterruptedException {
	 JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		WebElement scrollUpto = driver.findElement(By.xpath("//div[@class='biling-details_paymentOptions__wfcg5']"));
		js.executeScript("arguments[0].scrollIntoView();", scrollUpto );
		
		driver.findElement(By.xpath("//div[@class='biling-details_radioSpaces__y7Ivp']")).click();
		Thread.sleep(2000);
	 
 }
	 
 @AfterTest
 public void close() {
	 driver.close();
	 
 }
	 
	    }

	   