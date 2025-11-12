package peppbaggio.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

// Класс специфических для Яндекса селекторов и геттеры для них
public class YandexSelector {

    private final SelenideElement searchField = $("#text");
    private final SelenideElement logo   = $(".HeaderLogo");

    public SelenideElement getSearchField() {
        return searchField;
    }

    public SelenideElement getLogo() {
        return logo;
    }
}
