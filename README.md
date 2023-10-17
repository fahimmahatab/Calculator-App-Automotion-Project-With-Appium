# Calculator_App_Automotion_Project_With_Selenium_Appium
## About this project:
## Automated Apps link: https://play.google.com/store/apps/details?id=com.google.android.calculator
## Here I automate the following Series:
- 50+10-20*2+10/2

## Tools & Technology used:
- Android Studio
- Mobile application testing tool: Appium Inspector
- Language: Java
- Build Tool: Gradle
- IDE: Intellij IDEA
 
 ## Dependencies
- selenium-java
- java-client
- testng
- allure-testng

## How to run this project:
- Connect your mobile devices through USB cable or install Virtual device on Android Studio.
- Open Command Prompt and use this command: adb devices
- To start Appium Server use this command: appium
- Now Open Appium Inspector
- Set Desired Capabilities:
  `````` {
         "platformName": "android",
         "appium:platformVersion": "12",
         "appium:automationName": "UIAutomator2",
         "appium:appPackage": "com.google.android.calculator",
         "appium:appActivity": "com.android.calculator2.Calculator",
         "appium:app": "E:\\apk\\calculator.apk"
       }
- Here "appium:platformVersion": "12" is android version which device you Connected as adb device.
- Click Save and Click Start Session
  
- Clone this project
- follow this instruction:
- ```  build.gradle ```
- ``` open it on Intellij IDE as project ```
- ``` click Run Button ```
  
## Open Terminal Follow that Command:
- gradle clean test
- allure generate allure-results --clean -output
- allure serve allure-results 
  
## Allure Reports:
![screencapture-192-168-1-104-9593-index-html-2023-10-16-23_13_44](https://github.com/fahimmahatab/Calculator_App_Automotion_Project_With_Selenium_Appium/assets/43899673/68430a07-e1c5-4eed-93cb-0f67d64e5699)
![screencapture-192-168-1-104-9593-index-html-2023-10-16-23_13_56](https://github.com/fahimmahatab/Calculator_App_Automotion_Project_With_Selenium_Appium/assets/43899673/901fc513-5078-458b-89d3-cc98b772b587)

## Here the recorded video from program output is attched below:
https://github.com/fahimmahatab/Calculator_App_Automotion_Project_With_Selenium_Appium/assets/43899673/0084432e-5ac5-44e0-8ba1-bcfc834deab2

