import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class index_rosh_TestIT {

	WebDriver wd;

	@BeforeMethod
	public void init() {
		wd = new ChromeDriver();
		wd.navigate().to("file:///H:/index_test.html");
	}

	@Test
	public void test() {
		System.out.println("======================================================");
		System.out.println("Test Started");

//		WebElement element = wd.findElement(By.tagName("div"));
//		System.out.println(element);
//
//		wd.findElement(By.id("container"));
//
//		wd.findElement(By.tagName("div"));
//
//		List<WebElement> elements = wd.findElements(By.tagName("div"));
//		System.out.println("Find DIVs: " + elements.size());
//
//		String s = wd.findElement(By.className("paragraph")).getText();
//		System.out.println(s);
//
//		String s1 = wd.findElement(By.name("subBox")).getText();
//		System.out.println("Find element By.name" + s1);
//
//		String over = wd.findElement(By.partialLinkText("er th")).getText();
//		System.out.println("###########:" + over);
//
//		//=================================================================================
//		//CSS Selector
//
//		List<WebElement> wdElements = wd.findElements(By.cssSelector("p"));
//		System.out.println("Find <p>: " + wdElements.size());
//
//		wd.findElement(By.cssSelector("#container"));
//		wd.findElement(By.cssSelector(".containerStyle"));
//
//		wd.findElement(By.cssSelector("[href='https://www.lipsum.com/']"));
//		wd.findElement(By.cssSelector("[target='_blank']"));
//
//		wd.findElement(By.cssSelector("[target]"));
//		wd.findElement(By.cssSelector("[target=_blank]"));
//
//		wd.findElement(By.cssSelector("[href*='lipsum']"));
//
//		wd.findElement(By.cssSelector("[href^='https']"));
//
//		wd.findElement(By.cssSelector("[target$=nk]"));
//
//		System.out.println("======================================================");
//		WebElement element1 = wd.findElement(By.cssSelector(".rainbow p:last-child"));
//		System.out.println("5555555: " + element1.getText());
//		System.out.println("======================================================");
//		System.out.println("###");
		System.out.println("======================================================");

		WebElement element = wd.findElement(By.xpath("//*[starts-with(@target, '_bl')]"));
		System.out.println(element.getText());
		System.out.println("======================================================");





	}

	@AfterMethod
	public void tearDown() {
		//wd.close();
		wd.quit();
		//TAG:   wd.findElement(By.xpath("//p"));
		//CLASS: wd.findElement(By.xpath("//*[@class='rainbow']"));
		//ID:    wd.findElement(By.xpath("//*[@id='container']"));
		//Attribute=Value               ("//*[@target='_blank']"));
		//Attribute=Value (PART)        ("//*[contains(@target, 'lan')]"));
		//Attribute=Value (START)       ("//*[starts-with(@target, '_bl')]"));


	}

}
