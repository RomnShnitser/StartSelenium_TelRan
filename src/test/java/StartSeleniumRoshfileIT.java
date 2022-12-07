import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSeleniumRoshfileIT {
	WebDriver wd;

	@BeforeMethod
	public void init() {
		wd = new ChromeDriver();
		wd.navigate().to("file:///H:/index_test.html");
	}

	@Test
	public void test() {
		System.out.println("==================================================");
		System.out.println("Test started");
		WebElement element = wd.findElement(By.tagName("a"));

		wd.findElement(By.xpath("//a"));

		List<WebElement> elements = wd.findElements(By.tagName("p"));
		System.out.println(elements.size());

		List<WebElement> wdElements = wd.findElements(By.xpath("//p"));
		System.out.println("##################################################");
		System.out.println("xPath find p");
		for (WebElement wdElement : wdElements) {
			System.out.println(wdElement.getText());
		}
		System.out.println("##################################################");
		WebElement somet = wd.findElement(By.linkText("Over there"));
		System.out.println(somet.getText());

		WebElement ove = wd.findElement(By.partialLinkText("Ove"));
		System.out.println(ove.getText());

		WebElement secondBlock = wd.findElement(By.id("secondBlock"));
		System.out.println(secondBlock.getText());

		System.out.println("xPath_xPath_xPath_xPath_xPath_xPath_xPath_xPath");
		System.out.println("Find by id name");
		WebElement element1 = wd.findElement(By.xpath("//*[@id='container']"));
		System.out.println(element1.getText());

		//Next Lesson 4 CSS Selector
		System.out.println("***********************************************************************");
		//wd.findElement(By.cssSelector("[href='https://www.lipsum.com/']"));
		WebElement element2 = wd.findElement(By.xpath("//*[@href='https://www.lipsum.com/']"));
		System.out.println(element2.getText());

		//wd.findElement(By.cssSelector("[href*='lipsum']"));
		WebElement element3 = wd.findElement(By.xpath("//*[contains(@href, 'lipsum')]"));
		System.out.println(element3.getText());

		//wd.findElement(By.cssSelector("[href^='https']"));
		WebElement element4 = wd.findElement(By.xpath("//*[starts-with(@href, 'https:/')]"));
		System.out.println(element4.getText());

		wd.findElement(By.cssSelector("[href$='.com/']"));
		//xPath Help

		wd.findElement(By.xpath("//*[text()='1 Lorem']"));
		wd.findElement(By.xpath("//*[starts-with(text(), 'Someth')]"));

		//TAG:   wd.findElement(By.xpath("//p"));
		//CLASS: wd.findElement(By.xpath("//*[@class='rainbow']"));
		//ID:    wd.findElement(By.xpath("//*[@id='container']"));
		//Attribute=Value               ("//*[@target='_blank']"));
		//Attribute=Value (PART)        ("//*[contains(@target, 'lan')]"));
		//Attribute=Value (START)       ("//*[starts-with(@target, '_bl')]"));






	}

	@AfterMethod
	public void tearDown() {
		//wd.close();
		wd.quit();
	}
}
