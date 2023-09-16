package Testing_Package;

import Base_package.Sutep;
import DATA.apachi_POI;
import Pages.P1_Login_page;
import Pages.P2_Add_And_Post_page;
import org.testng.annotations.Test;


public class Test_1 extends Sutep {

    @Test(dataProvider = "exceldata", dataProviderClass = apachi_POI.class)
    public void test1(String Phone, String Password, String Firest_Catg, String Sup_Catg, String Location, String Area, String Block, String Title, String Price) throws InterruptedException {
        P1_Login_page Login_page = DefultPage.postAndAdd_click();
        Login_page.SendPhoneNO(Phone.replace("\"", ""));
        Login_page.Sendpassword(Password);
        P2_Add_And_Post_page Add_And_Post = Login_page.PressLoginBotton();
        Add_And_Post.Click_category();
        Add_And_Post.SelectFirest_Catg_Automaotive(Sup_Catg);
        Add_And_Post.Select_SupCat(Firest_Catg);
        Add_And_Post.CLICK_Next_Boutton();
        Add_And_Post.AssertMessegesAppeared("mandatory", "required", "required");
        Add_And_Post.Select_ServiceLocation(Location);
        Add_And_Post.Click_Done();
        Add_And_Post.SelectArea(Area);
        Add_And_Post.Click_Done();
        Add_And_Post.SelectBLOCK(Block);
        Add_And_Post.Click_Done();
        Add_And_Post.Botton_Don();
        Add_And_Post.Send_info_Title(Title);
        Add_And_Post.send_info_Price(Price);
        Add_And_Post.Botton_Don();
        Add_And_Post.AssertScrean_AddMedia("add media");

    }

}
