package com.appium.framework.base;

import io.appium.java_client.AppiumDriver;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class PageObjectConstruct {

    @Autowired
    public BaseAppium appiumBase;

    public AppiumDriver getDriver() {
        return appiumBase.getDriver();
    }

    public BaseAppium getHelper() {
        return appiumBase;
    }

    @PostConstruct
    private void init() {
        appiumBase.initElementsWithFieldDecorator(this);
    }

}
