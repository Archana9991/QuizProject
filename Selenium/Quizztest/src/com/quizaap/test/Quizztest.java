package com.quizaap.test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;




public class Quizztest {

	private WebDriver driver;
	  @Before
	  public void setUp() {
	    driver = new ChromeDriver();

	  }
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  
	  @Test
	  public void quizztest() {
	    driver.get("http://localhost:4200/login");
	    driver.manage().window().setSize(new Dimension(1536, 816));
	    driver.findElement(By.id("username")).click();
	    driver.findElement(By.id("username")).sendKeys("Archana123");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.cssSelector(".btn")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".btn"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.linkText("Start")).click();
	    driver.findElement(By.cssSelector("#mat-radio-3 .mat-radio-outer-circle")).click();
	    driver.findElement(By.cssSelector("#mat-radio-9 .mat-radio-label-content")).click();
	    driver.findElement(By.cssSelector("#mat-radio-18 .mat-radio-label-content")).click();
	    driver.findElement(By.cssSelector("#mat-radio-13 .mat-radio-outer-circle")).click();
	    driver.findElement(By.cssSelector("#mat-radio-22 .mat-radio-label-content")).click();
	    driver.findElement(By.cssSelector("#mat-radio-28 .mat-radio-outer-circle")).click();
	    driver.findElement(By.cssSelector("#mat-radio-34 .mat-radio-label-content")).click();
	    driver.findElement(By.cssSelector("#mat-radio-40 .mat-radio-outer-circle")).click();
	    driver.findElement(By.cssSelector("#mat-radio-42 .mat-radio-label-content")).click();
	    driver.findElement(By.cssSelector("#mat-radio-48 .mat-radio-outer-circle")).click();
	    driver.findElement(By.cssSelector("#mat-radio-52 .mat-radio-label-content")).click();
	    driver.findElement(By.cssSelector("#mat-radio-54 .mat-radio-label-content")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".mat-button-wrapper"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.cssSelector(".mat-button-wrapper")).click();
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".swal2-confirm")).click();
	  }

}
