package com.demoqa.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class StudentRegistrationFormPage {
    public static final Target LBL_FIRSTNAME = Target.the("First Name").locatedBy("//input[@id='firstName']");
    public static final Target LBL_LASTNAME = Target.the("Last Name").locatedBy("//input[@id='lastName']");
    public static final Target LBL_EMAIL = Target.the("Email").locatedBy("//input[@id='userEmail']");
    public static final Target GENDER = Target.the("Gender").locatedBy("//label[text()='{0}']");
    public static final Target LBL_MOBILE = Target.the("Mobile Number").locatedBy("//input[@id='userNumber']");
    public static final Target LBL_DATE_OF_BIRTH = Target.the("Date of Birth").locatedBy("//input[@id='dateOfBirthInput']");
}
