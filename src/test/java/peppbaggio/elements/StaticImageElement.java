package peppbaggio.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;

public class StaticImageElement {
    public void checkVisible(SelenideElement logo) {
        logo.shouldBe(visible);
    }
}
