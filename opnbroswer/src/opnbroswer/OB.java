package opnbroswer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class OB {
	

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver87\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.wikipedia.org/");
//		driver.findElement(By.xpath("//select[@id='searchLanguage']")).sendKeys("Esperanto");
//		WebElement testDropDown = driver.findElement(By.xpath("//select[@id='searchLanguage']"));
//		Select dropdown = new Select(testDropDown); 
//		dropdown.selectByIndex(5);  
//
//		List<WebElement> values = driver.findElements(By.tagName("option"));
//        System.out.println(values.size());
//        System.out.println(values.get(7).getText());
//        
//        
//        for (int i=0 ;i<values.size();i++) {
//        	System.out.println(values.get(i).getAttribute("lang"));
//        }
//		
//		List<WebElement> links =driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
//		
//		for (WebElement link: links) {
//			System.out.println(link.getText());
//		}
		
		driver.get("http://www.ijetrm.com/");
		driver.get("http://www.ijetrm.com/issue/");
		driver.findElement(By.xpath("//a[@class='issuelink']")).click();
		driver.findElement(By.xpath("//a[@href= 'http://www.ijetrm.com/issues/files/Jan-2020-01-1577875288-1.pdf']")).click();
	}

}
