package AdminPageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.kanoah.testmanager.service.rest.publicapi.PublicRestServiceExceptionHandler;

public class AdminPageAction {
	WebDriver driver=null;
	public AdminPageAction(WebDriver driver){
		this.driver=driver;
	}
	public void clickById(String locator){
		//Viet doan code thuc hen viec click len 1 doi tuong
		driver.findElement(By.id(locator)).click();
		
	}
	public void clickByXpath(String locator){
		//Viet doan code thuc hen viec click len 1 doi tuong
		driver.findElement(By.xpath(locator)).click();
		
	}
	public void sendKeyByID(String locator, String value){
		driver.findElement(By.id(locator)).sendKeys(value);
	}
	public void sendKeyByXpath(String locator, String value){
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}
	public  String getTextById(String locator){
		String myText =driver.findElement(By.id(locator)).getText();
		return myText;
	}
	public  String getTextByXpath(String locator){
		String myText =driver.findElement(By.xpath(locator)).getText();
		return myText;
	}
	public void close(){
		driver.close();
	}
	public void open(String url){
		driver.get(url);
	}
}
