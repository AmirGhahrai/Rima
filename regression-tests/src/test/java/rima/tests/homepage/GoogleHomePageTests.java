package rima.tests.homepage;

import org.testng.annotations.Test;
import rima.framework.core.BaseTest;
import rima.pageobjects.homepage.GoogleHomepage;

public class GoogleHomePageTests extends BaseTest {

    @Test
    public void dummyTest() {

    }

//    @Test
    public void homepageTests() {
        GoogleHomepage googleHomepage = new GoogleHomepage(getDriver());
    }
}
