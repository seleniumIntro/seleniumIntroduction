import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;

import java.util.Objects;

public class WdBase {

    protected WebDriver wd = DriverManager.getDriver();

    @AfterEach
    public void quit(){
        wd.close();
        wd.quit();
    }


}
