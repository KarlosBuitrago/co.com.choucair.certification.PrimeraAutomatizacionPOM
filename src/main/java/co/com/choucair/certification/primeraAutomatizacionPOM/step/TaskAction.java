package co.com.choucair.certification.primeraAutomatizacionPOM.step;

import co.com.choucair.certification.primeraAutomatizacionPOM.pageObject.PaginaUrl;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class TaskAction {
    private PaginaUrl paginaUrl;

    @Step
    public void signIn(){
        paginaUrl.user.sendKeys("demo");
        paginaUrl.pass.sendKeys("demo");
        paginaUrl.btn_sign_in.click();
    }

    @Step
    public void verificar(){
        assertThat(paginaUrl.lbl_Menu.isCurrentlyVisible(),is(true));
    }
}
