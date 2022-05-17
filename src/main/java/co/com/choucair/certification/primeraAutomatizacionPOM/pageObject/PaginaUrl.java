package co.com.choucair.certification.primeraAutomatizacionPOM.pageObject;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class PaginaUrl extends PageObject {

    @FindBy(xpath = "//input[@placeholder='Username]")
    public WebElementFacade user;
    @FindBy(xpath = "//input[@placeholder='Password]")
    public WebElementFacade pass;
    @FindBy(xpath = "//button[contains(text(),'Sign in]")
    public WebElementFacade btn_sign_in;

}
