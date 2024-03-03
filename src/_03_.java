import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class _03_ extends BaseDriver {
    @Test
    public void _03_() {
        driver.get("https://www.snapdeal.com/");

        driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("teddy bear" + Keys.ENTER);

        WebElement condition = driver.findElement(By.xpath("//span[@style='color: #212121; font-weight: normal']"));
        Assert.assertTrue("İstenen metin görünmüyor!", condition.getText().contains("We've got "));


        WaitAndClose();
    }
}
