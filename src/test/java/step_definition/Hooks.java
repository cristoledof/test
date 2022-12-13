package step_definition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;


public class Hooks {

    private static ChromeDriver driver;
    private static int numberofcase=0;

    @Before
    public void setup(){
        numberofcase ++;
        System.out.println("Escenario"+numberofcase);
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
    /*//Ejecutar en modo Headless sin interfaz
        ChromeOptions ChromeOptions = new ChromeOptions();
        ChromeOptions.addArguments("--headless");
        driver = new ChromeDriver(ChromeOptions);*/
        //Ejecutar navegador con interfaz
        driver = new ChromeDriver();
        //driver.get("./src/test/java/util/page.html");
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After
    public void teardown(){
        System.out.println("Escenario num: "+numberofcase+"Se ejecuto correctamente");
        driver.quit();
    }

    public static ChromeDriver getdriver()
    {
    return driver;

    }

}
