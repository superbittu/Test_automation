package Hello.com.gajannan;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class firsttestngfile {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
   // String driverPath = "C:\\geckodriver.exe";
    String driverpath ="C:\\Users\\Gajanan\\Desktop\\selenium\\IEDriverServer.exe";
    public WebDriver driver ; 
     
  @Test
  public void verifyHomepageTitle() {
	  System.out.println("launching IE browser"); 
      System.setProperty("webdriver.ie.driver", driverpath);
      driver = new InternetExplorerDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      System.out.println(actualTitle);
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}