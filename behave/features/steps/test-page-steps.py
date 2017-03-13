from behave import given, when, then
from lib.TestPageDriver import TestPageDriver
from time import sleep

pageURLs = dict(test='http://localhost:8000/')
@when('loading the {page} page.')
def step_impl(context, page):
    context.pageDriver = TestPageDriver('chrome');
    url = pageURLs[page]
    context.pageDriver.loadUrl(url);

@when('when the first heading input field is updated to "{newValue}"')
def step_impl(context, newValue):
    context.newHeadingValue = newValue
    context.pageDriver.setInputField('inputHeading1', newValue);

@then('the second heading input field should also changed to "{expectedValue}"')
def step_impl(context, expectedValue):
    value = context.pageDriver.getInputField('inputHeading2')
    sleep(3)
    assert value == expectedValue

@then('the page main heading should change to "{expectedValue}"')
def step_impl(context, expectedValue):
    pass
    # value = context.pageDriver.getHeading('heading')
    # assert value == expectedValue
