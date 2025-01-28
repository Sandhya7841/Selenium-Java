package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ActionsTest {
	
	WebDriver driver;
	
	@Test
	
	public void actionValidations() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions action= new Actions(driver);
		WebElement furniture=driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/flap/80/80/image/ab7e2b022a4587dd.jpg?q=100']"));
		action.moveToElement(furniture).build().perform();
		Thread.sleep(3000);
		WebElement homedecor=driver.findElement(By.xpath("//a[contains(text(),'Home Decor')]"));
	
		action.moveToElement(homedecor).click().build().perform();
		//WebElement selectproduct= driver.findElement(By.xpath("//a[contains(text(), 'Diseno Decorative White Wallpaper')]"));
		//action.doubleClick(selectproduct).build().perform();
		WebElement searchproduct = driver.findElement(By.xpath("//input[@name='q']"));
		action.moveToElement(searchproduct).click().keyDown(Keys.SHIFT).sendKeys("MI").build().perform();
	}
}
