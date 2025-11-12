package peppbaggio.steps;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import peppbaggio.pages.Pages;

// "Шаги", испрользующие методы класса Pages. Могут быть (и будут) использованы для тестирования любой поисковой системы


public class Steps {

    // Экзмепляр класса. А дальше всё очевидно из названий. SelenideElement -- это класс Селенида
    // для селекторов, в этом параметре будут передаваться значения полей из классов поисковых систем
    Pages pages = new Pages();

    @Step("Открываем страницу поиска")
    public void openMainPage(String url) {
        pages.openMainPage(url);
    }


    @Step("Вводим значение в поле поиска")
    public void searchSomething(SelenideElement searchField, String value) {
        pages.searchSomething(searchField, value);
    }

    @Step("Проверяем наличие лого в левом верхнем углу страницы результатов")
    public void checkLogoIsVisible(SelenideElement logo) {
        pages.checkLogoIsVisible(logo);
    }


}
