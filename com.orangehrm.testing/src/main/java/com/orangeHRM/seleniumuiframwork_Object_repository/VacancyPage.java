package com.orangeHRM.seleniumuiframwork_Object_repository;

import org.openqa.selenium.By;

import com.orangeHRM.seleniumuiframwork_genricutility.Base;


public class VacancyPage {
	private Base base;
    By vacancyMenu = By.xpath("//a[text()='Vacancies']");
    By addBtn = By.xpath("//button[contains(.,'Add')]");
    By jobTitle = By.name("jobTitleId");
    By hiringManager = By.name("hiringManagerId");
    By saveBtn = By.xpath("//button[@type='submit']");

    public void openVacancy() {
        base.driver.findElement(vacancyMenu).click();
    }

    public void addVacancy(String job, String manager) {
        base.driver.findElement(addBtn).click();
        base.driver.findElement(jobTitle).sendKeys(job);
        base.driver.findElement(hiringManager).sendKeys(manager);
        base.driver.findElement(saveBtn).click();
    }
}