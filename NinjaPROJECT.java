package TestNGdemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ProjectNEW2 {
  WebDriver driver;
  @BeforeTest
	  public void beforeTest() {
		   ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://tutorialsninja.com/demo/index.php?route=checkout/cart");
		  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

  @AfterTest
  public void afterTest() {
  }
  
  @Test (priority = 1)
	  public void Login() throws InterruptedException {
		  WebElement MyAcc = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]"));
		  MyAcc.click();
		  Thread.sleep(2000);
		  WebElement log = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
		  log.click();
		  Thread.sleep(2000);
		  WebElement email = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
		  email.sendKeys("nimbalkar0612@gmail.com");
		  Thread.sleep(2000);
		  WebElement pass = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]"));
		  pass.sendKeys("Radha123");
		  Thread.sleep(2000);
		  WebElement btn = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]"));
		  btn.click();
  }
  
  @Test (priority = 4)
  public void Show() {
	  WebElement desktop = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]"));
	  desktop.click();
	  WebElement ShowDesktop = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/div[1]/a[1]"));
	  ShowDesktop.click();
	  
	  WebElement LapNote = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]"));
	  LapNote.click();
	  WebElement ShowLapNote = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/div[1]/a[1]"));
	  ShowLapNote.click();
	  
	  WebElement Components = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]"));
	  Components.click();
	  WebElement ShowComponents = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[2]/ul[1]/li[3]/div[1]/a[1]"));
	  ShowComponents.click();
	  
	  WebElement Tablets = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]"));
	  Tablets.click();
	  
	  WebElement Software = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]"));
	  Software.click();
	  
	  WebElement Phones = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]"));
	  Phones.click();
	  
	  WebElement Cameras = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[2]/ul[1]/li[7]/a[1]"));
	  Cameras.click();
	  
	  WebElement MP3 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[2]/ul[1]/li[8]/a[1]"));
	  MP3.click();
	  
  }
  
  @Test (priority = 2)
  public void search() {
	  WebElement search = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
	  search.sendKeys("iphone");
	  WebElement btn = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]/i[1]"));
	  btn.click();
	  WebElement img = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]"));
	  img.click();
  }
  
  @Test (priority = 3)
  public void List() {
	  WebElement AddToCart = driver.findElement(By.id("button-cart"));
	  AddToCart.click();
	  WebElement AddWishList = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/i[1]"));
	  AddWishList.click();
	  WebElement ViewWishList = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/span[1]"));
	  ViewWishList.click();
	  WebElement RemoveWishList = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/a[1]/i[1]"));
	  RemoveWishList.click();
	  WebElement ViewCart = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/span[1]"));
	  ViewCart.click();
	  
	  WebElement RemoveCart = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]/button[2]/i[1]"));
	  RemoveCart.click();
	  WebElement Continue = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]"));
	  Continue.click();
  }
  
  @Test (priority = 5)
  public void CheckLogOut() {
	  WebElement CheckOut = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[5]/a[1]/span[1]"));
	  CheckOut.click();
	  WebElement MyAcc = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]"));
	  MyAcc.click();
	  WebElement LogOut = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]"));
	  LogOut.click();
	  WebElement Cont = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]"));
	  Cont.click();
  }
  
  @Test (priority = 5)
  public void Camera() {
	 
  }
}
