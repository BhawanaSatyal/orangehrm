package org.example;


import org.testng.Assert;

public class HomePage extends Utils{

    public void checkIamOnHomePage(){

        Assert.assertTrue(driver.getCurrentUrl().contains("orangehrmlive"), "Incorrect URL");

    }

}
