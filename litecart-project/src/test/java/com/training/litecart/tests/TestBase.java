package com.training.litecart.tests;


import com.training.litecart.appmanager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;



public class TestBase {

    protected static final ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeSuite
    public void setUp() throws Exception {
        app.init();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        app.stop();
    }

    }

