package peppbaggio.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

// Методы Селенида

public class Pages {

    // Открываем страницу, урл в параметре
    public void openMainPage(String url) {
        open(url);
    }

    //* Ищем: селектор для поля поиска дан в параметре (меняется в зависимости от страницы), задаем ему
    // значение из параметра, жмем enter*/
    public void searchSomething(SelenideElement searchField, String value) {
        searchField.setValue(value).pressEnter();
    }

    // проверяем наличие логотипа поисковика. Селектор для логотипа зависит от поисковой системы и
    // задается в параметрах метода. Лого дожно быть видимо
    public void checkLogoIsVisible(SelenideElement logo) {
        logo.shouldBe(visible);
    }

}
