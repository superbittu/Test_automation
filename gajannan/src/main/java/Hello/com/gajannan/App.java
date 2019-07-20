package Hello.com.gajannan;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */

public class App 

{ /* public static void main( String[] args ) throws InterruptedException*/
	@Test
	Protected void Testme()
   {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.ie.driver", "C:\\Users\\Gajanan\\Desktop\\selenium\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/popup.php");			
        driver.findElement(By.xpath("//*[text()='Click Here']")).click();
        String Parent_Window =driver.getWindowHandle();
        //How to handle other windows apart from parent i.e window below 
        Set<String> childw = driver.getWindowHandles();
        Iterator<String> iamIterator = childw.iterator();
        while(iamIterator.hasNext())
        {
        	String iamchildwindow = iamIterator.next();
     
        	if(!Parent_Window.equalsIgnoreCase(iamchildwindow))
        	{
        		driver.switchTo().window(iamchildwindow);
                driver.manage().window().maximize();
        		driver.findElement(By.name("emailid")).sendKeys("Hello");
        	}
        	driver.close(); 
        }
        
        
        
        
/*	    driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
       //input[@name='q']
        driver.findElement(By.xpath("//*[text()='Try it']")).click();
        Alert alert = driver.switchTo().alert();
        String iamalert =    alert.getText();
        System.out.println(iamalert);
      //  alert.accept();// Stands for OK,ACCEPT Once accepted it will give some validation screen eg : Transaction Success or Login Successful
      alert.dismiss();// Stands for CANCEL,REJECT
     // alert.sendKeys("abcd"); 
      
      */
      
        //Xpath Why ? we need to send some text or click link ,hyperlink ,button , select checkbox
        
    }
}
