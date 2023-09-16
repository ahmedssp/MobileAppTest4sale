# Mobile App Automation Testing Task for "4Sale" Android APK 

It was created By Ahmed Mostafa Abdellsalame - september 16, 2023.  UI Mobile APP 4Sale (Android) Automation Testing .

Automation script with Java. by using IntelliJ , Appium v-2.1.3, android emulator v-14

Project test Scenarios, features list, and Test techniques:

-Add desired capabilities at @Before method 
-Download 4Sale App and save it in Resource folder of project to call its payh
-Create Pages or Screens Locate Elements separately
- Execution steps for test :
     

        Click on Post and Add Botton
        navigate to Login_page and send Phone and password
        navigate to  category Screen and click on it 
        SelectFirest_Catg_by send keys (Automaotive)
        Select_Sup Category from main category by searching for required value (Classic Cars);
        CLICK_Next_Boutton()
        Assert Three messages appears when mandatory field not filled And applay soft assertion ("mandatory", "required", "required")
        Select_ServiceLocation(Location);
        Click_Done botton;
        Select Area from dropdown list And Send Data from Excel Sheet :"dasma"
        Click_Done()
        Select BLOCK from dropdown list And Send Data from Excel Sheet :"Block 1"
        Click_Done()
        Click Botton_Don() to navigate to next filed 
        Send information Title And Send Data from Excel Sheet "any data"
        Send Price And Send Data from Excel Sheet "any data"
        Click Botton_Don() to navigate next Screen of add meadia 
        Assert that Screen contains Element text=add media 

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



