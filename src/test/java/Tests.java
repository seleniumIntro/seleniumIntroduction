import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Tests extends WdBase{

    public void auth(){
        wd.get("https://www.mail.ru");
        wd.findElement(By.className("email-input")).sendKeys("selenium.introduction");
        wd.findElement(By.xpath("//*[@id=\"mailbox\"]/form[1]/button[1]")).click();
        wd.findElement(By.xpath("//input[@data-testid=\"password-input\"]")).sendKeys("qwerty@2020");
        wd.findElement(By.xpath("//button[@data-testid=\"login-to-mail\"]")).click();
    }

    @Test
    public void firstTest() {
        auth();

        //id
        //wd.findElement(By.xpath("//button[@data-testid=\"login-to-mail\"]")).click();
        //className
        //cssSelectoer
        //partLink

    }

    @Test
    public void waitTest() {
        wd.get("https://www.yandex.ru");
        // По-другому это можно сделать так:
        // driver.navigate().to("https://www.yandex.ru");

        //явное ожидание
//        WebElement element = (new WebDriverWait(wd, Duration.ofSeconds(10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));

    }
}
