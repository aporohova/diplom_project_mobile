package tests;
import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;
public class OpenArticleTest extends TestBase{
    @Test
    @DisplayName("Открытие статьи с главной страницы")
    void openArticleFromMainPageTest() {
        step("Нажать на заголовок страницы ", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/horizontal_scroll_list_item_text")).click());
        step("Проверить, что статья открылась", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/view_news_fullscreen_link_card_list"))
                        .shouldHave(sizeGreaterThan(0)));
    }
    @Test
    @DisplayName("Открытие найденной статьи")
    void openArticleTest() {
        step("Поиск статьи", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
        });
        step("Открыть статью", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                        .click());
        step("Проверить ошибку", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/view_wiki_error_text")).shouldBe(Condition.visible);
        });

    }
}
