package peppbaggio;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {
/* Конфигурирует Селенид: базовый урл (здесь пустой), размер браузера по умолчанию и
* загрузку страницы не полностью, а только видимых элементов*/
    @BeforeAll
    public static void setConfig() {
        String url = "";
        Configuration.baseUrl = url;
        Configuration.browserSize = "1980x1024";
        Configuration.pageLoadStrategy = "eager";
    }

    // Запускаем слушатель Селенида для Аллюра, который будет сохранять скриншоты и исходный вид страницы
    @BeforeEach
    public void setListener() {
        SelenideLogger.addListener("allure", new AllureSelenide() .screenshots(true)
                .savePageSource(true));
    }

}