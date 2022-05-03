import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideRepositoryTest {

    @Test
    public void findJUnit5Example() {
        open("https://github.com");

        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
    }
}
