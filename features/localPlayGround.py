# ============================================================
# REMARK: LOCAL installation - macOS Sierra + Chrome
# ============================================================
import sys
sys.path.insert(0, "../constants")
sys.path.insert(1, "../libs")

import URL
from DriverHelper import DriverHelper
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities

# TODO: to be refactored
driver = DriverHelper()
driver.pageTitlePresent(URL.CATHY, URL.CATHY_TITLE)
driver.close()