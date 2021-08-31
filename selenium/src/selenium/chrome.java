package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.google.common.io.Files;
import org.junit.Assert;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait; //FluentWait is a Class and it is a part of this package
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.Function;
//import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;//30-08-2021


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver; //31-08-2021


public class chrome {

	


	public static void main(String[] args) throws InterruptedException, IOException {
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
		
		//Tuesday 
		
		/*
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver.manage().window().maximize();
		
		WebElement jt=driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select jobtitle=new Select( jt );
		jobtitle.selectByVisibleText("Sales Manager"); 	
		Thread.sleep(3000);
		jobtitle.selectByValue("Customer_Service_Manager_AP");		
		Thread.sleep(3000);
		jobtitle.selectByIndex(5); 		
		Thread.sleep(2000);

		//jobtitle.getFirstSelectedOption().getText();
		WebElement selected = jobtitle.getFirstSelectedOption();
		System.out.println(selected.getText()); 		
		
		System.out.println("- - - - - - - - - - -");
		
		List<WebElement> jobtitle_options = jobtitle.getOptions();
		for(WebElement titlename : jobtitle_options)
			System.out.println(titlename.getText());
		
		
		
		List<WebElement> label_element=driver.findElements(By.tagName("label"));
		for(WebElement element : label_element)
			System.out.println(element.getText());
		
		System.out.println("************************************");
		List<WebElement> link_element=driver.findElements(By.tagName("a"));
		for(WebElement element : link_element)
				System.out.println(element.getText());
		System.out.println("//////////////////////////////////////////");
		
		int sizeoflinks=link_element.size();
		for(int i=0;i<sizeoflinks;i++)
			System.out.println(link_element.get(i).getText());
		
		
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
		
		/*
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
		*/
		
		//27-08-21 Friday
		
		/*
		 //done this task during session
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
        WebElement footer= driver.findElement(By.xpath("//body/div[@id='red_container_main']/div[31]"));
		
		List<WebElement> allrow =footer.findElements(By.tagName("h2"));
		System.out.println("Updated Movies List :-");
		
		for(WebElement ele:allrow)
		{
		   System.out.println(" "+ele.getText());
		}
        */
		
		/*
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[4]/form[1]/input[1]")).click();
        
        String text1;
        text1=driver.switchTo().alert().getText();
        System.out.println(text1);
        
        driver.switchTo().alert().accept();
		
		*/
		
		/*
		//lib for screenshot
					import java.io.File;
					import java.io.IOException;
					import org.openqa.selenium.OutputType;
					import org.openqa.selenium.TakesScreenshot;
					import org.openqa.selenium.WebDriver;
					import org.openqa.selenium.chrome.ChromeDriver;
					import com.google.common.io.Files;
		
		
		 
		 */
		
		
		//ScreenShot 
		/*
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		TakesScreenshot sr=((TakesScreenshot)driver);
		File fl=sr.getScreenshotAs(OutputType.FILE);
		String distfile="D://selenium//youtube.png";
		File trgfile=new File(distfile);
		Files.copy(fl,trgfile);
		System.out.println("End of code");
		
		*/
		
		/*
		WebDriver driver = new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		//Timeout - 30 seconds; Check every 5 seconds; ignore NoSuchElementException

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(By.xpath("//*[@id='demo']"));
				String getTextOnPage = element.getText();
				if (getTextOnPage.equals("Software Testing Material - DEMO PAGE")) {
					System.out.println(getTextOnPage);
					System.out.println("Found element - DEMO PAGE");
					return element;
				} else 
				{
					System.out.println("FluentWait Failed");
					return null;
				}
			}
		});
		*/
		
		//assert
		/*
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		Assert.assertEquals("Google", driver.getTitle());
		*/
		
		
		//30-08-2021
		
		/*
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.speedtest.net/");
        //driver.get("https://demoqa.com/links");

        //Storing the links in a list and traversing through the links
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // This line will print the number of links and the count of links.
        System.out.println("No of links are "+ links.size());  
      
        //checking the links fetched.
        for(int i=0;i<links.size();i++)
        {
            WebElement E1= links.get(i);
            String url= E1.getAttribute("href");
            verifyLinks(url);
        }
        
        driver.quit();
      }
    
    
    public static void verifyLinks(String linkUrl)
    {
        try
        {
            URL url = new URL(linkUrl);

            //Now we will be creating url connection and getting the response code
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()>=400)
            {
            	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
            }    
       
            //Fetching and Printing the response code obtained
            else{
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
        }catch (IOException e) {
        	System.out.println("Exception in url "+linkUrl);
      }
		*/
		
		
		
		//31-08-2021
		
		
				
			
		
		
	
		
		
	}

}
