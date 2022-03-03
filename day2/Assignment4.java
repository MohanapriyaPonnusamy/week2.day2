package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	private static String text;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/pages/Edit.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nanotechpriya@gmail.com");
		WebElement appendTextbox = driver.findElement(By.xpath("(//label[@for='email']0[2]/following-sibling::input"));
		String attribute = appendTextbox.getAttribute("value");
		appendTextbox.sendKeys("Test Leaf" +Keys.TAB);
		
		System.out.println(text +":"+attribute);
		
	    boolean enabled = driver.findElement(By.xpath("//input[@type='text']")).isEnabled();
	     if(enabled) { 
	         System.out.println("textbox is enabled" +enabled); 
	     } 
	     else { 
	         System.out.println("textbox is not enebled" +enabled); 
	     } 
		driver.close();
		
	}

}
