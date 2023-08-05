package config;
import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:local.properties"
})
public interface LocalConfig extends Config {
    @Config.Key("Device")
    String getDevice();

    @Config.Key("OsVersion")
    String getOsVersion();
}