package peppbaggio.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;

public class SearchField {

    private final SelenideElement searchField;
    private String value;

    public SearchField(SelenideElement searchField, String value) {
        this.searchField = searchField;
        this.value = value;
    }

    public SearchField checkVisible() {
        searchField.shouldBe(visible);

        return this;
    }

    public SearchField checkClickable() {
        searchField.shouldBe(clickable);

        return this;
    }

    public SearchField clickField() {
        searchField.click();

        return this;
    }

    public SearchField setValue() {
        searchField.setValue(value).pressEnter();

        return this;
    }
}
