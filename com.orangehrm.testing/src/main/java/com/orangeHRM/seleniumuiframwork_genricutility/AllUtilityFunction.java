package com.orangeHRM.seleniumuiframwork_genricutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class AllUtilityFunction {
	// JAVA UTILITY
		// Generate Random Numbers
		public int getRandomNumber(int range) {
			Random random = new Random();
			int randomNumberInRange = random.nextInt(range);
			return randomNumberInRange;
		}

		// Generate Current Date
		public String getCurrentDate(String dateFormat) {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
			return sdf.format(date);
		}

		// counting Days
		public String getRequiredDate(int days) {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
			sdf.format(date);
			Calendar cal = sdf.getCalendar();
			cal.add(Calendar.DAY_OF_MONTH, days);
			String requiredDate = sdf.format(cal.getTime());
			return requiredDate;
		}

		// Generate Random Value(Alphanumeric)
		public String getRandomValue() {
			UUID randomData = UUID.randomUUID();
			String value = randomData.toString().replaceAll("[^a-zA-Z]", "");
			return value;
		}

		// Manage
		// Maximize
		public void configMaximizedBrowser(WebDriver driver) {
			driver.manage().window().maximize();
		}

		// Minimize
		public void configMinimizedBrowser(WebDriver driver) {
			driver.manage().window().minimize();
		}

		// fullScreen
		public void configFullScreenBrowser(WebDriver driver) {
			driver.manage().window().fullscreen();
		}

		// get size
		public Dimension fetchBrowserSize(WebDriver driver) {
			Dimension dimension = driver.manage().window().getSize();
			return dimension;
		}

		// set Size
		public void configBrowserSize(int width, int height, WebDriver driver) {
			driver.manage().window().setSize(new Dimension(width, height));
		}

		// close
		public void closingBrowserTab(WebDriver driver) {
			driver.close();
		}

		// quit
		public void closingBrowserWindow(WebDriver driver) {
			driver.quit();
		}

		// timeouts
		// implicitWait
		public void implicit( WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}

		// Read
		public String getPropertyKeyvalue(String key) throws IOException {
			FileInputStream fis = new FileInputStream("./src/test/resources/commanddata.properties");
			Properties prop = new Properties();
			prop.load(fis);
			String value = prop.getProperty(key);
			return value;

		}
}
