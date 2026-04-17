

package com.orangeHRM.seleniumuiframwork_genricutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.seleniumuiframwork_Object_repository.AddEntitlementsPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.ApplyPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.ContactDetailsPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.DashbordPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.DependentsPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.EmergencyContactsPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.JobDetailsPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.LeaveListPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.LeavePage;
import com.orangeHRM.seleniumuiframwork_Object_repository.LeavePeriodPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.LoginPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.MyLeavePage;
import com.orangeHRM.seleniumuiframwork_Object_repository.MyLeaveReportPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.PersonalDetailsPage;

public class Pages {
	
	public static LoginPage loginpage;
	public static DashbordPage dashboardpage;
	public static ApplyPage apply;
	public static LeaveListPage leavelist;
	public static AddEntitlementsPage addentitlement;
	public static LeavePage leavepage;
	public static LeavePeriodPage leaveperiod;
	public static MyLeavePage myleave;
	public static MyLeaveReportPage myleavereport;
 

    public static PersonalDetailsPage personalDetailsPage;
    public static ContactDetailsPage contactDetailsPage;
    public static EmergencyContactsPage emergencyContactsPage;
    public static DependentsPage dependentsPage;
    public static JobDetailsPage jobDetailsPage;
	
	public static void loadAllPages(WebDriver driver) {
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		dashboardpage=PageFactory.initElements(driver, DashbordPage.class);
		apply=PageFactory.initElements(driver, ApplyPage.class);
		leavelist=PageFactory.initElements(driver, LeaveListPage.class);
		addentitlement=PageFactory.initElements(driver, AddEntitlementsPage.class);
		leavepage=PageFactory.initElements(driver, LeavePage.class);
		leaveperiod=PageFactory.initElements(driver, LeavePeriodPage.class);
		myleave=PageFactory.initElements(driver, MyLeavePage.class);
		myleavereport=PageFactory.initElements(driver, MyLeaveReportPage.class);
        // Object repository pages
        dashboardpage = PageFactory.initElements(driver, DashbordPage.class);
        // My Info Pages
        personalDetailsPage= PageFactory.initElements(driver, PersonalDetailsPage.class);
        contactDetailsPage = PageFactory.initElements(driver, ContactDetailsPage.class);
        emergencyContactsPage = PageFactory.initElements(driver, EmergencyContactsPage.class);
        dependentsPage = PageFactory.initElements(driver, DependentsPage.class);
        jobDetailsPage = PageFactory.initElements(driver, JobDetailsPage.class);
	}
}
