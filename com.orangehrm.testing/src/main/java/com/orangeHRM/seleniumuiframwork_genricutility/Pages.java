package com.orangeHRM.seleniumuiframwork_genricutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.seleniumuiframwork_Object_repository.ContactDetailsPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.DashbordPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.DependentsPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.EmergencyContactsPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.JobDetailsPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.LoginPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.PersonalDetailsPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.QualificationsPage;

public class Pages {

    // ================= PAGE OBJECT DECLARATIONS =================

    public static LoginPage loginPage;
    public static DashbordPage dashboardPage;

    public static PersonalDetailsPage personalDetailsPage;
    public static ContactDetailsPage contactDetailsPage;
    public static EmergencyContactsPage emergencyContactsPage;
    public static DependentsPage dependentsPage;
    public static JobDetailsPage jobDetailsPage;
    public static QualificationsPage qualificationsPage;

    // ================= INITIALIZATION METHOD =================

    public static void loadAllPages(WebDriver driver) {

        // Core Pages
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        dashboardPage = PageFactory.initElements(driver, DashbordPage.class);

        // My Info Pages
        personalDetailsPage = PageFactory.initElements(driver, PersonalDetailsPage.class);
        contactDetailsPage = PageFactory.initElements(driver, ContactDetailsPage.class);
        emergencyContactsPage = PageFactory.initElements(driver, EmergencyContactsPage.class);
        dependentsPage = PageFactory.initElements(driver, DependentsPage.class);
        jobDetailsPage = PageFactory.initElements(driver, JobDetailsPage.class);
        qualificationsPage = PageFactory.initElements(driver, QualificationsPage.class);
    }
}
