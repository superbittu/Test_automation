package Hello.com.gajannan;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Gajanan Patil 
 * *
 */

public class FinalProject_Selenium 
{
  public static void main( String[] args ) throws InterruptedException
   {
	  	System.out.println( "Hello World!" );
        System.setProperty("webdriver.ie.driver", "C:\\Users\\Gajanan\\Desktop\\selenium\\IEDriverServer.exe");
//class of selenium jar   object       method inside a jar
        WebDriver         driver = new InternetExplorerDriver();
        	driver.manage().window().maximize();
        	driver.get("http://demo.automationtesting.in/Register.html");
    //       driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
        	try
        	{
            driver.findElement(By.xpath("//*[@class=//*[@csdifweinlass='f-contsieufhewiuhrol ng-pristine ng-invalid ng-invalid-required ng-touched']]")).sendKeys("Gajanan");
            //xpath last name
            //
            //
            //wont execute next steps terminate from line expection occured
        	}
        	catch(Exception e)
       	{
        	driver.findElement(By.xpath("//input[@type='text'and @placeholder='First Name']")).sendKeys("Gajanan1");
          	}
        	
        	driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Patil");
        	driver.findElement(By.xpath("//*[@type='email']")).sendKeys("gajanancdvgpatil286@gmail.com");//tel
        	driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("7506248672");//Male
        	
         	driver.findElement(By.xpath("//*[@value='Male']")).click();//sign up
         	//driver.findElement(By.xpath("//*[@value='sign up']")).click();
         	 Thread.sleep(5000);
         	 //    	driver.findElement(By.xpath("//*[text()='Please match the requested format.']"));
         	//Please match the requested format.
         	driver.findElement(By.xpath("//*[@value='Cricket']")).click();
         	//         	Checking a checkbox
         	////*[@id='checkbox1']
         	  WebElement selecting_ele = driver.findElement(By.id("countries"));
         	  WebElement selecting_year = driver.findElement(By.xpath("//*[@placeholder='Year']"));
         	  WebElement selecting_month = driver.findElement(By.xpath("//*[@placeholder='Month']"));         
         	  WebElement selecting_day = driver.findElement(By.xpath("//*[@placeholder='Day']"));
         	  
              Select select = new Select(selecting_ele);
              select.selectByVisibleText("Uganda");
              
              
              
              
              
              
              
              
              
              
              
              
            
              
              
              
             driver.findElement(By.linkText("Today's Deals"));
             driver.findElement(By.className("nav-sprite nav-logo-base"));

              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              Select year = new Select(selecting_year);
              year.selectByVisibleText("1921");
              Select month = new Select(selecting_month);
              month.selectByVisibleText("February");
              Select day = new Select(selecting_day);
              day.selectByVisibleText("3");

              driver.findElement(By.id("firstpassword")).sendKeys("Momdad1234566");
              driver.findElement(By.id("secondpassword")).sendKeys("Momdad1234566");
              
              driver.findElement(By.id("submitbtn")).click();

              Thread.sleep(5000);
              
           //   form-control ng-pristine ng-untouched ng-invalid ng-invalid-required   // selecting year
           String S =   driver.findElement(By.xpath("//div[@class='col-sm-8 col-xs-8 col-md-8']/h1")).getText();
           System.out.println(S);
           if(S.equals("Automation Demo Site"))
           {
        	      	   
        	   System.out.println("here is value of S "+S);
           }
              
           driver.close();
          
              
            //*[@class='col-sm-8 col-xs-8 col-md-8']
              //xpath get text and use gettext() and store in string and print      Automation Demo Site
             //Xpath Why ? we need to send some text or click link ,hyperlink ,button , select checkbox
        
    }
}
