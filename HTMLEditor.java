package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLEditor {
	public static void main(String[] args) {


		//Step1:launch The Browser
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//step2:load the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//Step3:Handle the frame
		driver.switchTo().frame("iframeResult");
		//step4:Click on Try It Button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();

	}
}
