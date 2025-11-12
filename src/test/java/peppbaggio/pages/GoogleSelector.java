package peppbaggio.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

// Класс с селекторами для гугла

public class GoogleSelector {

    private final SelenideElement searchField = $(".gLFyf");
    private final SelenideElement logo   = $(".logo");

    public SelenideElement getSearchField() {
        return searchField;
    }

    public SelenideElement getLogo() {
        return logo;
    }


}
