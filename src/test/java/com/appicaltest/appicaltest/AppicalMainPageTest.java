package com.appicaltest.appicaltest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppicalMainPageTest {
    MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open("https://appical.net");
    }

    @Test
    public void search() {
        mainPage.languageDropdown.hover();

        mainPage.englishLanguageItem.click();

        assertEquals("https://appical.net/en/", WebDriverRunner.url());

        mainPage.customerCasesMenuItem.hover();
        mainPage.pepsicoItem.click();

        assertEquals("https://appical.net/en/cases/pepsico/", WebDriverRunner.url());

        $("a.case-nav-right").scrollIntoView(true);
        $("a.case-nav-right").click();
        assertEquals("https://appical.net/en/cases/case-study-baker-tilly-2/", WebDriverRunner.url());

    }

}
