package module5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

		/*
		 *  Explore the blogs and Navigate to Main page 5.Logout of the portal
		 
		 */
public class CaseStudyModule5 
	{
	public static void main(String[] args) throws InterruptedException
		{
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saanvi\\Desktop\\Selenium Training\\Installation Stuff\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		//open the uRL
		driver.get("https://www.edureka.co/");
		
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// clicking on the log in web element an then logging in with personal credentials
		WebElement logIn =  driver.findElement(By.xpath("//a[text()='Log In']"));
		logIn.click();

		Thread.sleep(2000);
		
		driver.findElement(By.id("si_popup_email")).sendKeys("vinitbassi@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("si_popup_passwd")).sendKeys("Bond@007");
		driver.findElement(By.xpath("//button[text()= 'Login']")).click();
		
		// navigating to My Profile
		WebElement user = driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[8]/div/button/span"));
		user.click();
		
		//driver.findElement(By.xpath("//*[text()= 'Shallu Bass']")).click();
		
		// creating selector class to select from the drop downs 
		
		WebElement MyProfile = driver.findElement(By.xpath("(//a[text()= 'My Profile'])[1]"));
		MyProfile.click();
		
		// navigating and updating personal details
		
		 driver.findElement(By.id("personal_details")).click();
		 
		 // editing experience in the personal profile
		
		WebElement exp =  driver.findElement(By.id("experience"));
		 
		Thread.sleep(2000);
		 Select oSelect = new Select(exp);
		 
		 oSelect.selectByVisibleText("2-4 years");
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//button[text()='Continue'])[1]")).click();
		//driver.findElement(By.xpath("(//*[@type = 'button'])[3]")).click();
		 
		 Thread.sleep(1000);
		 
		Select sel = new Select(driver.findElement(By.name("currentjob"))); 
		sel.selectByVisibleText("Senior Management");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		 driver.findElement(By.xpath("//button[text() = 'Next']")).click();
		 
		 WebElement EmpType=  driver.findElement(By.name("elementType"));
		
		 Select sel2 = new Select(EmpType);
		 sel2.selectByIndex(0);

		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//button[text() = 'Next']")).click();
		 
		 WebElement save = driver.findElement(By.xpath("(//button[text() = 'Save'])[1]"));
		 save.click();
		
		 // returning to the main profile page 
		 
	    driver.findElement(By.xpath("//span[text()= 'Shallu Bass']")).click();
	    
	    // log out
	     WebElement logOut = driver.findElement(By.xpath("//a[text() = 'Log Out']"));
	     logOut.click();

		}
	}
