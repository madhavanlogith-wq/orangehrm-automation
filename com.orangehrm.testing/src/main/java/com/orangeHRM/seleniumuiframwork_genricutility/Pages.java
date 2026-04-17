package com.orangehrm.seleniumuiframwork_genricutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.seleniumuiframwork_Object_repository.DashbordPage;
import com.orangehrm.seleniumuiframwork_Object_repository.LoginPage;
import com.orangehrm.testing.objectrepository.leaveModule.AddEntitlementsPage;
import com.orangehrm.testing.objectrepository.leaveModule.ApplyPage;
import com.orangehrm.testing.objectrepository.leaveModule.LeaveListPage;
import com.orangehrm.testing.objectrepository.leaveModule.LeavePage;
import com.orangehrm.testing.objectrepository.leaveModule.LeavePeriodPage;
import com.orangehrm.testing.objectrepository.leaveModule.MyLeavePage;
import com.orangehrm.testing.objectrepository.leaveModule.MyLeaveReportPage;

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
	}
}
