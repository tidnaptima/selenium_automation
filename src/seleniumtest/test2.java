package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumnddfile\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		String name,password;
		name="8902225191";
		password="1-1";
		login(driver,name,password);
		
		//driver.close();

	}
	public static void login(WebDriver driver,String name,String password)
	{
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("u_0_l")).click();
	}

}
