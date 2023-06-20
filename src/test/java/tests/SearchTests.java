package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase{
    @Test
    @DisplayName("Successful wiki search")
    void wikiSearchTest() {
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });
        step("Verify content", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_container"))
                        .shouldHave(sizeGreaterThan(0)));
//        step("Open page", () ->
//                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_container"))
//                        .first().click());
//        step("Check error", () ->
//                $(AppiumBy.id("org.wikipedia.alpha:id/view_wiki_error_text")).shouldHave(text("An error occurred")));
//
   }}
