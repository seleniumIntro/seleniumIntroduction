import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;


public class WdBase {

    protected WebDriver wd = DriverManager.getDriver();

    @AfterEach
    public void quit() throws InterruptedException {
        Thread.sleep(5000);
        wd.close();
        wd.quit();
    }


}
