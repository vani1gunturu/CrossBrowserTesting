# CrossBrowserTesting
since testNG will execute the tests according to alphabetical order.
According to the script,it will launch the chrome browser first and then Firefox browser.
As i have mentioned priority=1 to Firefox,so Firefox will launch first and then chrome browser will be launch next.
If there are test-methods with priority and without priority,first testng will execute the methods without priority first according to alphabetical order and then test-methods with priority according to priority number.
