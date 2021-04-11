package com.appicaltest.appicaltest;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    public SelenideElement customerCasesMenuItem = $$(".menu-item a").findBy(text("Customer Cases"));
    public SelenideElement pepsicoItem = $$(".menu-item a").findBy(text("Pepsico"));
    public SelenideElement languageDropdown = $(".wpml-ls-current-language");
    public SelenideElement englishLanguageItem = $("#menu-item-wpml-ls-8-en");

}
