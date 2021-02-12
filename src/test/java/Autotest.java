import jdk.jfr.Timespan;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.concurrent.TimeUnit;

public class Autotest {
    public static void main(String[] args)  {


        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/main.py");


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement signup = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));
        signup.click();


        WebElement zip = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
                zip.sendKeys("55555");

        WebElement continuebutton = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        continuebutton.click();

        WebElement firstname = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input"));
        firstname.sendKeys("firstname");

        WebElement lastname = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        lastname.sendKeys("lastname");

        WebElement email = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        email.sendKeys("test@gmail.com");

        WebElement password = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input"));
        password.sendKeys("password");

        WebElement password2 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));
        password2.sendKeys("password");

       WebElement register = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input") );
       register.click();

      WebElement text = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span"));

        Assert.assertEquals("Account is created!", text.getText());


        driver.quit();



    }


}
