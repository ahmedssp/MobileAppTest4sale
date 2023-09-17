# Mobile App Automation Testing Task for "4Sale" Android APK 

It was created By Ahmed Mostafa Abdellsalame - september 16, 2023.  UI Mobile APP 4Sale (Android) Automation Testing .

Automation script with Java. by using IntelliJ , Appium v-2.1.3, android emulator v-14

Project test Scenarios, features list, and Test techniques:

-Add desired capabilities at @Before method 
-Download 4Sale App and save it in Resource folder of project to call its payh
-Create Pages or Screens Locate Elements separately

Using the following dependencies:

- Selenium java 
"https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java".
- io.appium
"https://mvnrepository.com/artifact/io.cucumber/cucumber-testng" .
- apache.poi and poi-ooxml
"https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml" .
- extentreports
"https://mvnrepository.com/artifact/com.aventstack/extentreports".

Testing app: 4Sale, "https://play.google.com/store/apps/details?id=com.forsale.forsale".
Apply Page Object Model (POM) design pattern in project .

Apply Data Driven testing by Passing data to DataProvider from Excel Sheet in TestNG .

Applay Waiting Strategies.

Handling allerts 

-The Execution steps for test as follows :
     
        1-Click on Post and Add Botton
        2-navigate to Login_page and send Phone and password
        3-navigate to  category Screen and click on it 
        4-SelectFirest_Catg_by send keys (Automaotive)
        5-Select_Sup Category from main category by searching for required value (Classic Cars);
        6-CLICK_Next_Boutton()
        7-Assert Three messages appears when mandatory field not filled And applay soft assertion ("mandatory", "required", "required")
        8-Select_ServiceLocation(Location);
        9-Click_Done botton;
        10-Select Area from dropdown list And Send Data from Excel Sheet :"dasma"
        11-Click_Done()
        12-Select BLOCK from dropdown list And Send Data from Excel Sheet :"Block 1"
        13-Click_Done()
        14-Click Botton_Don() to navigate to next filed 
        15-Send information Title And Send Data from Excel Sheet "any data"
        16-Send Price And Send Data from Excel Sheet "any data"
        17-Click Botton_Don() to navigate next Screen of add meadia 
        18-Assert that navigate to Add Media Screen by assert it contains Element text="add media" 
_____________________________________________________________________________________________________
Youtube Link for automation Execution Video
-https://www.youtube.com/watch?v=c1uM_KGrzK8

......................................................................................................
