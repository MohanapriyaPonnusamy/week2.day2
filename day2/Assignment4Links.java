package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Links {



	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://leafground.com/pages/Link.html");
			driver.findElement(By.xpath("//a[@href='../home.html']")).click();
			driver.navigate().back();
			

	}

}
