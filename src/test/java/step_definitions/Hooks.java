package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class Hooks {

    @Before
    public void init(){
        System.out.println("running before every step definitions");
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
