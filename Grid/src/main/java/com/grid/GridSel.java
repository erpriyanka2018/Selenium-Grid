package com.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridSel {

	public static void main(String[] args) throws MalformedURLException {

		// desired capabilites for your browser and platform
		DesiredCapabilities cap = new DesiredCapabilities ();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		
		
		// chrome options definition
		
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		
		String HubURL = "http://localhost:5555/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL (HubURL), options);
		
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
	}

}
