import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_ extends BaseDriver {
    @Test
    public void _04_() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement(By.xpath("//a[text()='Calculator']")).click();
        driver.findElement(By.xpath("//div[@class='form-label']/input")).sendKeys("25");
        driver.findElement(By.xpath("//div[@class='form-label']/input[2]")).sendKeys("15");
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();

        WebElement answer = driver.findElement(By.xpath("//form[@action='calculator']/following-sibling::div//span"));
        System.out.println("Sonuç: " + answer.getText());


        WaitAndClose();
    }
}
