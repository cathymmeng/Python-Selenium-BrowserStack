from time import sleep
from selenium import webdriver

class Scratch:

    def __init__(self, driverName):
        self.drivers = dict(chrome=webdriver.Chrome, firefox=webdriver.Firefox);
        self.driver = self.drivers['chrome']()
        #self.driver.implicitly_wait(30)
        self.driver.maximize_window()
        print('Created Scratch class.')


    def loadUrl(self, url):
        self.driver.get(url)

    def assertProgressBarPercentage(self, context, requiredValue):
        progressBar = self.driver.find_element_by_xpath('//paper-progress[@itemprop="progressBar"]')
        value = progressBar.get_attribute('value')
        print('Progress Value: ' + value)
        assert int(value) == int(requiredValue)

    def pressButton(self, context, times):
        try:
            button = self.driver.find_element_by_xpath('//paper-button[@itemprop="incrementButton"]')
            for i in range(int(times)):
                button.click()
                sleep(2)
        except Exception as e:
            print(e)
            assert True is False
