package peppbaggio.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import peppbaggio.TestBase;
import peppbaggio.pages.DuckDuckGoSelector;
import peppbaggio.pages.GoogleSelector;
import peppbaggio.pages.YandexSelector;
import peppbaggio.steps.Steps;

// Класс расширяет TestBase с общими настройками и запуском слушателя перед каждым тестом

public class SearchTest extends TestBase {

    @Test
    @DisplayName("Проверка базового функционала поиска Яндекса")
    @Severity(SeverityLevel.BLOCKER)
    @Epic("Базовый функционал Яндекс")
    @Owner("peppbaggio")
    public void yandexSearchSmokeTest() {

        // Экземпляры классов Steps (где методы) и YandexSelector (где селекторы Яндекса)
        // Со второго запуска тест будет падать из-за капчи
        Steps step = new Steps();
        YandexSelector yandex = new YandexSelector();

        step.openMainPage("https://ya.ru");
        step.searchSomething(yandex.getSearchField(), "Надоела капча Яндекса");
        step.checkLogoIsVisible(yandex.getLogo());

    }

    // Тоже будет падать из-за капчи
    @Test
    @DisplayName("Проверка базового функционала поиска Google")
    @Severity(SeverityLevel.BLOCKER)
    @Epic("Базовый функционал Google")
    @Owner("peppbaggio")
    public void googleSearchSmokeTest() {

        Steps step = new Steps();
        GoogleSelector google = new GoogleSelector();

        step.openMainPage("https://google.com");
        step.searchSomething(google.getSearchField(), "У Гугла нет капчи");
        step.checkLogoIsVisible(google.getLogo());

    }

    // Падать не должен. И у них в лого точно есть data-testId )))
    @Test
    @DisplayName("Проверка базового функционала поиска DuckDuckGo")
    @Severity(SeverityLevel.BLOCKER)
    @Epic("Базовый функционал Google")
    @Owner("peppbaggio")
    public void DuckDuckGoSearchSmokeTest() {

        Steps step = new Steps();
        DuckDuckGoSelector duck = new DuckDuckGoSelector();

        step.openMainPage("https://duckduckgo.com");
        step.searchSomething(duck.getSearchField(), "Дак-дак-гоу рулит! У них есть data-testId!!!");
        step.checkLogoIsVisible(duck.getLogo());

    }

}
