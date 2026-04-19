package com.orangehrm.testing.utilities;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;
import pages.RecruitmentPage;

import pages.CandidatePage;
import pages.VacancyPage;



public class Pages {
	public static LoginPage lp;
	public static CandidatePage cp;
	public static VacancyPage vp;
	public static RecruitmentPage rp;
	
	public static void loadAllPages(WebDriver driver) {
		lp=PageFactory.initElements(driver, LoginPage.class);
		cp=PageFactory.initElements(driver, CandidatePage.class);
		vp=PageFactory.initElements(driver, VacancyPage.class);
		rp=PageFactory.initElements(driver, RecruitmentPage.class);
	}

}
