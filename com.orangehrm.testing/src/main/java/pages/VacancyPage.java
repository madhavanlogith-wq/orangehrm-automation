package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VacancyPage {

	WebDriver driver;

	public VacancyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Vacancies']")
	WebElement vacancyTab;

	@FindBy(xpath = "//button[contains(.,'Add')]")
	WebElement addBtn;

	@FindBy(xpath = "//label[text()='Job Title']/../following-sibling::div//div[contains(@class,'oxd-select-text')]")
	WebElement jobTitleDropdown;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement hiringManager;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveBtn;

	@FindBy(xpath = "//label[text()='Vacancy']/../following-sibling::div//div[contains(@class,'oxd-select-text')]")
	WebElement vacancyDropdown;

	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement searchBtn;

	@FindBy(xpath = "//div[@role='row']//div[2]")
	WebElement result;

	@FindBy(xpath = "//span[contains(text(),'Required')]")
	WebElement errorMsg;

	public void goToVacancy() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement vacancy = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Vacancies']")));

		vacancy.click();
	}

	public void clickAdd() {
		addBtn.click();
	}

	public void searchAndSelectVacancy(String name) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    System.out.println("STEP: Searching vacancy = " + name);

	    // 1. Click Vacancy dropdown
	    WebElement dropdown = wait.until(
	        ExpectedConditions.elementToBeClickable(vacancyDropdown)
	    );
	    dropdown.click();

	    System.out.println("Dropdown opened");

	    // 2. Select option
	    WebElement option = wait.until(
	        ExpectedConditions.elementToBeClickable(
	            By.xpath("//div[@role='listbox']//span[text()='" + name + "']")
	        )
	    );
	    option.click();

	    System.out.println("Selected vacancy");

	    // 3. Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();

	    System.out.println("Clicked Search");

	    // 4. Click result
	    WebElement row = wait.until(
	        ExpectedConditions.elementToBeClickable(
	            By.xpath("//div[@role='row']//div[text()='" + name + "']")
	        )
	    );
	    row.click();

	    System.out.println("Clicked Result");
	}

	public String getResult() {
		return result.getText();
	}

	public String getError() {
		return errorMsg.getText();
	}

	public void addVacancy(String vacancyName, String job, String manager) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// 1. Vacancy Name (MISSING BEFORE - MAIN ISSUE FIX)
		WebElement vacancyField = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//label[text()='Vacancy Name']/../following-sibling::div//input")));
		vacancyField.clear();
		vacancyField.sendKeys(vacancyName);

		// 2. Job Title
		selectJobTitle(job);

		// 3. Hiring Manager
		selectHiringManager(manager);

		// 4. Save
		wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
	}

	public void selectJobTitle(String job) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// open dropdown
		wait.until(ExpectedConditions.elementToBeClickable(jobTitleDropdown)).click();

		// select value
		WebElement option = driver.findElement(By.xpath("//span[text()='" + job + "']"));

		option.click();
	}

	public void selectHiringManager(String name) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement input = hiringManager;

		input.click();
		input.clear();
		input.sendKeys(name);

		WebElement option = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@role='option']//span[contains(text(),'" + name + "')]")));

		option.click();
	}

}