package Base_package;

//import Handler.AppiumServerJava;

import Pages.P0_DefultPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Sutep {
    // protected AppiumServerJava service_c;
    protected AppiumDriver d;
    protected P0_DefultPage DefultPage;
    @BeforeTest // contains configuration and clear
    public void setup() throws MalformedURLException, InterruptedException {
//        service_c.startServer();
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "14");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("app", System.getProperty("user.dir") + "/Resources/4Sale.apk");
        d = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
        DefultPage = new P0_DefultPage(d);
        d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterTest  // end session
    public void tearDown() {
        if (null != d) {
            d.quit();
        }
    }
}
