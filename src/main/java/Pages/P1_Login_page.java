package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class P1_Login_page {
    private static AppiumDriver d;

    public P1_Login_page(AppiumDriver d) {
        this.d = d;
    }

    private By PhoneNO_filed = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText");
    private By Password_filed = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");
    private By PressLoginBotton_filed = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[4]/android.widget.Button");

    public void SendPhoneNO(String PhoneNO) {
        d.findElement(PhoneNO_filed).click();
        d.findElement(PhoneNO_filed).sendKeys(PhoneNO);
    }

    public void Sendpassword(String Password) {
        d.findElement(Password_filed).click();
        d.findElement(Password_filed).sendKeys(Password);
    }

    public P2_Add_And_Post_page PressLoginBotton() {
        d.findElement(PressLoginBotton_filed).click();
        return new P2_Add_And_Post_page(d);
    }

}
