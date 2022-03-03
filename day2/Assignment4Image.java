package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Image {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.navigate().back();
		String url = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("src");
	    System.out.println(url);
	    driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
	    driver.navigate().back();

		
	
	}

}
