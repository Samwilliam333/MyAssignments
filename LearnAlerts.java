package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//enter the URL
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node01jcrqpdexjurs19k1p48rhb8ja290810.node0");
		//maximize the browser
		driver.manage().window().maximize();
		//simple alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();	
		driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		Thread.sleep(6000);
		//confirm alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		Thread.sleep(6000);
		//prompt alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("sam william");
		driver.switchTo().alert().accept();


	}

}
