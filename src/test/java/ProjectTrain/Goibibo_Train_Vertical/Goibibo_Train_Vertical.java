package ProjectTrain.Goibibo_Train_Vertical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Goibibo_Train_Vertical {
	
	WebDriver driver;
	
	
	String Book_now_button = "//body[@class='greyBg']//div//div//div[1]//section[1]//div[1]//div[5]//div[1]//button[1]";

	String IRCTC_User_details_Popup = "//*[@id=\"exampleInputPassword1\"]";
	
	String Proceed_button = "//*[@id=\"irctcPop\"]/div/div/div[1]/div[2]/button";
	
	String Gender_choice = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[2]/div/div[1]/div[1]/select/option[2]",  name = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[2]/div/div[1]/div[2]/input",
			
			age ="/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[2]/div/div[2]/input", email = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[7]/div[2]/div[2]/div[1]/input",
			
			mobile = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[7]/div[3]/div[2]/div[1]/div[2]/input";
	
	String Review_Continue = "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[8]/div[2]/input"; 
	
	String pay_now_button = "/html/body/div[1]/div/div[2]/div/div[2]/div[6]/div[2]/input";
	
	String alert_popup = "//*[@id=\"irctcPop\"]/div/div/div/div[2]/button";
	
	String select_netbanking = "//*[@id=\"tab_nb\"]/div[1]/div[2]/span";
	
	String bank_selection ="//*[@id=\"banksRadio\"]/div[2]/div";
	
	String pay_button = "//*[@id=\"nbPayNow\"]/div/button";
	
	
  @Test(priority=0)
  public void Train_SRP_Page() {
	  
	  driver.findElement(By.xpath(Book_now_button)).click();
	  
  }
  
  
  @Test(priority=1)
  public void IRCTC_User_Details_POPup() {
	  
	  driver.findElement(By.xpath(IRCTC_User_details_Popup)).sendKeys("devg");
	  
	  driver.findElement(By.xpath(Proceed_button)).click();
  }
  
  @Test(priority=2)
  public void Train_Review_page() throws InterruptedException {
	  
	  driver.findElement(By.xpath(Gender_choice)).click();
	  
	  driver.findElement(By.xpath(name)).sendKeys("Test");
	  
	  driver.findElement(By.xpath(age)).sendKeys("33");
	  
	  driver.findElement(By.xpath(email)).sendKeys("testnoc009@gmail.com");
	  
	  
	  driver.findElement(By.xpath(mobile)).sendKeys("9999999997");
	  
	  driver.findElement(By.xpath(Review_Continue)).click();
  }
  
  
  @Test(priority=3)
  
  public void Train_offers_page() {
	  
	  driver.findElement(By.xpath(pay_now_button)).click();
	  
	  driver.findElement(By.xpath(alert_popup)).click();
	  
  }
  
  @Test(priority=4)
  
  public void payment_page() throws InterruptedException {
	  
	  driver.findElement(By.xpath(select_netbanking)).click();
	  
	  driver.findElement(By.xpath(bank_selection)).click();
	  
	  driver.findElement(By.xpath(pay_button)).click();
	  
	  Thread.sleep(4000);
  }
  
  @BeforeClass
  public void beforeClass()  {
  	  
  	  System.setProperty("webdriver.chrome.driver", "D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver.exe");
  	  driver = new ChromeDriver();
  	  driver.manage().deleteAllCookies();
  	  
  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	
  	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
  	


  	
  	  driver.navigate().to("https://www.goibibo.com/trains/results?src=NZM&dst=SBC&date=20200630&class=All&srcname=Hazrat%20Nizamuddin%20Railway%20Station&dstname=Bangalore%20City%20Junction");
  	  
  	  driver.manage().window().maximize();

  }

  @AfterClass
  public void afterClass() {
  	  
  	  driver.quit();
  }
  
}
