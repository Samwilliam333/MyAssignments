package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//enter the URL
		driver.get("https://www.leafground.com/frame.xhtml");
		//maximize the browser
		driver.manage().window().maximize();
		//click on frame 1
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		//click on frame 3
		//driver.close();
		Thread.sleep(5000);
		//enter the URL
		driver.get("https://letcode.in/frame");
		//maximize the browser
		driver.manage().window().maximize();
		//enter the name
		driver.switchTo().frame("firstFr");
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("sam");
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("william");
		//enter the email id 
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("email");
		//enter the last name again
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("A");
		//switch to next frame
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Watch tutorial']")).click();
		
		
		
		
		

	}

}
