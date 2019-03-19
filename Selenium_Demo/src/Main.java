import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Main {

	public static void main(String args[])
	{
		WebDriver driver = null;
		System.setProperty("webdriver.com.chrome", "c:\\selenium client jars\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("src")).click();
		WebElement source = driver.findElement(By.id("src"));
		source.sendKeys("Kanpur");
		driver.findElement(By.id("src")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("dest")).click();
		WebElement dest = driver.findElement(By.id("dest"));
		dest.sendKeys("Agra");
		driver.findElement(By.id("dest")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.xpath("//*[@class='fl search-box date-box gtm-onwardCalendar']")).click();       
	    String month="Apr 2019";        
	    String date="28";       
	    String getMonth=driver.findElement(By.xpath("//div[@class='rb-calendar']//td[@class='monthTitle']")).getText();         
	    System.out.println(getMonth);   
	    try     
	    {       
	      while(true)   
	      {             
	      if(!(getMonth.equalsIgnoreCase(month))) 
	            {
	                driver.findElement(By.xpath("//div[@class='rb-calendar']/*//td[@class='next']")).click();
	                break;      
	            }       
	      }         
	      driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody//td[text()='"+month+"']/../..//td[text()='"+date+"']")).click();         
	       }
	    catch(Exception e)      
	    {      
		 }
	   /* try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	    driver.findElement(By.id("search_btn")).click();
	   
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	   driver.findElement(By.cssSelector("#\\31 0327956 > div > div.clearfix.m-top-16 > div.button.view-seats.fr")).click(); 
	    
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	   Select make = new Select(driver.findElement(By
						.xpath("html/body/center/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/table/tbody[2]/tr/td/div/div[1]/div/div[3]/div[4]/select")));
		make.selectByIndex(1);

		driver.findElement(
				By.xpath("html/body/center/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/table/tbody[2]/tr/td/div/div[1]/div/div[3]/div[3]/a"))
				.click();
		driver.findElement(
				By.xpath("html/body/center/div[3]/div[4]/div[1]/div[1]/div[3]/div[3]"))
				.click();
		driver.findElement(
				By.xpath("html/body/center/div[3]/div[4]/form[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div/ul/li[1]/input"))
				.sendKeys("Test user");
		driver.findElement(
				By.xpath("html/body/center/div[3]/div[4]/form[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div/ul/li[2]/input[2]"))
				.click();
		driver.findElement(
				By.xpath("html/body/center/div[3]/div[4]/form[1]/div[3]/div[1]/div[1]/div[1]/div[12]/div[1]/div[1]/input"))
				.click();
		driver.findElement(
				By.xpath("html/body/center/div[3]/div[4]/form[1]/div[3]/div[1]/div[4]/div[2]/div/ul/li[4]/a"))
				.click();
		
		
		
		
	  	  
	}
}