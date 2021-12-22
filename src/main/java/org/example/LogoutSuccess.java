package org.example;

import org.openqa.selenium.By;

public class LogoutSuccess extends Utils{

    By _logOutOption = By.xpath("//a[@href='/index.php/auth/logout']");


    public void IShouldBeLoggedOutSuccessfully(){

    }

    public void clickOnLogOutOption()
    {
        clickOnElement(_logOutOption);
    }


}
