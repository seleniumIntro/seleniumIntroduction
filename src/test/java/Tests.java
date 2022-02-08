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
        //современный подход с метками для тестировщиков
        wd.findElement(By.xpath("//*[@id=\"mailbox\"]/form[1]/button[1]")).click();
        // пример работы с input
        wd.findElement(By.xpath("//input[@data-testid=\"password-input\"]")).sendKeys("qwerty@2020");
        // пример работы с button
        wd.findElement(By.xpath("//button[@data-testid=\"login-to-mail\"]")).click();

        // пример работы с амазоном
        //wd.findElement(By.id("continue")).click();
    }

    @Test
    public void firstTest() {
        auth();

    }

    @Test
    public void createLatter() {
        auth();
        wd.findElement(By.partialLinkText("Написать")).click();

    }

    @Test
    public void sentLatter()  {
        auth();
        wd.findElement(By.linkText("Отправленные")).click();

    }


    @Test
    public void getLetterTitle() {
        auth();
        String text = wd.findElement(By.className("ll-sj__normal")).getText();
        System.out.println(text);

    }
    @Test
    public void getCssValue() {
        auth();
        String cssValue = wd.findElement(By.cssSelector(".ph-whiteline")).getCssValue("font-size");
        System.out.println(cssValue);
    }


    @Test
    public void waitTest() {
        wd.get("https://www.yandex.ru");
        // По-другому это можно сделать так:
        // driver.navigate().to("https://www.yandex.ru");

        //явное ожидание
        WebElement element = (new WebDriverWait(wd, Duration.ofSeconds(50))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));

    }
}
