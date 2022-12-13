package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class basePage {

    public WebDriver driver;
    public basePage (WebDriver driver){this.driver = driver;}

    public void click(By element) throws Exception {
        try {
            driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("Could not click on the button" + element);
        }
    }

    public void click(WebElement element) throws Exception{
        try{
            element.click();
        }catch(Exception e){
            throw new Exception("No se pudo clickear sobre el elemento"+ element);
        }
    }
    public boolean isDisplayed(By element) throws Exception {
        try {
            return driver.findElement(element).isDisplayed();
        }catch (Exception e){
            throw new Exception("The element " + element + " is not visible in the DOM");
        }
    }
    public boolean isDisplayed(WebElement element) throws Exception{
        try{
            return element.isDisplayed();
        }catch(Exception e){
            throw new Exception("No se pudo encontrar el elemento"+ element);
        }
    }

    public String getText(By element) throws Exception {
        try {
           return driver.findElement(element).getText();


        }catch (Exception e){
            throw new Exception("Could not get the text of the following element: " + element);
        }
    }
    public String getText(WebElement element) throws Exception{
        try{
            return element.getText();
        }catch(Exception e){
            throw new Exception("No se pudo obtener el texto del elemento"+ element);
        }
    }

    public String gettitle() throws Exception{
        try{
            return driver.getTitle();
        }catch(Exception e){
            throw new Exception("No se pudo obtener el titulo de la pestaña");
        }
    }



 /*   1. Extraer el texto del encabezado (tag \<h1>).
// return driver.findElement(By.xpath("//h1"));


            1. Hacer Click en el botón (tag \<button>) y extraer la URL del link (tag \<a>) que **aparecerá luego de unos segundos**.
            ###### Nota: Luego de clickar el botón, la página añadirá el nodo \<a> al DOM con un href aleatorio.
// driver.findElement(By.xpath("//button")).click();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// return driver.findElement(By.xpath("//a"));
            assert.asserttrue(objeto.size != 0,"el elemento no existe")


            3. Hay una parrafo (tag \<p>) el cual se encuentra oculto, deberás obtener su contenido. */
// return driver.findElement(By.xpath("//p"));
// return driver.findElement(By.cssSelector("href="));

    //wait.until(ExpectedConditions.elementToBeClickable(term));
    //term.click();
}