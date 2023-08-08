package tests;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserStackDriver;
import drivers.LocalDriver;
import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static com.codeborne.selenide.Selenide.*;
import io.qameta.allure.selenide.AllureSelenide;
public class TestBase {

    static String deviceHost = System.getProperty("deviceHost", "browserStack");

    @BeforeAll
    static void beforeAll() {
        switch (deviceHost) {
            case "browserStack":
                Configuration.browser = BrowserStackDriver.class.getName();
                break;
            case "local":
                Configuration.browser = LocalDriver.class.getName();
                break;
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
       open();
    }

    @AfterEach
    void afterEach() {
        String sessionId = sessionId().toString();
        System.out.println(sessionId);
        Attach.pageSource();
        if (deviceHost.equals("browserStack")) {
            Attach.addVideo(sessionId);
        }
        closeWebDriver();
    }
}
