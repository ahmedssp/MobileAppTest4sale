package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import Handler.*;
import org.testng.asserts.SoftAssert;

public class P2_Add_And_Post_page {
    private static AppiumDriver d;
    private By Selectlocation_Filed = By.id("com.forsale.forsale:id/chooseDistrictField");
    private By district_filed = By.id("com.forsale.forsale:id/locationSelectorText");
    private By DonBotton_Filed = By.id("com.forsale.forsale:id/btnProceed");
    private By Area_field1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView[2]/android.view.ViewGroup/android.widget.TextView[2]");
    private By Block_Filed = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView[3]/android.view.ViewGroup/android.widget.TextView[2]");
    private By Txt_LIST = By.className("android.widget.TextView");
    private By Option_lis = By.className("android.view.ViewGroup");
    private By Botton_Don=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.Button");
    private By infoTitle_filed= By.id("com.forsale.forsale:id/adTitleField");
    private By infoTPrice_filed =By.id("com.forsale.forsale:id/adPriceField");
    private By AddMedia_Filed= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");

    public P2_Add_And_Post_page(AppiumDriver d) {
        this.d = d;
    }
    private By allertID_filed = By.id("android:id/button1");
    private By category_filed = By.id("com.forsale.forsale:id/chooseCategoryField");
    private By Firest_Catg_Automaotive_filed = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
    private By FirestCat_ofTheAutomaotive_filed = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]");
    private By Next_Button_filed = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.Button");
    By Txt1_mandatory = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");
    By Txt2_required = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");
    By Txt3_required = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");

    public void Click_category() {
        Wait.waitForElement(d, allertID_filed);
        alertHandling.allertH1(d);
        Wait.waitForElement(d, category_filed);
        d.findElement(category_filed).click();
    }

    public void SelectFirest_Catg_Automaotive(String CategoryName) {
//        Selector(Txt_LIST, Option_lis, CategoryName);
         Wait.waitForElement(d, Firest_Catg_Automaotive_filed);
          d.findElement(Firest_Catg_Automaotive_filed).click();
    }

    public void Select_SupCat(String SupCategoryName) {
        Wait.retryingFindClick(d, FirestCat_ofTheAutomaotive_filed);
        Selector(Txt_LIST, Option_lis, SupCategoryName);
    }

    public void CLICK_Next_Boutton() {
        d.findElement(Next_Button_filed).click();
    }

    public void AssertMessegesAppeared(String m1, String m2, String m3) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(d.findElement(Txt1_mandatory).getText().toLowerCase().contains(m1), "m1Error");
        softAssert.assertTrue(d.findElement(Txt2_required).getText().toLowerCase().contains(m2), "m2Error");
        softAssert.assertTrue(d.findElement(Txt3_required).getText().toLowerCase().contains(m3), "m3Error");
        softAssert.assertAll();
    }
    public void AssertScrean_AddMedia(String m1) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(d.findElement(AddMedia_Filed).getText().toLowerCase().contains(m1), "m1Error");
        softAssert.assertAll();
    }
    public void Select_ServiceLocation(String location) {
        d.findElement(Selectlocation_Filed).click();
        d.findElement(district_filed).click();
        Selector(Txt_LIST, Option_lis, location);
    }

    public void Click_Done() {
        d.findElement(DonBotton_Filed).click();
    }

    public void SelectArea(String Area) {
        d.findElement(Area_field1).click();
        Selector(Txt_LIST, Option_lis, Area);
//
//         String e1="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[";
//         String E2=Integer.toString(1)+"]";
//         for (int x=1; x<3;x++){
//          if ( d.findElement(By.xpath(e1+Integer.toString(x)+"]")).getText().equals(Area)){
//              d.findElement(By.xpath(e1+Integer.toString(x)+"]")).click();
//          };
    }

    public void Selector(By Txt_list, By Option_lis, String Input) {
        Wait.waitForElement(d, Txt_list);
        for (int x = 0; x < d.findElements(Option_lis).size(); x++) {

            if (d.findElements(Txt_list).get(x).getText().toLowerCase().equals(Input)) {
                d.findElements(Option_lis).get(x - 1).click();
            }
        }
    }

    public void SelectBLOCK(String BlockName) {
        d.findElement(Block_Filed).click();
        Selector(Txt_LIST, Option_lis, BlockName);
    }

    public void Botton_Don() {
        d.findElement(Botton_Don).click();
    }

    public void Send_info_Title(String Titel) {
        d.findElement(infoTitle_filed).sendKeys(Titel);
    }

    public void send_info_Price(String price) {
        d.findElement(infoTPrice_filed).sendKeys(price);
    }
}

