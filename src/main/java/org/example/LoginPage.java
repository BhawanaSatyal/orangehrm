package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils {

    By _userNameField = By.id("txtUsername");
    By _passwordField = By.id("txtPassword");
    By _submitButton = By.id("btnLogin");


    public void IEnterUserName() {

        typeText(_userNameField, loadProp.getProperty("username"));

    }
    public void IEnterValidPassword(){
        typeText(_passwordField, loadProp.getProperty("password"));
    }

        public void IclickOnLoginButton() {

            clickOnElement(_submitButton);


        }
    }
