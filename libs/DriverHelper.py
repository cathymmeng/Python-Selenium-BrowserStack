import sys
sys.path.insert(0, "../constants")

import URL
import SCOPE
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.common.exceptions import NoSuchElementException   

class DriverHelper:
	def __init__(self):
		self.driver = webdriver.Chrome()

	def pageTitlePresent(self, url, title):
		try:
			self.driver.get(url)
			assert title in self.driver.title
			print "TEST PASS: Loading website under test, page title is " + self.driver.title
		except NoSuchElementException:
			return False
		return True

	def close(self):
		self.driver.quit()