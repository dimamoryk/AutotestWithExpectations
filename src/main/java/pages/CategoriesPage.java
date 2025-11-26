package pages;

import annotations.UrlTemplate;
import annotations.Urls;
import org.openqa.selenium.WebDriver;

@Urls(urlTemplate = {
        @UrlTemplate(
                value = "/courses/{1}",
                name = "/template1/"
        )
}
)
@UrlTemplate(value = "/courses/{1}")
public class CategoriesPage extends AbsBasePage<CategoriesPage> {

    public CategoriesPage(WebDriver driver) {
        super(driver);
    }
}