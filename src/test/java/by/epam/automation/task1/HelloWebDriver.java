package by.epam.automation.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelloWebDriver {
    private static final String PAGE = "https://pastebin.com";
    private static final int TIME_OUT_SECOND = 10;
    By expirationFieldLocator = By.xpath("//*[@id='myform']//div[2]/div/span/span[1]/span");

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(PAGE);
        new WebDriverWait(driver, TIME_OUT_SECOND).
                until(ExpectedConditions.presenceOfElementLocated(By.id("paste_code")));

        WebElement searchInputPaste = driver.findElement(By.id("paste_code"));
        searchInputPaste.sendKeys("Hello from WebDriver");
        new WebDriverWait(driver, TIME_OUT_SECOND).
                until(ExpectedConditions.presenceOfElementLocated(By.className("select2-selection__rendered")));
        driver.findElement(By.xpath("//*[@id='myform']//div[2]/div/span/span[1]/span")).click();
        Select expiration = new Select(driver.findElement(By.xpath("//*[@id='myform']/div[3]/div[2]/div[2]/select")));
        expiration.selectByValue("10M");
        driver.findElement(By.xpath("//*[@id='myform']//div[2]/div/span/span[1]/span")).click();
        WebElement searchInputName = driver.findElement(By.xpath("//*[@id='myform']//div[5]/div[2]/input"));
        searchInputName.sendKeys("helloweb");
     //   Thread.sleep(5000);


// clicking on the pseudo option
//        driver.FindElement(By.Id("select2-selection-tn-container")).Click()

//        Select drpTime = new Select(driver.findElement(By.className("select2-selection__rendered")));
//      drpTime.selectByVisibleText("10 Minutes");
//        WebElement searchBtn = driver.findElement(By.xpath("//*[@value='Go']"));
//        searchBtn.click();
//        new WebDriverWait(driver,10).
//                until(ExpectedConditions.presenceOfElementLocated(By.id("q")));
        driver.quit();
    }
}
