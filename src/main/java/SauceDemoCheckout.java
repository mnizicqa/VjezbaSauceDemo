import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoCheckout {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver_114.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();

        driver.findElement(By.cssSelector(".inventory_list>div:nth-child(4) button")).click();
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        driver.findElement(By.cssSelector("#checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("Mario");
        driver.findElement(By.id("last-name")).sendKeys("Nizic");
        driver.findElement(By.id("postal-code")).sendKeys("71000");
        driver.findElement(By.id("continue")).click();

        driver.findElement(By.id("finish")).click();
        driver.findElement(By.cssSelector("#back-to-products")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
