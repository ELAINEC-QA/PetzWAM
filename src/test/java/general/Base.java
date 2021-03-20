package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver; // declarou o objeto do selenium WebDriver, vulgo bola
    //^^ ao usar PageFactory mudar de public p protected

    //V criar um construtor e inicializar os eleementos Pagefactory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
