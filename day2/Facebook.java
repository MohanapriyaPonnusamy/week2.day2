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
	
	public class Facebook {
		
	     @SuppressWarnings("deprecation")
	     public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				
				
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://en-gb.facebook.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				WebElement elementUsername = driver.findElement(By.xpath("//input[@name='firstname']"));
				elementUsername.sendKeys("Priya");
		    	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("P");
		    	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nanotechpriya@gmail.com");
		    	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("nanotechpriya@gmail.com");
		    	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Priya");
		    	driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("25");
		    	driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Mar");
		    	driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1994");
		    	driver.findElement(By.xpath("//input[@value='1']")).click();
		    	

			}

		}

	


