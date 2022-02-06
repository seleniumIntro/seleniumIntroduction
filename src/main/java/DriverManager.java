import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver wd;
    private static void setDriver(){
        wd = new ChromeDriver(WebDriverConfig.configChrome());
    }

    public  static WebDriver getDriver(){
        if(wd == null){
            setDriver();
        }
        return wd;
    }
}
