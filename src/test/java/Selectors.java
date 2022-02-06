import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

public class Selectors {

    public static final By loginFrisButton = By.className("button__primary");
    public static final By frisUsername = By.id("username");
    public static final By frisPassword = By.id("password");
    public static final By submit = By.xpath("//input[@type='submit']");
    public static final By newPO = By.className("button__primary");
    public static final By inputSupplier = By.id("Input__supplierid");
    public static final By inputWarehouse = By.id("Input__warehouseid");
}
