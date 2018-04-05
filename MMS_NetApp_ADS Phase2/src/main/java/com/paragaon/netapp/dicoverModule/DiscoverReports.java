package com.paragaon.netapp.dicoverModule;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;
import com.paragon.netapp.modules.LoginPage;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class DiscoverReports {
	
	private static boolean alreadyLoggedIn;
	
	public WebDriverWait wait;
	// Discover page Reach
	public void pageReach(WebDriver driver) throws InterruptedException {
		
				driver.findElement(By.linkText("Discover")).click();
				
		// Go to Reports 
				driver.findElement(By.linkText("Reports")).click();
				
		
	}
	// Callme Report Test
	public void callMeReport(WebDriver driver) throws InterruptedException {
		System.out.println("Call me report is called ");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text()='Call Me Report']")).click();
		Thread.sleep(10000);
		// set preference to download the file in C:\Temp file
		// Waiting for the element Export to excel 
//		WebElement wb = driver.findElement(By.xpath("//button[@class='btn btn-outline-primary']"));
//		wait.until(ExpectedConditions.elementToBeClickable(wb));
//		 
//		// once the element Export to excel is visible, click on it .
//		wb.click();
//		
//		// Directory check  for file downloaded location 
//		// Directory check  for file downloaded location 
//		boolean fileDownloaded = this.isFileDownloaded_Ext("C:\\Users\\rajrajm\\Downloads\\", "xls");
//		Thread.sleep(5000);
//		// if file is downloaded then find the lates file 
//		if(fileDownloaded) {
//			File latestFilefromDir = this.getLatestFilefromDir("C:\\Users\\rajrajm\\Downloads\\");
//			System.out.println(latestFilefromDir);
//		}
		driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary']")).click();
		
	}
	
	
	// UnknownOwnerReport Test
	public void unknownOwnerReport(WebDriver driver) throws InterruptedException{
		System.out.println("Unknown Owner report is called ");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Unknown Owner Report']")).click();
		Thread.sleep(5000);
		// set preference to download the file in C:\Temp file
		// Waiting for the element Export to excel 
//		WebElement wb = driver.findElement(By.xpath("//button[@class='btn btn-outline-primary']"));
//		wait.until(ExpectedConditions.elementToBeClickable(wb));
//		
//		// once the element Export to excel is visible, click on it .
//		wb.click();
//		
//		// Directory check  for file downloaded location 
//		boolean fileDownloaded = this.isFileDownloaded_Ext("C:\\Users\\rajrajm\\Downloads\\", "xls");
//		Thread.sleep(5000);
//		
//		// if file is downloaded then find the lates file 
//		if(fileDownloaded) {
//			File latestFilefromDir = this.getLatestFilefromDir("C:\\Users\\rajrajm\\Downloads\\");
//			System.out.println(latestFilefromDir);
//		}
		driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary pull-left']")).click();
		
	}
	
	
	//Voulume DecomissionReport Test
	public void volumeDecommision(WebDriver driver ) throws InterruptedException {
		System.out.println("Voulme Decommision report is called ");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Volume Decommission Report']")).click();
		Thread.sleep(5000);
		// set preference to download the file in C:\Temp file
		// Waiting for the element Export to excel 
//		WebElement wb = driver.findElement(By.xpath("//button[@class='btn btn-outline-primary']"));
//		wait.until(ExpectedConditions.elementToBeClickable(wb));
//		
//		// once the element Export to excel is visible, click on it .
//		wb.click();
//		
//		// Directory check  for file downloaded location 
//		boolean fileDownloaded = this.isFileDownloaded_Ext("C:\\Users\\rajrajm\\Downloads\\", "xls");
//		Thread.sleep(5000);
//		
//		// if file is downloaded then find the lates file 
//		if(fileDownloaded) {
//			File latestFilefromDir = this.getLatestFilefromDir("C:\\Users\\rajrajm\\Downloads\\");
//			System.out.println(latestFilefromDir);
//		}
		driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary']")).click();
		
	
	}
	
	// Multiowner report test
	public void multiOwner(WebDriver driver) throws InterruptedException {
		System.out.println("MultiOwner report is called ");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Multi Owner Report']")).click();
		Thread.sleep(5000);
		// set preference to download the file in C:\Temp file
		// Waiting for the element Export to excel 
//		WebElement wb = driver.findElement(By.xpath("//button[@class='btn btn-outline-primary']"));
//		wait.until(ExpectedConditions.elementToBeClickable(wb));
//		
//		// once the element Export to excel is visible, click on it .
//		wb.click();
//		
//		// Directory check  for file downloaded location 
//		boolean fileDownloaded = this.isFileDownloaded_Ext("C:\\Users\\rajrajm\\Downloads\\", "xls");
//		Thread.sleep(5000);
//		
//		// if file is downloaded then find the lates file 
//		if(fileDownloaded) {
//			File latestFilefromDir = this.getLatestFilefromDir("C:\\Users\\rajrajm\\Downloads\\");
//			System.out.println(latestFilefromDir);
//		}
		driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary']")).click();
		
	}
	
	// Activity report test
	public void activityReport(WebDriver driver) throws InterruptedException {
		System.out.println("Activity report is called ");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Activity Report']")).click();
		Thread.sleep(5000);
		// set preference to download the file in C:\Temp file
		// Waiting for the element Export to excel 
//		WebElement wb = driver.findElement(By.xpath("//button[@class='btn btn-outline-primary']"));
//		wait.until(ExpectedConditions.elementToBeClickable(wb));
//		
//		// once the element Export to excel is visible, click on it .
//		wb.click();
//		
//		// Directory check  for file downloaded location 
//		boolean fileDownloaded = this.isFileDownloaded_Ext("C:\\Users\\rajrajm\\Downloads\\", "xls");
//		Thread.sleep(5000);
//		
//		// if file is downloaded then find the lates file 
//		if(fileDownloaded) {
//			File latestFilefromDir = this.getLatestFilefromDir("C:\\Users\\rajrajm\\Downloads\\");
//			System.out.println(latestFilefromDir);
//		}
		driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary pull-left']")).click();
		
	}
	
	// Application detail report
	
	public void applicationDetail(WebDriver driver) throws InterruptedException {
		System.out.println("Application Detail report is called ");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Application Detail Report']")).click();
		Thread.sleep(5000);
		// set preference to download the file in C:\Temp file
		// Waiting for the element Export to excel 
//		WebElement wb = driver.findElement(By.xpath("//button[@class='btn btn-outline-primary']"));
//		wait.until(ExpectedConditions.elementToBeClickable(wb));
//		
//		// once the element Export to excel is visible, click on it .
//		wb.click();
//		
//		// Directory check  for file downloaded location 
//		boolean fileDownloaded = this.isFileDownloaded_Ext("C:\\Users\\rajrajm\\Downloads\\", "xls");
//		Thread.sleep(5000);
//		
//		// if file is downloaded then find the lates file 
//		if(fileDownloaded) {
//			File latestFilefromDir = this.getLatestFilefromDir("C:\\Users\\rajrajm\\Downloads\\");
//			System.out.println(latestFilefromDir);
//		}
		driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary pull-left']")).click();
		
	}
	/* Check the file from a specific directory with extension */
	private boolean isFileDownloaded_Ext(String dirPath, String ext){
		boolean flag=false;
	    File dir = new File(dirPath);
	    File[] files = dir.listFiles();
	    if (files == null || files.length == 0) {
	        flag = false;
	    }
	    
	    for (int i = 1; i < files.length; i++) {
	    	if(files[i].getName().contains(ext)) {
	    		flag=true;
	    	}
	    }
	    return flag;
	}
	
	/* Get the latest file from a specific directory*/
	private File getLatestFilefromDir(String dirPath){
	    File dir = new File(dirPath);
	    File[] files = dir.listFiles();
	    if (files == null || files.length == 0) {
	        return null;
	    }
	
	    File lastModifiedFile = files[0];
	    for (int i = 1; i < files.length; i++) {
	       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
	           lastModifiedFile = files[i];
	       }
	    }
	    return lastModifiedFile;
	}
	
	
}
