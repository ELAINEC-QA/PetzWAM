package general;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base {
     private Base base; // Objeto local p comunicação da class


    // construtor
    public Hooks(Base base) {
        super();
        this.base = base;
    }
    // before do cucumber
    @Before
    public void setup(){
        //Onde está o driver do browser
        System.setProperty("webdriver.chrome.driver", "driver/chrome/88/chromedriver.exe");

        //Instanciar o driver do chrome
        base.driver = new ChromeDriver();

        // maximizar a tela
        base.driver.manage().window().maximize();
        //definir a espera implicita do selenium
        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }
    // after
    @After
    public void tearDown(){
        base.driver.quit();// destruir o objeto do seleniume
    }
}
