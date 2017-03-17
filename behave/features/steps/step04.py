from behave import given, when, then
from lib.scratch import Scratch

@when('loading {url} in the browser')
def step_impl(context, url):
    context.scratch = Scratch('chrome');
    context.scratch.loadUrl(url);

@when('pressing button {times} times')
def step_impl(context, times):
    context.scratch.pressButton(context, times)

@when('button is pressed {times} times')
def step_impl(context, times):
    context.scratch.pressButton(context, times)

@then('progress bar should be {requiredValue}%')
def step_impl(context, requiredValue):
    context.scratch.assertProgressBarPercentage(context, requiredValue)
