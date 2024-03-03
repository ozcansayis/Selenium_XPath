import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_ extends BaseDriver {
    @Test
    public void _06_() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement(By.xpath("//a[text()='Fake Alerts']")).click();
        driver.findElement(By.xpath("//input[@value='Show modal dialog']")).click();
        WebElement ok = driver.findElement(By.xpath("//button[text()='OK']"));
        ok.click();

        Assert.assertFalse("Alert kapanmadı!", ok.isDisplayed());

        WaitAndClose();
    }
}
