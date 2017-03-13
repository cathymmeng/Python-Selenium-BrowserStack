from time import sleep
from selenium import webdriver

class TestPageDriver:

    def __init__(self, driverName):
        self.drivers = dict(chrome=webdriver.Chrome, firefox=webdriver.Firefox);
        self.driver = self.drivers[driverName]()
        self.driver.maximize_window()
        #print('Created TestPageDriver class.')

    def loadUrl(self, url):
        self.driver.get(url)

    def setInputField(self, elementName, newValue):
        xpath = '//paper-input[@itemprop="' + elementName + '"]//input'
        element = self.driver.find_element_by_xpath(xpath)
        #print('Set Input Value: ' + newValue)
        element.clear()
        element.send_keys(newValue)

    def getInputField(self, elementName):
        xpath = '//paper-input[@itemprop="' + elementName + '"]'
        element = self.driver.find_element_by_xpath(xpath)
        return element.get_attribute('value')

    def setCheckbox(self, elementName, newValue):
        xpath = '//paper-checkbox[@itemprop="' + elementName + '"]'
        element = self.driver.find_element_by_xpath(xpath)
        value = element.get_attribute('checked')
        if value is not newValue:
            field.click()
