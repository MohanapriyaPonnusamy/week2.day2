package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class duplicateLead {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    WebElement elementUsername = driver.findElement(By.id("username"));
	    elementUsername.sendKeys("Demosalesmanager");
	    WebElement elementPassword = driver.findElement(By.id("password"));
	    elementPassword.sendKeys("crmsfa");
	    WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
	    elementLoginButton.click();
	    WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
	    elementCRMSFA.click();
 	    WebElement elementLeadsButton = driver.findElement(By.linkText("Leads"));
	    elementLeadsButton.click();
	    WebElement elementCreateLeadButton = driver.findElement(By.linkText("Find Leads"));
  	    elementCreateLeadButton.click();
  	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Email")).click();
	    driver.findElement(By.id("ext-gen282")).sendKeys("nanotechpriya@gmail.com");
	    driver.findElement(By.id("ext-gen334")).click();
	    driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=15296']")).click();
	    driver.findElement(By.xpath("//a[@href='duplicateLeadForm?partyId=15296']")).click();
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	    driver.findElement(By.xpath("//a[@href='/crmsfa/control/logout']")).click();
	   
	}



	}


