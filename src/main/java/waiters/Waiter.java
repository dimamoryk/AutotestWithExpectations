package waiters;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiter {

    protected WebDriver driver;

    public Waiter(WebDriver driver) {
        this.driver = driver;
    }

    public boolean waitForCondition(ExpectedCondition<?> condition) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(condition);

            return true;

        } catch (TimeoutException ignored) {

            return false;
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 4f50a07e6427193872621e3257ef942a79a86db2
