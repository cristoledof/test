package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage{
    private String titulohome="imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
    @FindBy(id = "menu-item-2008")
    private WebElement titleComicsLocator;


            public homePage(WebDriver driver){
        super(driver);
    }
    public boolean homepageisDisplayed() throws Exception{
        return this.gettitle().equals(titulohome);

    }
    public void homepageclick() throws Exception{
        this.click(titleComicsLocator);
    }
}
