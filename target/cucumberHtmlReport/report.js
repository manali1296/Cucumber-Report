$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Swiggy Homepage feature",
  "description": "",
  "id": "swiggy-homepage-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "search Box",
  "description": "",
  "id": "swiggy-homepage-feature;search-box",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@h1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I Land on swiggy homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"\u003clocation\u003e\" value in Searchbox",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify list of search result is populated below",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "i selected First option",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I verify i landed on Page with \"\u003clocation\u003e\" on top left corner i was entered for search",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "swiggy-homepage-feature;search-box;",
  "rows": [
    {
      "cells": [
        "location"
      ],
      "line": 12,
      "id": "swiggy-homepage-feature;search-box;;1"
    },
    {
      "cells": [
        "Pune"
      ],
      "line": 13,
      "id": "swiggy-homepage-feature;search-box;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 21772305000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "search Box",
  "description": "",
  "id": "swiggy-homepage-feature;search-box;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@h1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I Land on swiggy homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"Pune\" value in Searchbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify list of search result is populated below",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "i selected First option",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I verify i landed on Page with \"Pune\" on top left corner i was entered for search",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Signup_StepDefination.verifyHomepage()"
});
formatter.result({
  "duration": 188515100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pune",
      "offset": 9
    }
  ],
  "location": "HomepageStep.i_enter_value_in_Searchbox(String)"
});
formatter.result({
  "duration": 95370300,
  "status": "passed"
});
formatter.match({
  "location": "HomepageStep.i_verify_list_of_search_result_is_populated_below()"
});
formatter.result({
  "duration": 18048311600,
  "status": "passed"
});
formatter.match({
  "location": "HomepageStep.i_selected_First_option()"
});
formatter.result({
  "duration": 3102573700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pune",
      "offset": 32
    }
  ],
  "location": "HomepageStep.i_verify_i_landed_on_Page_with_on_top_left_corner_i_was_entered_for_search(String)"
});
formatter.result({
  "duration": 36857300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[text()\u003d\u0027Pune\u0027]\"}\n  (Session info: chrome\u003d76.0.3809.132)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027IN-IT0962\u0027, ip: \u002710.29.192.159\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.132, chrome: {chromedriverVersion: 76.0.3809.126 (d80a294506b4..., userDataDir: C:\\Users\\MANALI~1.GAI\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:61045}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 9935ecae7f239a999e715a652ad434f7\n*** Element info: {Using\u003dxpath, value\u003d//span[text()\u003d\u0027Pune\u0027]}\r\n\tat sun.reflect.GeneratedConstructorAccessor19.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat PageObjects.HomepagePage.verifyLocationOnTop(HomepagePage.java:45)\r\n\tat stepDefination.HomepageStep.i_verify_i_landed_on_Page_with_on_top_left_corner_i_was_entered_for_search(HomepageStep.java:52)\r\n\tat ✽.Then I verify i landed on Page with \"Pune\" on top left corner i was entered for search(Homepage.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 172290600,
  "status": "passed"
});
});