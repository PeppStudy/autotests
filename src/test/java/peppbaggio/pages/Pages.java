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
        SearchField field = new SearchField(searchField, value);

        field.checkVisible()
                .checkClickable()
                .clickField()
                .setValue();
    }

    public void checkLogoIsVisible(SelenideElement logo) {
        StaticImageElement element = new StaticImageElement(logo);

        element.checkV
    }

}
