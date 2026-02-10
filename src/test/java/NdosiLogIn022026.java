import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class NdosiLogIn022026 {

    WebDriver driver;
    @Test
    public void loginWithValidCredentialsa() throws InterruptedException{

        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));

        driver= new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
        driver.findElement(By.id("login-email")).sendKeys("mzikalala01@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Khulu@1988");
        driver.findElement(By.id("login-submit")).click();


        String myTask = driver.findElement(By.xpath("//*[@id='app-main-content']/section/div[4]/div[2]/div[1]/h3")).getText();
        Assert.assertTrue(myTask.contains("Task"),
                "Here's an overview of your learning journey");





    }
}
