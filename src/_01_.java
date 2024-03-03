import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ extends BaseDriver {
    @Test
    public void _01_() {
        driver.get("http://demoqa.com/text-box");
        driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Automation");
        driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("Testing@gmail.com");
        driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("Testing Current Address");
        driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']/div[2]/textarea")).sendKeys("Testing Permanent Address");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        WebElement fullName = driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']/p"));
        WebElement email = driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']/p[2]"));
        Assert.assertTrue("Full Name, 'Automation'ı içinde bulundurmuyor!", fullName.getText().contains("Automation"));
        Assert.assertTrue("Email, 'Testing'i içinde bulundurmuyor!", email.getText().contains("Testing"));
        WaitAndClose();
    }
}
