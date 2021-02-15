import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Add Path for Chrome Driver in below line 
		System.setProperty("webdriver.chrome.driver", "/Users/bhagyesh/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		
		WebElement email = driver.findElement(By.name("email"));
		
		email.sendKeys("Enter Your Email ID or Phone Number Here");
		
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass")));
		
		WebElement password = driver.findElement(By.name("pass"));
		
		password.sendKeys("Enter Your Password Here");
		
		
		
		WebElement login = driver.findElement(By.name("login"));
		
		login.click();
		
		
		
	}

}
