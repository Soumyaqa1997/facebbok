package Base_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_FAcebbok {
	 protected WebDriver driver;

	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}
