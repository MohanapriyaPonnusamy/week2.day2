package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4DropDown {

	private static WebElement dropdown1;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/pages/Dropdown.html");
WebElement dd = driver.findElement(By.id("dropdown1"));
Select ddlist = new Select(dropdown1);
ddlist.selectByIndex(2);
ddlist.selectByValue("2");
ddlist.deselectByVisibleText("3");


	}

}
