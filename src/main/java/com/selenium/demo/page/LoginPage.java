package com.selenium.demo.page;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static base.Enums.PageTitle.LOGIN_PAGE_TITLE;
import static org.testng.Assert.assertEquals;

/**
 * Project Name    : selenium-testng-page-factory-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 7/15/2019
 * Time            : 12:01 PM
 * Description     :
 **/

public class LoginPage extends Base {

    private final WebDriver driver;

    @FindBy(how = How.ID, using = "email")
    private WebElement emailTextBox;
    @FindBy(how = How.ID, using = "passwd")
    private WebElement passwordTextBox;
    @FindBy(how = How.XPATH, using = "//p[@class='submit']//span[1]")
    private WebElement signInButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage checkLoginPageTitle() {
        assertEquals(driver.getTitle(), LOGIN_PAGE_TITLE.asString());
        return this;
    }

    public LoginPage setEmail(String email) {
        emailTextBox.sendKeys(email);
        return this;
    }

    public LoginPage setPassword(String password) {
        passwordTextBox.sendKeys(password);
        return this;
    }

    public LoginPage clickOnSignInButton() {
        signInButton.click();
        return this;
    }

}
