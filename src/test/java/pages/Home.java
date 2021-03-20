package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {

    //1- mapeamentos de elementos
    @FindBy(id = "search")
    private WebElement txtInputSearch;

    @FindBy(css = "button.button-search")
     private WebElement btnSearch;

    // 2- construtor
    public Home(WebDriver driver) {
        super(driver);
    }



    // 3- açoes dos elementos

    public void search(String product){
        txtInputSearch.click();//clicar na caixa de pesquisa
        txtInputSearch.clear(); //limpar ao conteudo da caixa de texto
        txtInputSearch.sendKeys(product);// //escreve na caixa de texto

    }
    public void searchWithMagnifierButton(String product){
        txtInputSearch.click();//clicar na caixa de pesquisa
        txtInputSearch.clear(); //limpar ao conteudo da caixa de texto
        txtInputSearch.sendKeys();// //escreve na caixa de texto
        btnSearch.click();//clicar na lupa
    }
    public void searchWithEnter(String product){
        search(product);
        txtInputSearch.sendKeys(Keys.ENTER);
    }

}
