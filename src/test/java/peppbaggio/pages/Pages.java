package peppbaggio.pages;

import com.codeborne.selenide.SelenideElement;
import peppbaggio.elements.SearchField;
import peppbaggio.elements.StaticImageElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

// Методы Селенида

public class Pages {

    // Открываем страницу, урл в параметре
    public void openMainPage(String url) {
        open(url);
    }

    public void searchSomething(SelenideElement searchField, String value) {
        SearchField field = new SearchField();

        field.checkVisible(searchField)
                .checkClickable(searchField)
                .clickField(searchField)
                .setValue(searchField, value);
    }

    public void checkLogoIsVisible(SelenideElement logo) {
        StaticImageElement element = new StaticImageElement();

        element.checkVisible(logo);
    }

}
