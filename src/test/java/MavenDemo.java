import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class MavenDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http:/www.google.com");
        String title = driver.getTitle();
        WebElement Search = driver.findElement(By.name("q"));
        Search.sendKeys("Messi"+ Keys.ENTER);
        System.out.println(title);
        driver.quit();
        System.out.println("NOt Hiro");
        System.out.println("Hello");
        int a=10;
    }
}
