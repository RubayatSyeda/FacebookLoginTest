package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import reusables.basePage;

public class FacebookHomePage extends basePage {

    private  final By usernameTextBoxLocator = By.xpath("//input[@id='email']");
    private final By passwordTextBoxLocator = By.xpath("//input[@id='pass']");
    private final By signInButtonLocator = By.xpath("//button[@name='login']");

    private static final Logger logger = LogManager.getLogger(FacebookHomePage.class);

    public FacebookHomePage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        WebElement usernameTextBox = driver.findElement(usernameTextBoxLocator);
        logger.info("Inserting username");
        sendkeys(usernameTextBox,username);
    }


    public void enterPassword(String password) {
        WebElement passwordTextBox = driver.findElement(passwordTextBoxLocator);
        logger.info("Inserting password");
        sendkeys(passwordTextBox, password);
    }



    public void clickSignInButton() {
        WebElement signInButton = driver.findElement(signInButtonLocator);
        Assert.assertTrue(signInButton.isEnabled());
        logger.info("Clicking on sign in button");
        click(signInButton);

    }
}

