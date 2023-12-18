package Test_Package;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Utility_Package.Excel_Utility;



import Base_package.Base_FAcebbok;

import Page_Package.Page_Facebook;

public class FAcebbok_test  extends Base_FAcebbok{
	private Page_Facebook facebookLoginPage;

    @BeforeMethod
    public void setUpTest() {
        setUp();
        facebookLoginPage = new Page_Facebook(driver);
        facebookLoginPage.navigateToLoginPage("https://www.facebook.com");
    }

    @Test(dataProvider = "loginData")
    public void loginToFacebookTest(String username, String password) {
        facebookLoginPage.login(username, password);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
        
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() throws IOException {
        String excelFilePath = "C:\\username4.xlsx";
        return Excel_Utility.readExcelData(excelFilePath);
    }

}
