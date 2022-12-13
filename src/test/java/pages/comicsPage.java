package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class comicsPage extends basePage{
    @FindBy(className = "page-title")
    private WebElement cate;
    private String titlepage ="Category: comics";
    public comicsPage(WebDriver driver){super(driver);}
    public boolean istitlecomicsDisplayed() throws Exception{return this.isDisplayed(cate) && this.getText(cate).equals(titlepage);}

}
