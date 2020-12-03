package vijaykumar.newparticeproject;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowerLunch {

	@Test 
	public void launch() throws InterruptedException {

		// Setup the chrome driver
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		// WebDriver driver=new ChromeDriver();
		WebDriver driver = new FirefoxDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Get url using string
		String url = "https://demoqa.com/text-box";
		driver.get(url);

		// String currentUrl="https://demoqa.com/text-box";
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);

		// get URL title /length
		String title = driver.getTitle();
		System.out.println("Demo title:" + title);
		System.out.println("The title of length:" + title.length());

		// get title length
		// int titleLength=driver.getTitle().length();
		// System.out.println("Title length is:" +titleLength);

		// get page source detials
		// String pgSource=driver.getPageSource();
		// System.out.println("page soruce number is:" +pgSource);

		// Enter the text using id element
		// driver.findElement(By.id("userName")).sendKeys("vijay");
		// driver.findElement(By.id("userEmail")).sendKeys("vj@gmail.com");
		// driver.findElement(By.id("submit")).click();

		// Enter the text using xpath
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("vijay");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("vj@gmail.com");
		driver.findElement(By.xpath("//button[@id='submit']")).click();

		// *[@id="tree-node"]/ol/li/span/label/span[1]/svg
		// Get text using get arribute
		String name1 = driver.findElement(By.id("userName")).getAttribute("value");
		System.out.println(name1);

		String mail = driver.findElement(By.id("userEmail")).getAttribute("value");
		System.out.println(mail);

		Thread.sleep(5000);

		// close the window
		driver.close();

	}

}
