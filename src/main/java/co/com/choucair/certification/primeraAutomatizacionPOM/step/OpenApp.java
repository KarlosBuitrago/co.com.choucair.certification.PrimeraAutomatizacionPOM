package co.com.choucair.certification.primeraAutomatizacionPOM.step;

import co.com.choucair.certification.primeraAutomatizacionPOM.pageObject.PaginaUrl;
import net.thucydides.core.annotations.Step;

public class OpenApp {

    private PaginaUrl paginaUrl;

    @Step
    public void AppUrl(){
        paginaUrl.open();
    }
}
