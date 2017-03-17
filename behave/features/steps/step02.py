from behave import given, when, then
from selenium import webdriver

drivers = dict(chrome=webdriver.Chrome, firefox=webdriver.Firefox);

@given('Selenium has been installed')
def step_impl(context):
    context.driverName = 'chrome'
    pass

@then('there should be no exception')
def step_impl(context):
    assert context.failed is False

@given('Selenium {driverName} has been installed')
def step_impl(context):
    context.drivername = driverName
    pass

@when('we try to create a driver')
def step_impl(context):
    try:
        driver = drivers[context.driverName]()
    except Exception as e:
        print(e)
        assert True is False
