package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class Test extends TestBase {


    @Given("^el usuario se encuentra en home$")
    public void el_usuario_se_encuentra_en_home() throws Throwable {

       /* String titu= driver.findElement(By.xpath("//h1")).getText();
        System.out.println("h1"+titu);

        driver.findElement(By.xpath("//button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String link=driver.findElement(By.xpath("//a")).getAttribute("href");
        System.out.println("link"+link);
        Thread.sleep(2000);
        String parrafo= driver.findElement(By.xpath("//p")).getText();
        System.out.println("parrafo"+parrafo);



*/
        Assert.assertTrue(homepage.homepageisDisplayed());

    }

    @When("^hace clico sobre boton comic$")
    public void hace_clico_sobre_boton_comic() throws Throwable {
        homepage.homepageclick();

    }

    @Then("^se debe redirigir a la pantalla comics$")
    public void se_debe_redirigir_a_la_pantalla_comics() throws Throwable {

        Assert.assertTrue("Error no se direcciono", comicspage.istitlecomicsDisplayed());
             // By.linkText
       // By.partialLinkText
       // By.ByTagName
       // By.cssSelector()
    }


}
