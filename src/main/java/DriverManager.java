import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    private static WebDriver wd;
    private static void setDriver(){
        wd = new ChromeDriver(WebDriverConfig.configChrome());
        //неявное ожидание
        //wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wd.manage().window().maximize();

         //задать разрешение
//        Dimension dimension = new Dimension(480,700);
//        wd.manage().window().setSize(dimension);
    }

    public  static WebDriver getDriver(){
        if(wd == null){
            setDriver();
        }
        return wd;
    }
}
