package peppbaggio.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;

public class SearchField {


    public SearchField checkVisible(SelenideElement searchField) {
        searchField.shouldBe(visible);

        return this;
    }

    public SearchField checkClickable(SelenideElement searchField) {
        searchField.shouldBe(clickable);

        return this;
    }

    public SearchField clickField(SelenideElement searchField) {
        searchField.click();

        return this;
    }

    public SearchField setValue(SelenideElement searchField, String value) {
        searchField.setValue(value).pressEnter();

        return this;
    }
}
