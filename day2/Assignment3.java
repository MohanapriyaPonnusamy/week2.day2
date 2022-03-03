package week2.day2;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//	System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Eclipse\\Eclipse-Workspace\\Feb Batch\\LearnSelenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//form[@id='logout-form']")).submit();
		driver.close();
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebElement elementUsername = driver.findElement(By.xpath("//input[@name='firstname']"));
		//elementUsername.sendKeys("Priya");
    	//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("P");

	}

}
