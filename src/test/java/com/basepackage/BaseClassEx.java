package com.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClassEx {
	public static WebDriver driver;

	public static void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static String readProperty(String key) throws IOException {
		File file = new File(
				"C:\\Users\\DELL\\eclipse-workspace\\CoreAutomation\\src\\test\\resources\\Source\\Credential.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);

		String value = prop.getProperty(key);
		return value;
	}

	public static String captureScreenshot(String screenshotName) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);

			// Define the path where screenshot will be saved
			String dest = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";

			// Create directories if not exist
			Files.createDirectories(Paths.get(System.getProperty("user.dir") + "/screenshots/"));

			// Copy the file to destination
			File destination = new File(dest);
			Files.copy(source.toPath(), destination.toPath());

			return dest;
		} catch (IOException e) {
			System.out.println("Exception while taking screenshot: " + e.getMessage());
			return null;
		}
	}
	public void readProperty() {
		
	}
}
