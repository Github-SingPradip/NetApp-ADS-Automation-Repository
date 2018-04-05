package com.paragon.netapp.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.paragaon.netapp.dicoverModule.ControlRelease;
import com.paragon.netapp.modules.LoginPage;
import com.paragon.netapp.projectUtils.XLUtility;
import com.paragaon.netapp.dicoverModule.*;

public class DiscoverTest extends BaseTest {

	@Test(dataProvider = "ControllerWorkPackage", priority = 2)

	public void discoverModule(String Workpack, String SourceController, String Assettag, String InstallDate)
			throws InterruptedException {

		Manual_discover.Workpack(driver, Workpack, SourceController, Assettag, InstallDate);
		Thread.sleep(10000);

	}

	@Test(dataProvider = "ControllerRelease", priority = 3)
	public void Control(String SourceController) throws InterruptedException {

		ControlRelease.ControlBatch(driver, SourceController);
		Thread.sleep(5000);
		ControlRelease.DeleteRelease(driver, SourceController);
	}

	@Test(dataProvider = "ControllerRelease", priority = 4)
	public void DeleteWorkpack(String SourceController) throws InterruptedException {

		Manual_discover.DeleteController(driver, SourceController);
		Thread.sleep(10000);
	}

	@Test(priority = 5)
	public void discoverManual() throws InterruptedException {

		DiscovrManualFunctions.manualFunctions(driver);
		Thread.sleep(10000);
	}

	@DataProvider(name = "ControllerWorkPackage")
	public String[][] getData2() throws Exception {
		String[][] data = XLUtility.getData("ControllerWorkPackage", "TestData.xls");

		return data;
	}

	@DataProvider(name = "ControllerRelease")
	public String[][] getData3() throws Exception {
		String[][] data = XLUtility.getData("ControllerRelease", "TestData.xls");

		return data;
	}

}
