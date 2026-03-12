import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Value;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BtlBasePage extends BaseTest{

    public BtlBasePage(WebDriver driver) {
        super(driver);
    }
    public void Nuvigate(String s1,String s2){
        driver.findElement(By.xpath("//a[text()=\"s1\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"s2\"]")).click();
    }
    public void Search(String s){
        driver.findElement(By.id("TopQuestions")).sendKeys(s);
        driver.findElement(By.id("ctl00_SiteHeader_reserve_btnSearch")).click();
    }
}
