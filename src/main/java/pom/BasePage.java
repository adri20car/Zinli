package pom;

import helpers.Clickable;
import helpers.Inputable;
import helpers.Swipeable;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage implements Clickable, Inputable, Swipeable {

    protected WebDriver driver = null;
    protected WebDriverWait waiter = null;

    @Override
    public WebDriver getDriver() { return this.driver; }

    @Override
    public WebDriverWait waiter() { return this.waiter; }

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.waiter = new WebDriverWait(driver, 60);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


}
