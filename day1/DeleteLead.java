package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("//span[@class='x-tab-strip-text'])[2]")).click();
	   
	    driver.findElement(By.xpath("//input[@name= 'phoneNumber']")).sendKeys("98");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

}
