import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSeleniumIT {

	WebDriver wd;

	@BeforeMethod
	public void init() {
		wd = new ChromeDriver();
		wd.get("https://telranedu.web.app/home");
	}

	@Test
	public void test(){
		System.out.println("Test started");
		WebElement element = wd.findElement(By.tagName("a"));

		wd.findElement(By.xpath("//a"));

		List<WebElement> elements = wd.findElements(By.tagName("div"));
		System.out.println(elements.size());
		wd.findElement(By.linkText("HOME"));
		wd.findElement(By.xpath("//*[text()='HOME']"));
		wd.findElement(By.xpath("//*[.='HOME']"));

		wd.findElement(By.xpath("//*[@href='/home']"));

		wd.findElement(By.partialLinkText("HO"));
		wd.findElement(By.xpath("//*[contains(text(), 'HO')]"));

		wd.findElement(By.id("root"));
		wd.findElement(By.xpath("//*[@id='root']"));

		wd.findElement(By.cssSelector("#root"));
		wd.findElement(By.xpath("//*[@id='root']"));



		//Next Lesson 4 CSS Selector

		wd.findElement(By.cssSelector("[href='/login']"));
		wd.findElement(By.xpath("//*[@href='/login']"));

		wd.findElement(By.cssSelector("[href^='/lo']"));
		wd.findElement(By.xpath("//*[starts-with(@href, '/lo')]"));

		wd.findElement(By.cssSelector("[href*='og']"));
		wd.findElement(By.xpath("//*[contains(@href, 'og')]"));

		wd.findElement(By.cssSelector("[href$='gin']"));
		//no xPath

		List<WebElement> buttons = wd.findElements(By.tagName("button"));

	}



	@AfterMethod
	public void tearDown () {
		wd.close();
		wd.quit();
	}
}
