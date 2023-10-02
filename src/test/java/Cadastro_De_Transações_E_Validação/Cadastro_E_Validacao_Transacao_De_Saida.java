import PageObjects.DevFinancePage;
import helpers.Functions;
import helpers.WebDriverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Cadastro_E_Validacao_Transacao_De_Saida {

    WebDriver driver =
            WebDriverConfig.Instance().driver;

    Functions function = new Functions();

    DevFinancePage devFinancePage = new DevFinancePage();

    @Test(priority = 1)
    public void CadastraNovaTransacaoEntrada() {

        new WebDriverWait(driver, Duration.ofSeconds(2));

        function.ClicaComponente(devFinancePage.NOVA_TRANSACAO);

        // Preenche valores e descrições da transação

        function.PreencheCampo(devFinancePage.DESCRICAO, "Transação padrão - Saída de valor");
        function.PreencheCampo(devFinancePage.VALOR, "-25,33");
        function.PreencheCampo(devFinancePage.DATA, "10/10/2023");

        new WebDriverWait(driver, Duration.ofSeconds(1));

        // Confirma Alterações

        function.ClicaComponente(devFinancePage.BUTTON_SALVAR);
    }


    @Test(priority = 2)
    public void ValidaCadastroDaTransacao(){

        assertEquals("Transação padrão - Saída de valor" , function.ObtemTexto(devFinancePage.DESCRICAO_CADASTRADA_SAIDA));
        assertEquals( "-R$ 25,33" , function.ObtemTexto(devFinancePage.VALOR_CADASTRADO_SAIDA));
        assertEquals("10/10/2023" , function.ObtemTexto(devFinancePage.DATA_CADASTRADA_SAIDA));

        // Valida total geral da conta
        assertEquals("R$ 30,00", function.ObtemTexto(devFinancePage.VALOR_TOTAL));

        // Valida total de entrada
        assertEquals("-R$ 25,33", function.ObtemTexto(devFinancePage.VALOR_SAIDA));
    }
}
