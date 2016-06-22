package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {
	
	private WebDriver driver = new FirefoxDriver();
	protected String baseUrl= "http://www.demo.guru99.com/V4/";
	protected String validUserName = "mngr41389";
	protected String validPassword = "hYqEvUq";
	
//	public MyClass(String validUserName, String validPassword){
//		this.driver = new FirefoxDriver();
//		this.validUserName = validUserName;
//		this.validPassword = validPassword;
//			
//	}
	
	public void openBrowser(){
		driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
		
	}
	
	public void entervalidUserName(){
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(validUserName);
//			System.out.println(validUserName + "was successfully entered");
//			System.out.println(validPassword + "was not successfully entered");
		}
	
	public void entervalidPassword(){
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(validPassword);
//			System.out.println(validPassword + "was successfully entered");
//			System.out.println(validPassword + "was  not successfully entered");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
	}
	
	public void closeBrowser(){
		driver.close();
		driver = null;
	}

}
