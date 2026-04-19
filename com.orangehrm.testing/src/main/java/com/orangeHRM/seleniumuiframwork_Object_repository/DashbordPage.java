package com.orangeHRM.seleniumuiframwork_Object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashbordPage {
	@FindBy(linkText="PIM")
	private WebElement pimLink;
	
	@FindBy(css="[class=\"oxd-userdropdown-tab\"]")
	private WebElement logoutDroupDown;
	
	@FindBy(linkText="Logout")
	private WebElement logoutButton;

	@FindBy(linkText="Recruitment")
	private WebElement recrutmentLink;

	@FindBy(linkText="PIM")
	private WebElement leaveLink;
	
	@FindBy(linkText="Admin")
	private WebElement adminLink;
	
	@FindBy(linkText="My Info")
	private WebElement myInfoLink;

	@FindBy(linkText="Time")
	private WebElement timeLink;

	@FindBy(linkText="Claim")
	private WebElement claimLink;
	
	@FindBy(linkText="Maintenance")
	private WebElement maintenceLink;
	
	@FindBy(linkText="Directory")
	private WebElement directory;

	@FindBy(linkText="Buzz")
	private WebElement BuzzLink;

	public WebElement getPimLink() {
		return pimLink;
	}

	public WebElement getLogoutDroupDown() {
		return logoutDroupDown;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getRecrutmentLink() {
		return recrutmentLink;
	}

	public WebElement getLeaveLink() {
		return leaveLink;
	}

	public WebElement getAdminLink() {
		return adminLink;
	}

	public WebElement getMyInfoLink() {
		return myInfoLink;
	}

	public WebElement getTimeLink() {
		return timeLink;
	}

	public WebElement getClaimLink() {
		return claimLink;
	}

	public WebElement getMaintenceLink() {
		return maintenceLink;
	}

	public WebElement getDirectory() {
		return directory;
	}

	public void setPimLink() {
		getPimLink().click();
	}

	public void setLogoutDroupDown() {
		getLogoutDroupDown().click();
	}

	public void setLogoutButton() {
		getLogoutButton().click();
	}

	public void setRecrutmentLink() {
		getRecrutmentLink().click();
	}

	public void setLeaveLink() {
		getLeaveLink().click();
	}

	public void setAdminLink() {
		getAdminLink().click();
	}

	public void setMyInfoLink() {
		getMyInfoLink().click();
	}

	public void setTimeLink() {
		getTimeLink().click();
	}

	public void setClaimLink() {
		getClaimLink().click();
	}

	public void setMaintenceLink() {
		getMaintenceLink().click();
	}

	public void setDirectory() {
		getDirectory().click();
	}

	public void setBuzzLink() {
		getBuzzLink().click();
	}

	public WebElement getBuzzLink() {
		return BuzzLink;
	}

}
