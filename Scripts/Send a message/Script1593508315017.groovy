import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

Mobile.startApplication(RunConfiguration.getProjectDir() + '/APIDemos.apk', true)

Mobile.tap(findTestObject('Object Repository/APIDemo/android.widget.Button - OK'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/APIDemo/android.widget.TextView - OS'), 0)

Mobile.tap(findTestObject('Object Repository/APIDemo/android.widget.TextView - SMS Messaging'), 0)

Mobile.setText(findTestObject('Object Repository/APIDemo/android.widget.EditText'), '+84345678910', 0)

Mobile.setText(findTestObject('Object Repository/APIDemo/android.widget.EditText (1)'), 'Hello world! This is Katalon Mobile Recorder', 
    0)

Mobile.tap(findTestObject('Object Repository/APIDemo/android.widget.Button - Send'), 0)

Mobile.closeApplication()

