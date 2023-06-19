package config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/app.properties"
})

public interface AuthConfig extends Config {

    @Key("username")
    String getUserName();

    @Key("accessKey")
    String getPassword();

    @Key("baseUrl")
    String getBaseUrl();

}
