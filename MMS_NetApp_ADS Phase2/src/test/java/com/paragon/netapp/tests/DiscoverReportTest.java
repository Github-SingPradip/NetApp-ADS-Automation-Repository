package com.paragon.netapp.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.paragaon.netapp.dicoverModule.DiscoverReports;

/**
 * @author Singprad All this below Methods called for Discover Module Reports
 *         Handling and generating to local drive.
 */
public class DiscoverReportTest extends BaseTest {

	@Test // (priority=15)
	public void callMeTest() throws InterruptedException {

		// calling Page reach method bcoz it contains the common step to reach till the
		// discover page
		DiscoverReports d1 = new DiscoverReports();
		d1.pageReach(driver);
		d1.callMeReport(driver);
	}

	@Test // (priority=16)
	public void uknownOwnerReport() throws InterruptedException {
		Thread.sleep(5000);
		DiscoverReports d1 = new DiscoverReports();
		d1.pageReach(driver);
		d1.unknownOwnerReport(driver);

	}

	@Test // (priority=17)
	public void volumeDecommisionReport() throws InterruptedException {
		Thread.sleep(5000);
		DiscoverReports d1 = new DiscoverReports();
		d1.pageReach(driver);
		d1.volumeDecommision(driver);

	}

	@Test // (priority=18)
	public void multiOwnerReport() throws InterruptedException {
		Thread.sleep(5000);
		DiscoverReports d1 = new DiscoverReports();
		d1.pageReach(driver);
		d1.multiOwner(driver);

	}

	@Test // (priority=19)
	public void activityReport() throws InterruptedException {
		Thread.sleep(5000);
		DiscoverReports d1 = new DiscoverReports();
		d1.pageReach(driver);
		d1.activityReport(driver);

	}

	@Test(priority = 20)
	public void applicationDetailReport() throws InterruptedException {
		Thread.sleep(5000);
		DiscoverReports d1 = new DiscoverReports();
		d1.pageReach(driver);
		d1.applicationDetail(driver);

	}

}
