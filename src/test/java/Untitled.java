import com.configuration.UiBaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.testng.annotations.*;


public class Untitled extends UiBaseTest{
    @Test
    public void testUntitled() throws Exception {
        driver.findElement(By.xpath("//*[@contentDescription='ReferenceApp']")).click();
        driver.findElement(By.xpath("//*[@text='version 1']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='ReferenceApp']")).click();
        driver.findElement(By.xpath("//*[@text='Native Components']")).click();
        driver.findElement(By.xpath("//*[@text='Content Scrolling']")).click();
        driver.swipe(559, 781, 728, 71, 522);
        driver.swipe(506, 881, 621, 359, 500);
        driver.findElement(By.xpath("//*[@contentDescription='ReferenceApp']")).click();
        driver.findElement(By.xpath("//*[@text='Input Controls']")).sendKeys("Hola mundo");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Checkbox' and @class='android.widget.TextView']")));
        driver.findElement(By.xpath("//*[@text='Checkbox' and @class='android.widget.TextView']")).click();
        driver.findElement(By.xpath("//*[@id='input_checkbox']")).click();
    }
}