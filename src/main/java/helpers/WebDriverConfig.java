package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {
    public WebDriver driver;
    private static WebDriverConfig _instance;

    public static WebDriverConfig Instance() {
        if (WebDriverConfig._instance == null) {
            WebDriverConfig._instance = new WebDriverConfig();
        }
        return WebDriverConfig._instance;
    }

    private WebDriverConfig(){

        final String URL_BASE = "https://dev-finance.netlify.app/";

        final String CAMINHO_DRIVER = "C:\\Users\\kaua.machado\\IdeaProjects\\WebAutomation\\resources\\driver\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(URL_BASE);
    }
}
