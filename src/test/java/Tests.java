import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Tests extends WdBase{

    @Test
    public void firstTest() {
        wd.get("https://www.mail.ru");
        wd.findElement(By.className("email-input")).sendKeys("selenium.introduction");
        wd.findElement(By.xpath("//*[@id=\"mailbox\"]/form[1]/button[1]")).click();
        //wd.findElement(By.linkText("Ввести пароль")).click();

        wd.findElement(By.xpath("//input[@data-testid=\"password-input\"]")).sendKeys("qwerty@2020");
        wd.findElement(By.xpath("//button[@data-testid=\"login-to-mail\"]")).click();

    }
}
