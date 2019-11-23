package selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.core.Is.is;

public class SeleniumTest {

    private WebDriver driver;
    @Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tdec\\IdeaProjects\\Introduction to webinar\\src\\test\\resources\\driver\\chromedriver.exe");
    driver = new ChromeDriver();
    }

    @Test
    public void testTodayDate() {
       //given
        driver.get("https://delfi.lt");

        //when
        WebElement title = driver.findElement(By.className("header-date"));

        //then
        Assert.assertThat(title.getText(), is("Lapkričio 17 d., sekmadienis"));
    }

    @After
    public void unMount(){
        driver.close();
    }
}