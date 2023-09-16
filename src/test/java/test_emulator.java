import Handler.Wait;
import Handler.alertHandling;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class test_emulator {
    AppiumDriver d;

    @BeforeTest // contains configuration and clear
    public void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "14");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("app", System.getProperty("user.dir")+"/Resources/4Sale.apk");
        d = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
        d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterTest  // end session
    public void tearDown() {
        if (null != d) {
            d.quit();
        }
    }
    @Test
    public void t1() throws InterruptedException {
        String main_click="//android.widget.FrameLayout[@content-desc=\"Commercials\"]/android.widget.FrameLayout/android.widget.ImageView";
        String search_click="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText";
        String send_txt="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText";
        //click on ... post and add
//        d.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Post an Ad\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
        d.findElement(By.xpath(main_click)).click();
        d.findElement(By.xpath(search_click)).click();
        d.findElement(By.xpath(send_txt)).sendKeys("car");
        d.findElement(By.xpath(send_txt)).sendKeys(Keys.ENTER);

    }
    @Test
    public void t2() throws InterruptedException {
        String postandadd_click="//android.widget.FrameLayout[@content-desc=\"Post an Ad\"]/android.widget.FrameLayout/android.widget.ImageView";
        String txt1="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText";
        String txt2="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText";
        String login_click="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[4]/android.widget.Button";
        String Alert_id="android:id/button1";
        String category_id="com.forsale.forsale:id/chooseCategoryField";
        String Firest_Catg_Automaotive="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]";
        String Firest_Catg_Automaotive_car="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView[2]";
        String Firest_Catg_Automaotive_car_chevorle="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView[2]";
        String Firest_Catg_Automaotive_car_chevorle_caprice="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]";


        String classic_car="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]";
        String next="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.Button";
        //click on ... post and add
//        d.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Post an Ad\"]/android.widget.FrameLayout/android.widget.ImageView")).click();

        Wait.waitForElement(d,By.xpath(postandadd_click));
        d.findElement(By.xpath(postandadd_click)).click();

        d.findElement(By.xpath(txt1)).click();
        d.findElement(By.xpath(txt1)).sendKeys("00000111");
        d.findElement(By.xpath(txt2)).click();
        d.findElement(By.xpath(txt2)).sendKeys("4saleTest");
        d.findElement(By.xpath(login_click)).click();

        Wait.waitForElement(d,By.id(Alert_id));
//        d.findElement(By.id(Alert_id)).click();
        alertHandling.allertH1(d);

        Wait.waitForElement(d,By.id(category_id));
        d.findElement(By.id(category_id)).click();

        Wait.waitForElement(d,By.xpath(Firest_Catg_Automaotive));
        d.findElement(By.xpath(Firest_Catg_Automaotive)).click();

         Wait.retryingFindClick(d,By.xpath(classic_car));

        d.findElement(By.xpath(next)).click();
        alertHandling.allertH1(d);

        SoftAssert softAssert=new SoftAssert();
         By Txt1_mandatory = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");
        softAssert.assertTrue(d.findElement(Txt1_mandatory).getText().toLowerCase().contains("mandatory"),"1Error");

        By Txt2_required = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");
        softAssert.assertTrue(d.findElement(Txt2_required).getText().toLowerCase().contains("required"),"2Error");
        System.out.println(d.findElement(Txt2_required).getText());

        By Txt3_required = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");
        softAssert.assertTrue(d.findElement(Txt3_required).getText().toLowerCase().contains("required"),"3Error");

        softAssert.assertAll();
        d.findElement(By.id("com.forsale.forsale:id/chooseDistrictField")).click();


        Thread.sleep(6000);


    }
}
