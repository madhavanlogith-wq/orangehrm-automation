package pages;

import org.openqa.selenium.By;

import com.orangehrm.testing.utilities.BaseClass;

public class CandidatePage {

    By recruitmentMenu = By.xpath("//span[text()='Recruitment']");
    By addBtn = By.xpath("//button[contains(.,'Add')]");
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By email = By.xpath("//input[@placeholder='Type here']");
    By saveBtn = By.xpath("//button[@type='submit']");

    public void openRecruitment() {
        BaseClass.driver.findElement(recruitmentMenu).click();
    }

    public void addCandidate(String fn, String ln, String mail) {
        BaseClass.driver.findElement(addBtn).click();
        BaseClass.driver.findElement(firstName).sendKeys(fn);
        BaseClass.driver.findElement(lastName).sendKeys(ln);
        BaseClass.driver.findElement(email).sendKeys(mail);
        BaseClass.driver.findElement(saveBtn).click();
    }
}