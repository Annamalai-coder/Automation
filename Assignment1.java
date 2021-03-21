package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				WebDriverManager.chromedriver().setup();
				
				ChromeDriver driver = new ChromeDriver();
				
				driver.get("http://leaftaps.com/opentaps");
				
				driver.manage().window().maximize();

				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Create Account")).click();
				
				driver.findElement(By.id("accountName")).sendKeys("AceTester");
				driver.findElement(By.id("groupNameLocal")).sendKeys("AnnaTester");
				driver.findElement(By.id("annualRevenue")).sendKeys("100000");
				WebElement element1 = driver.findElement(By.name("industryEnumId"));
				Select dropDown = new Select(element1);
				dropDown.selectByVisibleText("Finance");
				WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
				Select dropDown2 = new Select(element2);
				dropDown2.selectByVisibleText("Sole Proprietorship");
				driver.findElement(By.id("sicCode")).sendKeys("0205");
				WebElement element3 = driver.findElement(By.id("dataSourceId"));
				Select dropDown3 = new Select(element3);
				dropDown3.selectByVisibleText("Conference");
				WebElement element4 = driver.findElement(By.id("initialTeamPartyId"));
				Select dropDown4 = new Select(element4);
				dropDown4.selectByVisibleText("Demo Sales Team No. 1");
				driver.findElement(By.name("description")).sendKeys("This is a Test");
				driver.findElement(By.name("importantNote")).sendKeys("Test Automation");
				driver.findElement(By.name("parentPartyId")).sendKeys("democlass1");
				driver.findElement(By.name("officeSiteName")).sendKeys("Canada");
				WebElement element5 = driver.findElement(By.id("currencyUomId"));
				Select dropDown5 = new Select(element5);
				dropDown5.selectByVisibleText("CAD - Canadian Dollar");
				driver.findElement(By.id("numberEmployees")).sendKeys("1000");
				driver.findElement(By.id("tickerSymbol")).sendKeys("Included");
				WebElement element6 = driver.findElement(By.id("marketingCampaignId"));
				Select dropDown6 = new Select(element6);
				dropDown6.selectByVisibleText("Pay Per Click Advertising");
				driver.findElement(By.id("primaryPhoneAreaCode")).sendKeys("91");
				driver.findElement(By.id("primaryPhoneExtension")).sendKeys("14325");
				driver.findElement(By.id("primaryEmail")).sendKeys("Automation@testleaf.com");
				driver.findElement(By.id("primaryPhoneNumber")).sendKeys("987654321");
				driver.findElement(By.id("primaryPhoneAskForName")).sendKeys("Ironman");
				driver.findElement(By.id("primaryWebUrl")).sendKeys("https://www.testleaf.com");
				driver.findElement(By.id("generalToName")).sendKeys("Alex");
				driver.findElement(By.id("generalAddress1")).sendKeys("123 North Street");
				driver.findElement(By.id("generalCity")).sendKeys("Halifax");
				driver.findElement(By.id("generalPostalCode")).sendKeys("B3K 1N8");
				driver.findElement(By.id("generalPostalCodeExt")).sendKeys("6022");
				driver.findElement(By.id("generalAttnName")).sendKeys("Mike");
				driver.findElement(By.id("generalAddress2")).sendKeys("Rouge Avenue");
				WebElement element8 = driver.findElement(By.id("generalStateProvinceGeoId"));
				Select dropDown8 = new Select(element8);
				dropDown8.selectByVisibleText("Virgin Islands");
				driver.findElement(By.className("smallSubmit")).click();
				String title = driver.getTitle();
				System.out.println(title);
	}

}
