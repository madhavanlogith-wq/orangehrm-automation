package pages;

import org.openqa.selenium.By;

import com.orangehrm.testing.utilities.BaseClass;

public class VacancyPage {

    By vacancyMenu = By.xpath("//a[text()='Vacancies']");
    By addBtn = By.xpath("//button[contains(.,'Add')]");
    By jobTitle = By.name("jobTitleId");
    By hiringManager = By.name("hiringManagerId");
    By saveBtn = By.xpath("//button[@type='submit']");

    public void openVacancy() {
        BaseClass.driver.findElement(vacancyMenu).click();
    }

    public void addVacancy(String job, String manager) {
        BaseClass.driver.findElement(addBtn).click();
        BaseClass.driver.findElement(jobTitle).sendKeys(job);
        BaseClass.driver.findElement(hiringManager).sendKeys(manager);
        BaseClass.driver.findElement(saveBtn).click();
    }
}