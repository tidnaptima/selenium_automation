package seleniumtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class test1 {
	public static void main(String args[]){
		start("chrome");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		
	}

	 public static void start(String a1)
	 {
		 switch(a1){
			 case "chrome":
				 System.setProperty("webdriver.chrome.driver","C:\\seleniumnddfile\\chromedriver.exe");
				 break;
			 case "firefox":
				 System.setProperty("webdriver.gecko.driver", "C:\\seleniumnddfile\\chromedriver.exe");
				 break;
		 }
	 }
}
