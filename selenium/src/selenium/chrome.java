package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class chrome {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\driver\\chromedriver.exe");

		/*WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("From selenium");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("From selenium");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='password']")).click();

		driver.close();
		
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver1.manage().window().maximize();
		
		
		driver1.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Darshan");
		Thread.sleep(2000);
		
		driver1.findElement(By.name("UserLastName")).sendKeys("Narde");
		Thread.sleep(2000);
		
		driver1.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("darshan@gmail.com");
		Thread.sleep(2000);
		
		driver1.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Zensar");
		Thread.sleep(2000);
		
		driver1.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("0123456789");
		Thread.sleep(2000);
		
		driver1.findElement(By.linkText("Contact")).click();
		Thread.sleep(3000);
		
		driver1.findElement(By.partialLinkText("rights")).click();
		Thread.sleep(3000);
		
		
		driver1.close();*/
		
		
		/*
		//practice
		WebDriver prac=new ChromeDriver();
		prac.get("https://google.com");
		prac.manage().window().maximize();
		
		String title=prac.getTitle();
		
		System.out.println("Title of page is "+title);
		
		//System.out.println("Title of page is "+prac.getCurrentUrl());
		
		System.out.println("Title of page is "+title);

		
		prac.navigate().to("http://yatra.com");
		System.out.println(" Navigate - Title of page is "+prac.getTitle());
		
		prac.navigate().back();
		System.out.println(" BACK - next Title of page is "+prac.getTitle());
		Thread.sleep(3000);
		
		prac.navigate().forward();
		System.out.println(" Forward - Title of page is "+prac.getTitle());
		System.out.println(prac.getPageSource());
		Thread.sleep(3000);

		prac.close();
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//Find the links in the footer
		WebDriver driver2=new ChromeDriver();
		driver2.manage().window().maximize();
		//driver2.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver2.get("https://sellglobal.ebay.in/seller-center/");
		
	    //driver2.findElement.xpath("//div[@id='footer']"));
		
		WebElement a= driver2.findElement(By.xpath("//ul[@id='menu-footer-menu']"));
		List<WebElement> all_elements =a.findElements(By.tagName("a"));

		for(WebElement element : all_elements)
			System.out.println(element.getText());
		driver2.close();
		
		*/
		
		
		//driver2.findElement(By.cssSelector(input[name]))
		/*driver2.findElement(By.xpath("//input[starts-with(@name, 'confirm_passwd')]")).sendKeys("12345678");
		Thread.sleep(3000);
		
		WebElement jt= driver2.findElement(By.xpath("//select[@id='country']")))
        driver2.close();
       
		
		/*
		
		//Delete 5th element
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
		
		
		
		/*
		 
		WebDriver driver3=new ChromeDriver();
		driver3.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement footer= driver3.findElement(By.xpath("//table[@id='customers']"));
		
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
		
		
		//CSS selector
		/*
		WebDriver driver4=new ChromeDriver();
		driver4.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver4.manage().window().maximize();
		
		
		Thread.sleep(3000);
		driver4.findElement(By.cssSelector("input[name='UserFirstName']")).sendKeys("hello");
		Thread.sleep(3000);
		*/
		//driver4.findElement(By.linkText("Contact")).click();
		//Thread.sleep(3000);
		
		//driver4.findElement(By.partialLinkText("rights")).click();
		//Thread.sleep(3000);
		

		//driver4.close();

		
		
		//26-08-21 thursday
		
		/*
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();

		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
				
		WebElement trg=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		WebElement droptext=driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
		
		act.doubleClick(droptext).build().perform();
		Thread.sleep(3000);
		
		act.dragAndDrop(src,trg).build().perform();
		Thread.sleep(3000);
		
		act.contextClick(src).build().perform();
		Thread.sleep(3000);
		*/
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Actions act=new Actions(driver);

				
		WebElement textbox=driver.findElement(By.xpath("//input[@name='q']"));
		//WebElement textbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		//WebElement search=driver.findElement(By.xpath("//button[@type='submit']"));
		textbox.click();
		textbox.sendKeys("This is the search box");
		Thread.sleep(2000);
		textbox.clear();
		Thread.sleep(2000);
		
		
		act.moveToElement(textbox).click().keyDown(Keys.LEFT_SHIFT).sendKeys("mobiles").build().perform();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		System.out.println("End of code ");
		
				
		 
		 
	}

}