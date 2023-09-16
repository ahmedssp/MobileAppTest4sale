//import Pages.P0_DefultPage;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
//import io.appium.java_client.service.local.AppiumServiceBuilder;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.*;
//
//import java.io.File;
//import java.net.URL;
//import java.util.HashMap;
//import java.util.concurrent.TimeUnit;
//
//import static org.testng.Assert.assertTrue;
//
//public class AppiumServerDemo {
//
//
//    private AppiumDriver driver;
//    private static AppiumDriverLocalService service;
//
//
//    @BeforeClass
//    public static void startAppiumServer() {
//        AppiumServiceBuilder builder = new AppiumServiceBuilder();
//
//        builder.usingAnyFreePort();
//        // Tell builder where node is installed. Or set this path in an environment variable named NODE_PATH
//        builder.usingDriverExecutable(new File("path_to_node"));
//        // Tell builder where Appium is installed. Or set this path in an environment variable named APPIUM_PATH
//        builder.withAppiumJS(new File("path_to_appium"));
//
//
//        HashMap<String, String> environment = new HashMap();
//        environment.put("PATH", "/usr/local/bin:" + System.getenv("PATH"));
//        builder.withEnvironment(environment);
//
//
//        service = AppiumDriverLocalService.buildService(builder);
//        service.start();
//    }
//
//
//    @BeforeMethod
//    public void startSession() {
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platformName", "Android");
//        caps.setCapability("automationName", "UiAutomator2");
//        caps.setCapability("platformVersion", "14");
//        caps.setCapability("deviceName", "Android Emulator");
//        caps.setCapability("app", System.getProperty("user.dir")+"/Resources/4Sale.apk");
//        d = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
//
//        d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//        caps.setCapability("app", app);
//
//
//        driver = new AndroidDriver<MobileElement>(server.getUrl(), caps);
//    }
//
//
//    @AfterMethod
//    public void endSession() {
//        try {
//            driver.quit();
//        } catch (Exception ign) {}
//    }
//
//
//    @AfterClass
//    public static void stopAppiumServer() {
//        service.stop();
//    }
//
//
//    @Test
//    public void test() {
//        // test code goes here
//        assertTrue(true);
//    }
//}