package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
	    driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
	    driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Mohanapriya");
	    driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
	    driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=15296']")).click();
	    System.out.println(driver.getTitle());
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@href='updateLeadForm?partyId=15296']")).click();
	    driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Nalan Company");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    driver.findElement(By.xpath("//a[@href='/crmsfa/control/logout']")).click();
		  //  WebElement elementlastName = driver.findElement(By.id("createLeadForm_lastName"));
		 //   elementlastName.sendKeys("P");
		//   WebElement elementfirstNameLocal = driver.findElement(By.id("c
	  //  WebElement elementlastName = driver.findElement(By.id("createLeadForm_lastName"));
	 //   elementlastName.sendKeys("P");
	//   WebElement elementfirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	//    elementfirstNameLocal.sendKeys("Priya");
	//   WebElement elementdepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
	//   elementdepartmentName.sendKeys("Testing");
	//   WebElement elementdescription = driver.findElement(By.id("createLeadForm_description"));
	//   elementdescription.sendKeys("Edit the field");
	//   WebElement elementemailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
	//   elementemailAddress.sendKeys("nanotechpriya@gmail.com");
	//   WebElement elementstateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	//  elementstateProvince.sendKeys("NewYork");
	 //   WebElement elementCreateButton = driver.findElement(By.className("smallSubmit"));
	  //  elementCreateButton.click();
	 //   WebElement elementEditLeadButton = driver.findElement(By.linkText("Edit"));
       // elementEditLeadButton.click();
      //  driver.findElement(By.id("updateLeadForm_description")).clear();
      //  WebElement elementImportantNote = driver.findElement(By.id("updateLeadForm_importantNote"));
	   // elementImportantNote.sendKeys("XYZ");
	 //   WebElement elementUpdateButton = driver.findElement(By.className("smallSubmit"));
	 //   elementUpdateButton.click();

	}



	}


