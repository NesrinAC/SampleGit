package Testauto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class Seleniumscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrom.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://audituat.rayoman.com/login");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
