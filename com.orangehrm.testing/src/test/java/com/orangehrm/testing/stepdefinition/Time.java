//package com.orangehrm.testing.stepdefinition;
//
//import org.testng.Assert;
//
//import com.orangeHRM.selemiumuiframework_Object_repository.time.Attendance;
//import com.orangeHRM.selemiumuiframework_Object_repository.time.Reports;
//import com.orangeHRM.selemiumuiframework_Object_repository.time.Project_Info;
//import com.orangehrm.testing.stepdefinition.Hook;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Time {
//
//    Attendance attendance;
//    Reports reports;
//    Project_Info project;
//
//    // ================= INITIALIZATION =================
//    private void initPages() {
//        if (attendance == null) {
//            attendance = new Attendance(Hook.getDriver());
//        }
//        if (reports == null) {
//            reports = new Reports(Hook.getDriver());
//        }
//        if (project == null) {
//            project = new Project_Info(Hook.getDriver());
//        }
//    }
//
//    // ================= ATTENDANCE =================
//
//    @When("user navigates to attendance section")
//    public void openAttendance() {
//        initPages();
//        attendance.openAttendanceSection();
//    }
//
//    @When("user opens the punch page")
//    public void openPunchSection() {
//        initPages();
//        attendance.openPunchSection();
//    }
//
//    @When("user clicks punch in")
//    public void clickPunchIn() {
//        initPages();
//        attendance.clickPunchIn();
//    }
//
//    @Then("PunchIn should be saved sucessfully")
//    public void verifyPunchIn() {
//
//        initPages();
//
//        String msg = attendance.getSuccessMessage();
//        Assert.assertTrue(msg.toLowerCase().contains("success"),
//                "Punch In not successful. Actual: " + msg);
//    }
//
//    // ================= REPORTS =================
//
//    @When("user navigates to reports section")
//    public void navigateToReports() {
//        initPages();
//        reports.openReportsSection();
//    }
//
//    @When("user clicks on project reports")
//    public void clickProjectReports() {
//        initPages();
//        reports.openProjectReports();
//    }
//
//    @When("user clicks on view button")
//    public void clickViewButton() {
//        initPages();
//        reports.clickView();
//    }
//
//    @Then("system should display {string}")
//    public void verifyMessage(String expected) {
//        initPages();
//        Assert.assertTrue(reports.getRequiredMessage().contains(expected),
//                "Expected message not displayed: " + expected);
//    }
//
//    // ================= PROJECT INFO =================
//
//    @When("user navigates to project info section")
//    public void navigateToProjectInfo() {
//        initPages();
//        project.navigateToProjectInfo();
//    }
//
//    @When("user clicks on project tab")
//    public void clickProjectTab() {
//        initPages();
//        project.clickProjectTab();
//    }
//
//    @When("user clicks on add project")
//    public void clickAddProject() {
//        initPages();
//        project.clickAddProject();
//    }
//
//    @When("user enters new project name {string}")
//    public void enterNewProjectName(String name) {
//        initPages();
//        project.enterProjectName(name);
//    }
//
//    @When("user enters customer name {string}")
//    public void enterCustomer(String name) {
//        initPages();
//        project.selectCustomer(name);
//    }
//
//    @When("user clicks save")
//    public void clickSave() {
//        initPages();
//        project.clickSave();
//    }
//
//    @Then("project should be saved successfully")
//    public void verifyProjectAdded() {
//
//        initPages();
//
//        String msg = project.getSuccessMessage();
//
//        Assert.assertTrue(msg.toLowerCase().contains("success"),
//                "Project not added successfully. Actual: " + msg);
//    }
//}


package com.orangehrm.testing.stepdefinition;

import org.testng.Assert;

import com.orangeHRM.selemiumuiframework_Object_repository.time.Attendance;
import com.orangeHRM.selemiumuiframework_Object_repository.time.Reports;
import com.orangeHRM.selemiumuiframework_Object_repository.time.Project_Info;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Time {

    Attendance attendance = new Attendance(Hook.getDriver());
    Reports reports = new Reports(Hook.getDriver());
    Project_Info project = new Project_Info(Hook.getDriver());

    // ================= ATTENDANCE =================

    @When("user navigates to attendance section")
    public void openAttendance() {
        attendance.openAttendanceSection();
    }

    @When("user opens the punch page")
    public void openPunchSection() {
        attendance.openPunchSection();
    }

    @When("user clicks punch in")
    public void clickPunchIn() {
        attendance.clickPunchIn();
    }

    @Then("PunchIn should be saved sucessfully")
    public void verifyPunchIn() {
        Assert.assertTrue(
            attendance.getSuccessMessage().contains("Successfully Saved"),
            "Punch In failed. Actual: " + attendance.getSuccessMessage()
        );
    }

    // ================= REPORTS =================

    @When("user navigates to reports section")
    public void navigateToReports() {
        reports.openReportsSection();
    }

    @When("user clicks on project reports")
    public void clickProjectReports() {
        reports.openProjectReports();
    }

    @When("user clicks on view button")
    public void clickViewButton() {
        reports.clickView();
    }

    @Then("system should display {string}")
    public void verifyMessage(String expected) {
        Assert.assertTrue(
            reports.getRequiredMessage().contains(expected),
            "Expected message not displayed: " + expected +
            " | Actual: " + reports.getRequiredMessage()
        );
    }

    // ================= PROJECT INFO =================

    @When("user navigates to project info section")
    public void navigateToProjectInfo() {
        project.navigateToProjectInfo();
    }

    @When("user clicks on project tab")
    public void clickProjectTab() {
        project.clickProjectTab();
    }

    @When("user clicks on add project")
    public void clickAddProject() {
        project.clickAddProject();
    }

    @When("user enters new project name {string}")
    public void enterNewProjectName(String name) {
        project.enterProjectName(name);
    }

    @When("user enters customer name {string}")
    public void enterCustomer(String name) {
        project.selectCustomer(name);
    }

    @When("user clicks save")
    public void clickSave() {
        project.clickSave();
    }

    @Then("project should be saved successfully")
    public void verifyProjectAdded() {

        String msg = project.getSuccessMessage();

        Assert.assertTrue(msg.contains("Success"), 
            "Project not saved. Actual: " + msg);
    }
}