package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Functions {

    WebDriver driver =
            WebDriverConfig.Instance().driver;


    // ----------------------------- Retorna algum valor em específico com Id ----------------------------------------- //

    public WebElement RetornaValor(By identificador) {

        return driver.findElement(identificador);
    }

    // ---------------------------------- Preenche campo dentro do site --------------------------------------------------- //

    public void PreencheCampo(By identificador, String texto) {

        WebElement componente = RetornaValor(identificador);
        componente.sendKeys(texto);
    }

    // --------------------------------- Clica em algum componente desejado com Id ----------------------------------------- //

    public void ClicaComponente(By identificador) {

        WebElement componente = RetornaValor(identificador);
        componente.click();
    }

    // -------------------------------- Obtém texto que vem do xpath ----------------------------------- //

    public String ObtemTexto(By identificador) {

        WebElement campo = driver.findElement(identificador);
        String valorTexto = campo.getText();

        return valorTexto;
    }
}
