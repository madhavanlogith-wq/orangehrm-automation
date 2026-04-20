//package com.orangeHRM.seleniumuiframwork_genricutility;
//
//import org.openqa.selenium.WebDriver;
//
//import com.orangeHRM.seleniumuiframwork_Object_repository.Loginpage2;
//import com.orangeHRM.selemiumuiframework_Object_repository.buzz.Post;
//import com.orangeHRM.selemiumuiframework_Object_repository.claim.My_Claims;
//import com.orangeHRM.selemiumuiframework_Object_repository.claim.Submit_Claim;
//import com.orangeHRM.selemiumuiframework_Object_repository.time.Attendance;
//import com.orangeHRM.selemiumuiframework_Object_repository.time.Project_Info;
//import com.orangeHRM.selemiumuiframework_Object_repository.time.Reports;
//
//public class Pages {
//
//    private WebDriver driver;
//
//    private Loginpage2 login;
//    private Post post;
//    private My_Claims myClaims;
//    private Submit_Claim submitClaim;
//    private Attendance attendance;
//    private Project_Info projectInfo;
//    private Reports reports;
//
//    public Pages(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public Loginpage2 getLogin() {
//        if (login == null) {
//            login = new Loginpage2(driver);
//        }
//        return login;
//    }
//
//    public Post getPost() {
//        if (post == null) {
//            post = new Post(driver);
//        }
//        return post;
//    }
//
//    public My_Claims getMyClaims() {
//        if (myClaims == null) {
//            myClaims = new My_Claims(driver);
//        }
//        return myClaims;
//    }
//
//    public Submit_Claim getSubmitClaim() {
//        if (submitClaim == null) {
//            submitClaim = new Submit_Claim(driver);
//        }
//        return submitClaim;
//    }
//
//    public Attendance getAttendance() {
//        if (attendance == null) {
//            attendance = new Attendance(driver);
//        }
//        return attendance;
//    }
//
//    public Project_Info getProjectInfo() {
//        if (projectInfo == null) {
//            projectInfo = new Project_Info(driver);
//        }
//        return projectInfo;
//    }
//
//    public Reports getReports() {
//        if (reports == null) {
//            reports = new Reports(driver);
//        }
//        return reports;
//    }
//}

package com.orangeHRM.seleniumuiframwork_genricutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.selemiumuiframework_Object_repository.claim.Submit_Claim;
import com.orangeHRM.selemiumuiframework_Object_repository.claim.My_Claims;
import com.orangeHRM.selemiumuiframework_Object_repository.buzz.Post;
import com.orangeHRM.selemiumuiframework_Object_repository.time.Attendance;
import com.orangeHRM.selemiumuiframework_Object_repository.time.Project_Info;
import com.orangeHRM.selemiumuiframework_Object_repository.time.Reports;
import com.orangeHRM.seleniumuiframwork_Object_repository.Loginpage2;

public class Pages {

    public Loginpage2 login;
    public Post post;
    public Submit_Claim submitClaim;
    public My_Claims myClaims;
    public Attendance attendance;
    public Project_Info projectInfo;
    public Reports reports;

    // 🔥 Constructor (PageFactory initialization)
    public Pages(WebDriver driver) {

        login = PageFactory.initElements(driver, Loginpage2.class);
        post = PageFactory.initElements(driver, Post.class);

        submitClaim = PageFactory.initElements(driver, Submit_Claim.class);
        myClaims = PageFactory.initElements(driver, My_Claims.class);

        attendance = PageFactory.initElements(driver, Attendance.class);
        projectInfo = PageFactory.initElements(driver, Project_Info.class);
        reports = PageFactory.initElements(driver, Reports.class);
    }
}