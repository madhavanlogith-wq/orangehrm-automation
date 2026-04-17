package com.orangeHRM.selemiumuiframework_Object_repository.time;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Reports {
	
	 @FindBy(xpath = "//span[contains(@class,'oxd-topbar-body-nav-tab-item') and normalize-space()='Reports']")
	    WebElement Reports_section ;
	    
	    @FindBy(css = "[placeholder='Type for hints...']")
	    WebElement Project_name;
	    
	    @FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	    WebElement Viewbutton;

}
