# Mobile App Automation Testing Task for "4Sale" Android APK 

It was created By Ahmed Mostafa Abdellsalame - september 16, 2023.  UI Mobile APP 4Sale (Android) Automation Testing .

Automation script with Java. by using IntelliJ , Appium v-2.1.3, android emulator v-14

Project test Scenarios, features list, and Test techniques:

-Add desired capabilities at @Before method 
-Download 4Sale App and save it in Resource folder of project to call its payh
-Create Pages or Screens Locate Elements separately
- Click on Post and Add Botton 
     
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

Testing app: 4Sale, "https://play.google.com/store/apps/details?id=com.forsale.forsale".

Using the following dependencies:

- Selenium java 
"https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java".
- io.appium
"https://mvnrepository.com/artifact/io.cucumber/cucumber-testng" .
- apache.poi and poi-ooxml
"https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml" .
- extentreports
"https://mvnrepository.com/artifact/com.aventstack/extentreports".

Apply Page Object Model (POM) design pattern in project .

Apply Data Driven testing by Passing data to DataProvider from Excel Sheet in TestNG .

Applay Waiting Strategies.

Handling allerts 



