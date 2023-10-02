import PageObjects.DevFinancePage;
import helpers.Functions;
import helpers.WebDriverConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Cadastro_E_Validacao_Transacao_De_Entrada {

    WebDriver driver =
            WebDriverConfig.Instance().driver;

    Functions function = new Functions();

    DevFinancePage devFinancePage = new DevFinancePage();

    @Test(priority = 1)
    public void CadastraNovaTransacaoEntrada() throws InterruptedException {

        new WebDriverWait(driver, Duration.ofSeconds(2));

        function.ClicaComponente(devFinancePage.NOVA_TRANSACAO);

        // Preenche valores e descrições da transação

        function.PreencheCampo(devFinancePage.DESCRICAO, "Transação padrão - Entrada de valor");
        function.PreencheCampo(devFinancePage.VALOR, "55,33");
        function.PreencheCampo(devFinancePage.DATA, "10/10/2023");

        new WebDriverWait(driver, Duration.ofSeconds(1));

        // Confirma Alterações

        function.ClicaComponente(devFinancePage.BUTTON_SALVAR);
    }


    @Test(priority = 2)
    public void ValidaCadastroDaTransacao(){

        assertEquals("Transação padrão - Entrada de valor" , function.ObtemTexto(devFinancePage.DESCRICAO_CADASTRADA_ENTRADA));
        assertEquals( "R$ 55,33" , function.ObtemTexto(devFinancePage.VALOR_CADASTRADO_ENTRADA));
        assertEquals("10/10/2023" , function.ObtemTexto(devFinancePage.DATA_CADASTRADA_ENTRADA));

        // Valida total geral da conta
        assertEquals("R$ 55,33", function.ObtemTexto(devFinancePage.VALOR_TOTAL));

        // Valida total de entrada
        assertEquals("R$ 55,33", function.ObtemTexto(devFinancePage.VALOR_ENTRADA));

    }
}
