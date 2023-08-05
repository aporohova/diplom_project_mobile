package drivers;
import com.codeborne.selenide.WebDriverProvider;
import config.LocalConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.AutomationName.ANDROID_UIAUTOMATOR2;
public class LocalDriver implements WebDriverProvider {
    LocalConfig config = ConfigFactory.create(LocalConfig.class, System.getProperties());

    public static URL getAppiumServerUrl() {
        try {
            return new URL("http://localhost:4723/");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);
        options.setAutomationName(ANDROID_UIAUTOMATOR2)
                .setPlatformName("Android")
                .setDeviceName(config.getDevice())
                .setPlatformVersion(config.getOsVersion())
                .setApp(getAppPath())
                .setAppPackage("org.wikipedia.alpha")
                .setAppActivity("org.wikipedia.main.MainActivity");
        return new AndroidDriver(getAppiumServerUrl(), options);
    }

    private String getAppPath() {
        String appPath = "src/test/resources/apps/test.zip";
        File app = new File(appPath);
        return app.getAbsolutePath();
    }
}
