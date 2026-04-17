package com.orangeHRM.selemiumuiframework_Object_repository.time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Attendance {
	
	   
    @FindBy(xpath = "//span[contains(@class,'oxd-topbar-body-nav-tab-item') and normalize-space()='Attendance']")
    WebElement Attendance_section;
    
    @FindBy(xpath = "//label[contains(text(),'Event')]/parent::div//following-sibling::div")
    WebElement Eventdropdown;
    
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement PunchIn;
    
   
    
    
    

    public void openSubmitClaimTab() {
        submitClaim.click();
    }

    public void selectEvent(String eventName) {
        Eventdropdown.click();
        driver.findElement(By.xpath("//span[text()='" + eventName + "']")).click();
    }

    public void selectCurrency(String Currencyname) {
        Currencydropdown.click();
        driver.findElement(By.xpath("//span[text()='" + Currencyname + "']")).click();
    }

    public void enterRemarks(String remark) {
        Remarksarea.sendKeys(remark);
    }

    public void clickCreate() {
        Createbutton.click();
    }
    
    public void clickSubmit() {
    	Submitbutton.click();
    }
	
	

}

