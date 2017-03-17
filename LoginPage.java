package AdminPage;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import AdminPageAction.AdminPageAction;

public class LoginPage {
	
	
	@Test(priority=1)

	public void TestLoginincorrectEmail() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Chuongpc\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		AdminPageAction myAction=new AdminPageAction(driver);
		myAction.open("http://admin.hottab.co");
		Thread.sleep(500);
		myAction.sendKeyByXpath("/html/body/div[1]/div/div/div[2]/form/div[2]/div[1]/input", "tenchuatontai@gamil.com");
		myAction.sendKeyByXpath("/html/body/div[1]/div/div/div[2]/form/div[2]/div[2]/input", "123456");
		myAction.clickByXpath("/html/body/div[1]/div/div/div[2]/form/button");
		String Msg =myAction.getTextByXpath(".//*[@id='app']/div/div/div[2]/form/div[1]");
		Thread.sleep(500);	
		Assert.assertEquals(Msg, "   Invalid email or password ");
		
	}

	

}
