import sys
sys.path.insert(0, "../constants")

import URL
import SCOPE
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

Class SearchHelper():
	def googleLookup(driver, query, url):
		driver.get(url)
		try:
			box = driver.wait.until(EC.presence_of_element_located((By.NAME, "q")))
			button = driver.wait.until(EC.element_to_be_clickable((By.NAME, "btnK")))
			box.send_keys(query)
			button.click()
		except TimeoutException:
			print("Page element not found, please double check")

if __name__ == "__main__":
	googleLookup(driver, "Smarty Pants Tim", URL.CORP_ONE_URL)
	time.sleep(5)
	# driver.quit()