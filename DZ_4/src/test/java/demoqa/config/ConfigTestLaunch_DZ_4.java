package demoqa.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class ConfigTestLaunch_DZ_4 {
    public Faker faker = new Faker();


    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
        Configuration.timeout = 10000;
        Configuration.screenshots = true;
    }

    @AfterEach
    public void clean() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }

}