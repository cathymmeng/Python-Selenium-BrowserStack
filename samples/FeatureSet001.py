# feature test 001
def featureTest001(driver):
    # navigate to the application home page
    driver.get("http://www.google.com")

    # get the search textbox
    search_field = driver.find_element_by_id("lst-ib")
    search_field.clear()

    # enter search keyword and submit
    search_field.send_keys("Selenium WebDriver Interview questions")
    search_field.submit()

    # get the list of elements which are displayed after the search
    # currently on result page using find_elements_by_class_name  method
    lists=driver.find_elements_by_class_name("_Rm")

    # get the number of elements found
    print ("Found " + str(len(lists)) + " searches:")

    # iterate through each element and print the text that is
    # name of the search
    for listitem in lists:
       print (listitem)

# feature test 002
def featureTest002(driver):
    # navigate to the application home page
    driver.get("http://www.google.com")

    # get the search textbox
    search_field = driver.find_element_by_id("lst-ib")
    search_field.clear()

    # enter search keyword and submit
    search_field.send_keys("This is another test query")
    search_field.submit()

    # get the list of elements which are displayed after the search
    # currently on result page using find_elements_by_class_name  method
    lists=driver.find_elements_by_class_name("_Rm")

    # get the number of elements found
    print ("Found " + str(len(lists)) + " searches:")

    # iterate through each element and print the text that is
    # name of the search
    for listitem in lists:
       print (listitem)
