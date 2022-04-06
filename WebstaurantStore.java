import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebstaurantStore {

    public static void main (String [] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/abufarzan/Desktop/Automation/chromedriver-2");

        ChromeOptions options = new ChromeOptions();

        options.addArguments("incognito");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://www.webstaurantstore.com/");

        driver.findElement(By.name("searchval")).sendKeys("stainless work table");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@value='Search']")).click();

        Thread.sleep(2000);

        driver.findElements(By.xpath("//*[contains(text(),'Table')]"));

        JavascriptExecutor js = ((JavascriptExecutor) driver);

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(2000);

        driver.findElement(By.name("addToCartButton")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@href='/viewcart.cfm']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[contains(@class, 'deleteCartItemButton itemDelete__link itemDelete--positioning')]")).click();


    }

}
