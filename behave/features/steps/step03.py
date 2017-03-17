from behave import given, when, then
from selenium import webdriver
from time import sleep

drivers = dict(chrome=webdriver.Chrome, firefox=webdriver.Firefox);

@given('a set of Selenium drivers')
def step_impl(context):
    context.driverNames = []
    for d in context.table:
        context.driverNames.append(d);

@when('using different search strings')
def step_impl(context):
    try:
        for d in context.driverNames:
            driverName = d['driver']
            for row in context.table:
                search = row['search']
                print("*************, DriverName: " + driverName)
                print("*************, Search: " + search)
                driver = drivers[driverName]()
                #driver.implicitly_wait(30)
                driver.maximize_window()
                driver.get("http://www.google.com")
                search_field = driver.find_element_by_id("lst-ib")
                search_field.clear()
                search_field.send_keys(search)
                search_field.submit()
                lists=driver.find_elements_by_class_name("_Rm")
                print ("Found " + str(len(lists)) + " searches:")
                context.results = len(lists);
                sleep(1)
                driver.quit()
    except Exception as e:
        print(e)
        assert True is False

@then('there should be more than {requiredResults} results')
def step_impl(context, requiredResults):
    required = int(requiredResults)
    print("**** results: " + str(context.results))
    print("**** requiredResults: " + requiredResults)
    assert context.results > required
