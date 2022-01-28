package com.demoqa.certification.tasks;

import com.demoqa.certification.models.UserData;
import com.demoqa.certification.userinterface.StudentRegistrationFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

public class FilltheStudentRegistration implements Task {
    UserData userData;
    public FilltheStudentRegistration(UserData userData){
        this.userData = userData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(StudentRegistrationFormPage.LBL_FIRSTNAME),
                Enter.keyValues(userData.getFirstName()).into(StudentRegistrationFormPage.LBL_FIRSTNAME),
                Click.on(StudentRegistrationFormPage.LBL_LASTNAME),
                Enter.keyValues(userData.getLastName()).into(StudentRegistrationFormPage.LBL_LASTNAME),
                Click.on(StudentRegistrationFormPage.LBL_EMAIL),
                Enter.keyValues(userData.getEmail()).into(StudentRegistrationFormPage.LBL_EMAIL),
                Click.on(StudentRegistrationFormPage.GENDER.of(userData.getGender())),
                Enter.keyValues(userData.getEmail()).into(StudentRegistrationFormPage.LBL_MOBILE),
                SendKeys.of(userData.getDateOfBirth()).into(StudentRegistrationFormPage.LBL_DATE_OF_BIRTH)
        );
    }

    public static FilltheStudentRegistration form(UserData userData) {
        return Tasks.instrumented(FilltheStudentRegistration.class, userData);
    }
}
