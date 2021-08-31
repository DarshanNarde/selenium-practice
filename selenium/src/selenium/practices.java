package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class practices {



	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\driver\\chromedriver.exe");

		//Monday 23-08-2021
		/*
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Narde");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("rights")).click();
		Thread.sleep(3000);
		
		driver.close();
		*/
		
		//************************************************************************************************
		
		/*
		 
	  //contains,,ends-with,,starts-with
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.xpath("//input[contains(@name,'CompanyName')]")).sendKeys("zensar");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[ends-with(@name, 'LastName')]")).sendKeys("Narde");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[starts-with(@name, 'UserFirst')]")).sendKeys("Darshan");
		Thread.sleep(3000);
		
		driver.close();
		
		*/
		
		//*************************************************************************************************
		
		/*
		 // getCurrentURL, navigate forward-back-to
		  
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		
		System.out.println("Title of page is "+title);
		
		System.out.println("Title of page is "+driver.getCurrentUrl());
		

		
		driver.navigate().to("http://yatra.com");
		System.out.println(" Navigate - Title of page is "+driver.getTitle());
		
		driver.navigate().back();
		System.out.println(" BACK -  Title of page is "+driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().forward();
		System.out.println(" Forward - Title of page is "+driver.getTitle());
		//System.out.println(driver.getPageSource());
		Thread.sleep(3000);
		
		driver.close();
		
		*/
		
		//*************************************************************************************************
		
		/*
		 //retype-alternetEmail-checkbox-femaleRadioButton
		  * 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.xpath("//input[starts-with(@name, 'confirm_passwd')]")).sendKeys("12345678");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[starts-with(@name, 'altemail')]")).sendKeys("newEmail@");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[starts-with(@name, 'chk_altemail')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='f']")).click();
		Thread.sleep(3000);
		
		*/
		
		//*************************************************************************************************
		//*************************************************************************************************
		//*************************************************************************************************
		//*************************************************************************************************
		//*************************************************************************************************
		
		
		//Wednesday - 25-08-2021
		
		
		//ADD 10 ELEMENT and Delete 5th element 
		
		/*
				WebDriver driver3=new ChromeDriver();
				driver3.manage().window().maximize();
				driver3.get("https://the-internet.herokuapp.com/add_remove_elements/");
				WebElement footer= driver3.findElement(By.xpath("//div[@id='elements']"));
				
			    driver3.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
			    Thread.sleep(1000);
			    driver3.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
			    Thread.sleep(1000);
			    driver3.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
			    Thread.sleep(1000);
			    driver3.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
			    Thread.sleep(1000);
			    driver3.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
			    Thread.sleep(1000);
			    driver3.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
			    Thread.sleep(1000);
			    driver3.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
			    Thread.sleep(1000);
			    driver3.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
			    Thread.sleep(1000);
			    driver3.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
			    Thread.sleep(1000);
			    driver3.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
			    Thread.sleep(3000);
			    footer.findElement(By.xpath("(//*[@class='added-manually'])[5]")).click();
			    Thread.sleep(5000);
			    driver3.close();
			    
		 */
		
		//*************************************************************************************************
		//*************************************************************************************************
		//*************************************************************************************************
		//*************************************************************************************************
		//*************************************************************************************************
		
		//THURSDAY 26-08-2021
		
		/*
		// Print table div - class="hmnseindicestable" https://money.rediff.com/index.html

		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		WebElement footer= driver.findElement(By.xpath("//div[@class='hmnseindicestable']"));
		
		List<WebElement> allrow =footer.findElements(By.tagName("ul"));
		System.out.println("no of rows"+allrow);

		int i=0;
		for(WebElement ele:allrow)
		{
			List<WebElement> echcl =ele.findElements(By.tagName("li"));
		    i++;
		    System.out.println("no of column in"+i+"row are"+echcl.size());
		   
		    for(WebElement column:echcl)
		    {
		    	System.out.println("|"+column.getText());
		    }
		
		    System.out.println("");
		}
		*/
		
		//*************************************************************************************************
		
		//Go to google.com
		//a. type text in search text box and right click
		//b. Type text "Where is indore" in search box in capital letters and use left key and move 6 times 
		
		/*
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		Actions act=new Actions(driver);
		
		WebElement textbox=driver.findElement(By.xpath("//input[@name='q']"));
		act.moveToElement(textbox).click().keyDown(Keys.SHIFT).sendKeys("where is indore").build().perform();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ARROW_LEFT);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ARROW_LEFT);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ARROW_LEFT);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ARROW_LEFT);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ARROW_LEFT);
		
		Thread.sleep(3000);
		System.out.println("done");
		
        */
		
		//*************************************************************************************************
		
		//https://money.rediff.com/index.html 1. Click on More In the section "Most traded companies" and print the table Table - class="dataTable"
		
		/*
		WebDriver driver1=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://money.rediff.com/index.html");
		driver.get("https://money.rediff.com/companies/ipos?src=moneyhome_ipos_more");
	    driver1.findElement(By.xpath("//body/div[@id='wrapper']/div[9]/div[6]/div[1]/div[1]/p[1]/a[1]")).click();
	    Thread.sleep(3000);
	    
	   
	 
		
		WebElement footer= driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[5]/table[1]"));
		
		List<WebElement> allrow =footer.findElements(By.tagName("tr"));
		System.out.println("no of rows"+allrow);

		int i=0;
		for(WebElement ele:allrow)
		{
			List<WebElement> echcl =ele.findElements(By.tagName("td"));
		    i++;
		    System.out.println("no of column in"+i+"row are"+echcl.size());
		   
		    for(WebElement column:echcl)
		    {
		    	System.out.println("|"+column.getText());
		    }
		
		    System.out.println("");
		}
		
		*/
		
		//*************************************************************************************************
	
		//go to rediff.com  Right click on the logo rediff.com
	    /*
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		WebElement src=driver.findElement(By.xpath("//span[@class='hmsprite logo']"));
		act.contextClick(src).build().perform();
		Thread.sleep(3000);
		
		*/

		//*************************************************************************************************
		//*************************************************************************************************
		//*************************************************************************************************
		//*************************************************************************************************
		//*************************************************************************************************
		
		//28-08-2021
		
		
	}

}
