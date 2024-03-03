import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ extends BaseDriver {
    @Test
    public void _02_() {
        driver.get("https://demo.applitools.com/");

        driver.findElement(By.xpath("//input[@placeholder='Enter your username']")).sendKeys("ttechno@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("techno123.");
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();

        WebElement condition = driver.findElement(By.xpath("//h6[@style='text-align: center;font-size: x-large;color:red']"));
        Assert.assertEquals("İstenen yazı görünmüyor!", "Your nearest branch closes in: 30m 5s", condition.getText());

        WaitAndClose();
    }
}
