package week2.day2;

import java.time.Duration;

import org.apache.poi.poifs.crypt.temp.AesZipFileZipEntrySource;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Button {

	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.navigate().back();
		Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println(location);
		String color = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(color);
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println(size);
	
		driver.close();
	}

}
