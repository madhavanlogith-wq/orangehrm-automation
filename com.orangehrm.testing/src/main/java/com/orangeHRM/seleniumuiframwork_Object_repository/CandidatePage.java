package com.orangeHRM.seleniumuiframwork_Object_repository;

import org.openqa.selenium.By;

import com.orangeHRM.seleniumuiframwork_genricutility.Base;

public class CandidatePage {
	private Base base;
    By recruitmentMenu = By.xpath("//span[text()='Recruitment']");
    By addBtn = By.xpath("//button[contains(.,'Add')]");
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By email = By.xpath("//input[@placeholder='Type here']");
    By saveBtn = By.xpath("//button[@type='submit']");

    public void openRecruitment() {
       base.driver.findElement(recruitmentMenu).click();
    }

    public void addCandidate(String fn, String ln, String mail) {
        base.driver.findElement(addBtn).click();
        base.driver.findElement(firstName).sendKeys(fn);
        base.driver.findElement(lastName).sendKeys(ln);
        base.driver.findElement(email).sendKeys(mail);
        base.driver.findElement(saveBtn).click();
    }
}