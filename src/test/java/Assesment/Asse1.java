package Assesment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asse1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://developer.cirtru.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	WebElement myaccount= driver.findElement(By.xpath("//a[@class='link-uCase headerSubtitle']"));
	myaccount.click();
	
	
	WebElement email= driver.findElement(By.xpath("//input[@name='Email-modal']"));
	email.sendKeys("testuser6@gmail.com");
	
	WebElement enter1= driver.findElement(By.xpath("//button[@class='btn signin-signup-btn-margin logIn link-uCase']"));
	enter1.click();
	
	
	WebElement password= driver.findElement(By.xpath("//input[@name='loginPassword-modal']"));
	password.sendKeys("12345678");
	
	WebElement enter2= driver.findElement(By.xpath("//button[@class='btn signin-signup-btn-margin logIn link-uCase'][1]"));
	enter2.click();
	
	WebElement add= driver.findElement(By.xpath("//input[@class='mapboxgl-ctrl-geocoder--input']"));
	add.sendKeys("San Jose");
	
	WebElement drop= driver.findElement(By.xpath("//ul[@class='property-simple-location property-simple-location-custom']"));
	drop.click();
	
	WebElement check= driver.findElement(By.xpath("//div[contains(@class,'col-xs-12 no-padding plan-div ng-scope popular-plan')]"));
	check.click();
	
	WebElement getstarted= driver.findElement(By.xpath("//button[@id='id-submit-sku_PsxmGLQ5E0y8NZ']"));
	getstarted.click();
	
	Thread.sleep(6000);
	driver.navigate().refresh();
	
	WebElement Myaccount= driver.findElement(By.xpath("//span[@class='notificationCircle label-warning']"));
	Myaccount.click();
	
	//drop the page
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,500)", "");
	
	WebElement procced= driver.findElement(By.xpath("//div[@data-ng-show='!proceedLogOut && !processing']"));
	procced.click();
	
	WebElement logout= driver.findElement(By.xpath("//button[@data-ng-click='logOut()']"));
	logout.click();
	
	WebElement log= driver.findElement(By.xpath("//button[@data-ng-click='$root.signout()']"));
	log.click();
	
	
	
	
	
	 
	
	
	
		
	
	
	
		
		
		
		
		
		

	}

}
