package config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:local.properties"
})
public interface LocalConfig extends Config {

    @Key("Device")
    String getDevice();

    @Key("OsVersion")
    String getOsVersion();
}