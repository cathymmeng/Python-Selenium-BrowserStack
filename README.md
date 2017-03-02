# Cross Browser Sanity Check framework #
Framework created on: Feb 2017
## Tech Stack ##
Python Selenium BrowserStack
`TODO: Need to obtain an official plan from BrowserStack, free trial has limitations but it's sufficient to practise`

## Setup and Installation ##
__Requirements__

- [Python 2.7.10 +](https://www.python.org/downloads/)
- [Selenium Python](http://selenium-python.readthedocs.io/installation.html)
- Selenium webdriver

__Install Python__

For Windows user please download the application from [here](https://www.python.org/downloads/windows/), follow the prompts to finish installation

For OS X user, the latest version of Mac OS X, Sierra, comes with Python 2.7 out of the box. To install other versions please download from [here](https://www.python.org/downloads/mac-osx/) or simply run command below from terminal

```
$ brew install python
$ python -V
```

__Install Selenium and Selenium drivers__
Install Python [pip](https://pip.pypa.io/en/stable/installing/) and then install python selenium binding
For Windows,
```
<PYTHON_HOME>\pip.exe install selenium
```
For OS X,
```
pip install selenium
```

__Download Selenium drivers and place them in your PATH__
This is for local verification if a different type of browser has installed locally, a range of OS and browser combinitions are provided by BrowserStack. After download, the drivers need to be placed in your PATH, e. g., in /usr/bin or /usr/local/bin for OS X

Browser   | Download URL
:---------|:-------------------------------------------------------------------------
Chrome    | https://sites.google.com/a/chromium.org/chromedriver/downloads
Edge      | https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
Firefox   | https://github.com/mozilla/geckodriver/releases
Safari    | https://webkit.org/blog/6900/webdriver-support-in-safari-10/

__Setup Verification__
Navigate to folder src/features/ and run command below
For Mac OS X or Linux users:
```
$ python localPlayGround.py
```

For Windows:
```
<PYTHON_HOME>\python.exe localPlayGround.py
```

Have you seen the IOOF main page opened up in a Chrome browser? Congratulations & you are ready to explore the rest of the world! If not, please recheck all steps mentioned above and good luck.
