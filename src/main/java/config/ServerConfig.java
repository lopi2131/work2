package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources("classpath:config.properties")
public interface ServerConfig extends Config {

    @Key("url")
    String url();

    @Key("title")
    String title();

    @Key("cookie")
    String cookie();

    @Key("email")
    String email();

    @Key("password")
    String password();

}
