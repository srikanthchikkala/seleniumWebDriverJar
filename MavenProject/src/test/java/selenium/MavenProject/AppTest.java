package selenium.MavenProject;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.After;		
import org.junit.AfterClass;		
import org.junit.Before;		
import org.junit.BeforeClass;		
import org.junit.Ignore;		
import org.junit.Test;		


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest

{
@Test

public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","/home/edureka/chromedriver");
ChromeOptions chromeOptions = new ChromeOptions();
WebDriver driver = new ChromeDriver(chromeOptions);
System.out.println("Hi, Welcome to Edureka's WebDriver assignment");
driver.get("http://localhost:3001");
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

// Error message Scenario
driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[1]/div[2]/input")).sendKeys("Edureka");
driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[1]/div[4]/input")).sendKeys("Edureka");
driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[1]/div[6]/input")).click();;
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
WebElement  TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[2]"));
//TxtBoxContent.getText();
String errormessage = TxtBoxContent.getText();
System.out.println("Printing Error Message "+errormessage);

driver.close();
driver.quit();
} 
}
