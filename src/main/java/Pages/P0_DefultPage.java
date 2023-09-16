package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

import static Handler.alertHandling.allertDis;


public class P0_DefultPage   {
    private static AppiumDriver d;
    private By error_refresh = By.id("com.forsale.forsale:id/error_refresh");

    public P0_DefultPage(AppiumDriver d) {
        this.d = d;
    }

    private By ButtonSearch_filed = By.xpath("//android.widget.FrameLayout[@content-desc=\"Post an Ad\"]/android.widget.FrameLayout/android.widget.ImageView");

    public P1_Login_page postAndAdd_click() {

        try {
            d.switchTo().defaultContent();
            if (d.findElement(error_refresh).isDisplayed()){System.out.println("Connection Network Error");}
            d.findElement(error_refresh).click();
        }catch (Exception e){System.out.println("Starting test :postAndAdd_click");}
        Handler.Wait.waitForElement(d,ButtonSearch_filed);
        d.findElement(ButtonSearch_filed).click();
        return  new P1_Login_page(d);
    }

}

