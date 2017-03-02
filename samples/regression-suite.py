#!/usr/local/bin/python

from selenium import webdriver

# import all of the feature tests
from FeatureSet001 import featureTest001
from FeatureSet001 import featureTest002

# register all of the Selenium drivers
drivers = dict(chrome=webdriver.Chrome, firefox=webdriver.Firefox);

# define all of the test you want to do, in the order you want to do them
testDefinitionList = [
    dict(driver="firefox", featureTest=featureTest001),
    dict(driver="chrome", featureTest=featureTest002),
    dict(driver="chrome", featureTest=featureTest001)
]

# for each feature definition, load the driver, and run the feature test
for testDefinition in testDefinitionList:
    driverKey = testDefinition['driver']
    driver = drivers[driverKey]()
    driver.implicitly_wait(30)
    driver.maximize_window()
    featureTest = testDefinition['featureTest']
    featureTest(driver)
    driver.quit()
