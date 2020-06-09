package Details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Invoice_verification_details {
	WebDriver driver;
	public Invoice_verification_details(WebDriver args) {
		driver=args;
	}
	By Email= By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[2]/div/form/div[1]/div[1]/div/input");
	By Password= By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[2]/div/form/div[1]/div[2]/div/input");
	By Submitbutton =By.className("btn ce-btn-login-submit");
	
	public void logindetail(String username, String password) throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[2]/div/form/div[1]/div[1]/div/input")).sendKeys(username);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[2]/div/form/div[1]/div[2]/div/input")).sendKeys(password);
	
 
	}

	public void buton() {
	driver.findElement(By.className("btn ce-btn-login-submit")).click();
}
}
