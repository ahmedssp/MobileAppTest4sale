import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class test_physical {
    AppiumDriver driver;

    @BeforeTest // contains configuration and clear
    public void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "11");
        caps.setCapability("deviceName", "FE7H6TPV79TOKBLN");
        caps.setCapability("app", System.getProperty("user.dir")+"/Resources/4Sale_Buy&SellEverything_25.0.3_Apkpure.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterTest  // end session
    public void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }
    @Test
    public void t1() throws InterruptedException {

    }

}
