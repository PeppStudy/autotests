package peppbaggio.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;

public class StaticImageElement {

    private final SelenideElement logo;

    public StaticImageElement(SelenideElement logo) {
        this.logo = logo;
    }

    public void checkVisible() {
        logo.shouldBe(visible);
    }
}
