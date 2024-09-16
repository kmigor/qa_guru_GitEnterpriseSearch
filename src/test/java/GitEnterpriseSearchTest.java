import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitEnterpriseSearchTest {

    @BeforeAll
    static void setUp(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void searchEnterpriseTest(){

        open(Configuration.baseUrl);
        $(".HeaderMenu-nav").$(byText("Solutions")).hover();
        $("[href=\"https://github.com/enterprise\"]").click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered\n" +
                "developer platform."));
    }

}
