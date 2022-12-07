import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {
	WebDriver wd;

	@BeforeMethod
	public void init() {
		wd = new ChromeDriver();
		wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
	}

	@Test
	public void tableTestCSS() {
		System.out.println("Test Started");
		//WebElement canada = wd.findElement(By.cssSelector("#customers tr:nth-child(8) td:last-child"));
		WebElement canada = wd.findElement(By.xpath("//table[@id='customers']//tr[8]/td[last()]"));

		String text = canada.getText();
		System.out.println(text);
		Assert.assertEquals(text, "Canada");


//		List<WebElement> row3 = wd.findElements(By.cssSelector("#customers tr:nth-child(3)"));
//		for (WebElement e : row3) {
//			System.out.println(e.getText());
//		}

//		List<WebElement> row4 = wd.findElements(By.cssSelector("#customers tr:nth-child(4)"));
		List<WebElement> row4 = wd.findElements(By.xpath("//table[@id='customers']//tr[4]"));

		text = "";
		for (WebElement element : row4) {
			System.out.println(element.getText());
			text = element.getText();
			if (text.contains("Mexico")) System.out.println("Yes!");
		}
//
//		System.out.println(text.contains("Mexico"));
//
//		List<WebElement> lastCol = wd.findElements(By.cssSelector("#customers td:last-child"));
//		for (WebElement e : lastCol) {
//			System.out.println(e.getText());
//		}
//
//		List<WebElement> tr = wd.findElements(By.cssSelector("#customers tr"));
//		for (int i = 0; i < tr.size(); i++) {
//			if (tr.get(i).getText().contains("Philip Cramer")) {
//				System.out.println(i + 1);
//				return;
//			}
//		}

	}

	@AfterMethod
	public void tearDown() {
		//wd.close();
		wd.quit();
	}

}
