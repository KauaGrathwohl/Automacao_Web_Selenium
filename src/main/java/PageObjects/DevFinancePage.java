package PageObjects;

import org.openqa.selenium.By;

public class DevFinancePage {

    // Objetos dos casos de teste

    public By VALOR_ENTRADA = By.id("incomeDisplay");
    public By VALOR_SAIDA = By.id("expenseDisplay");
    public By VALOR_TOTAL = By.id("totalDisplay");

    public By NOVA_TRANSACAO = By.xpath("//*[@id=\"transaction\"]/a");
    public By DESCRICAO = By.id("description");
    public By VALOR = By.id("amount");
    public By DATA = By.id("date");


    // Botões de cancelar e salvar transações

    public By BUTTON_CANCELAR = By.xpath("//*[@id=\"form\"]/form/div[4]/a");
    public By BUTTON_SALVAR = By.xpath("//*[@id=\"form\"]/form/div[4]/button");


    // Primeira transação cadastrada de entrada de valor
    public By DESCRICAO_CADASTRADA_ENTRADA = By.xpath("//*[@id=\"data-table\"]/tbody/tr/td[1]");
    public By VALOR_CADASTRADO_ENTRADA = By.xpath("//*[@id=\"data-table\"]/tbody/tr/td[2]");
    public By DATA_CADASTRADA_ENTRADA = By.xpath("//*[@id=\"data-table\"]/tbody/tr/td[3]");


    // Primeira transação cadastrada de saída de valor

    public By DESCRICAO_CADASTRADA_SAIDA = By.xpath("//*[@id=\"data-table\"]/tbody/tr[2]/td[1]");
    public By VALOR_CADASTRADO_SAIDA = By.xpath("//*[@id=\"data-table\"]/tbody/tr[2]/td[2]");
    public By DATA_CADASTRADA_SAIDA = By.xpath("//*[@id=\"data-table\"]/tbody/tr[2]/td[3]");


    // Botão para excluir uma transação

    public By BUTTON_EXCLUIR = By.xpath("//*[@id=\"data-table\"]/tbody/tr[1]/td[4]/img");

    public By GRID_TRANSACAO = By.xpath("//*[@id=\"data-table\"]/tbody/tr");
}
