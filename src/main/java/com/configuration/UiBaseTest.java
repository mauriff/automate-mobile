package com.configuration;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UiBaseTest {

    public AndroidDriver driver = driver();


    @Before
    public AppiumDriver start() throws Exception {
        return driver;
    }

    @AfterClass
    public void stop() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }

    public AndroidDriver driver()  {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.VERSION, "7.1.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "LGH73547d7ec4a");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability("autoGrantPermissions", "true");
        capabilities.setCapability("appPackage", "com.amazonaws.devicefarm.android.referenceapp");
        capabilities.setCapability("appActivity", "com.amazonaws.devicefarm.android.referenceapp.Activities.MainActivity");
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.setLogLevel(Level.INFO);
        return driver;
    }

}
