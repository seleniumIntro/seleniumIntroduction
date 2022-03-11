import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;


public class WdBase {

    protected WebDriver wd = DriverManager.getDriver();

    @AfterEach
    public void quit() {

        wd.close();
        wd.quit();
    }


}
