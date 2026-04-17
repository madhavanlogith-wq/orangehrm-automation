<<<<<<< HEAD

package com.orangeHRM.seleniumuiframwork_genricutility;

import com.orangehrm.seleniumuiframwork_Object_repository.DashbordPage;
import com.orangehrm.seleniumuiframwork_Object_repository.LoginPage;
import com.orangehrm.testing.objectrepository.leaveModule.ApplyPage;

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
        LoginPage = PageFactory.initElements(driver, LoginPage.class);
        dashboardpage = PageFactory.initElements(driver, DashbordPage.class);

        // My Info Pages
        personalDetailsPage= PageFactory.initElements(driver, PersonalDetailsPage.class);
        contactDetailsPage = PageFactory.initElements(driver, ContactDetailsPage.class);
        emergencyContactsPage = PageFactory.initElements(driver, EmergencyContactsPage.class);
        dependentsPage = PageFactory.initElements(driver, DependentsPage.class);
        jobDetailsPage = PageFactory.initElements(driver, JobDetailsPage.class);
	}
=======



    // ================= PAGE OBJECT DECLARATIONS =================



    // ================= INITIALIZATION METHOD =================

   
=======
package com.orangeHRM.seleniumuiframwork_genricutility;

public class Pages {
>>>>>>> refs/remotes/origin/user3

}
