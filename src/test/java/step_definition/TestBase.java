package step_definition;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.comicsPage;
import pages.homePage;


public class TestBase {
    protected ChromeDriver driver = Hooks.getdriver();
    protected homePage homepage = PageFactory.initElements(driver, homePage.class);
    protected comicsPage comicspage = PageFactory.initElements(driver, comicsPage.class);

}
