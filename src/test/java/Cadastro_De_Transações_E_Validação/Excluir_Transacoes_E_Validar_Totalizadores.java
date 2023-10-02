import PageObjects.DevFinancePage;
import helpers.Functions;
import helpers.WebDriverConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class Excluir_Transacoes_E_Validar_Totalizadores {

    WebDriver driver =
            WebDriverConfig.Instance().driver;

    Functions function = new Functions();

    DevFinancePage devFinancePage = new DevFinancePage();

    @Test(priority = 1)
    public void ExcluiTransacoes() throws InterruptedException {

        WebElement BUTTON_EXCLUIR = driver.findElement(devFinancePage.BUTTON_EXCLUIR);

        if(BUTTON_EXCLUIR.isDisplayed()) {

            for (int i = 0; i < 2; i++) {
                function.ClicaComponente(devFinancePage.BUTTON_EXCLUIR);
            }
        }

        Thread.sleep(800);
    }


    @Test(priority = 2)
    public void ValidaTotalizadores(){

        assertEquals("R$ 0,00", function.ObtemTexto(devFinancePage.VALOR_ENTRADA));
        assertEquals("R$ 0,00", function.ObtemTexto(devFinancePage.VALOR_SAIDA));
        assertEquals("R$ 0,00", function.ObtemTexto(devFinancePage.VALOR_TOTAL));
    }


    @AfterTest()
    public void FechaSite(){
        driver.quit();
    }
}