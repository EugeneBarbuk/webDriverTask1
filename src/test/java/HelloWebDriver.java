import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelloWebDriver {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://seleniumhq.org");
        new WebDriverWait(webDriver,10).
                until(ExpectedConditions.presenceOfElementLocated(By.id("q")));

        WebElement searchInput = webDriver.findElement(By.id("q"));
        searchInput.sendKeys("selenium java");
        WebElement searchBtn = webDriver.findElement(By.xpath("//*[@value='Go']"));
        searchBtn.click();
//        new WebDriverWait(webDriver,10).
//                until(ExpectedConditions.presenceOfElementLocated(By.id("q")));
        webDriver.quit();
    }
}
