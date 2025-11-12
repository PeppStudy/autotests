package peppbaggio.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

// Селектеры для DuckDuckGo и геттеры. Единственный поисковик, который не отлавливает роботов ))
public class DuckDuckGoSelector {

    private final SelenideElement searchField = $("#searchbox_input");
    private final SelenideElement logo   = $("[data-testid=header-logo]");

    public SelenideElement getSearchField() {
        return searchField;
    }

    public SelenideElement getLogo() {
        return logo;
    }


}
