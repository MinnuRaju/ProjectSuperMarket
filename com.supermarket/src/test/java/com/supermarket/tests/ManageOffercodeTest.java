package com.supermarket.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pom.supermarket.pages.LoginPage;
import com.pom.supermarket.pages.ManageOfferCodePage;
import com.pom.supermarket.pages.Managepage;
import com.pom.supermarket.utilities.ExcelUtil;
import com.pom.supermarket.utilities.FileUploadUtil;
import com.pom.supermarket.utilities.GeneralUtility;
import com.supermarket.constants.Constants;
import com.supermarket.extenreport.TestListener;

import junit.framework.Assert;

public class ManageOffercodeTest extends BaseClass {
	GeneralUtility general;
	ExcelUtil excel;
	LoginPage loginp;
	ManageOfferCodePage mofer;
	FileUploadUtil fileup;
	ThreadLocal<ExtentTest> extentTest = TestListener.getTestInstance();

@Test(description="Validate new Item Created",priority=0,enabled=true)
	public void createNewItem() throws IOException, InterruptedException {
	   excel= new ExcelUtil();
	   loginp=new LoginPage(driver);
	   extentTest.get().log(Status.PASS, "LOGIN TO THE APPLICATION");
	   loginp.login(excel.readData(0, 1 ),excel.readData(1, 1));
	   mofer=new ManageOfferCodePage(driver);
	   mofer.create();
	   mofer.offercode(excel.readData(27, 1));
	   general=new GeneralUtility();
	   general.clickCommand(mofer.radionbtnyes);
	   mofer.createFields(excel.readData(28, 1), excel.readData(29, 1), excel.readData(30, 1));
	   fileup= new FileUploadUtil();
	   fileup.fileUploadBySendkeys(mofer.choosefilebtn, Constants.path);
	   general.scroll(driver);
	   Thread.sleep(3000);
	   general.clickCommand(mofer.savebtn);
	  // Assert.assertEquals(mofer.alert, Constants.ofercodealert);
	   general.scroll(driver);
	   Thread.sleep(3000);
	   general.clickCommand(mofer.cancelbtn);
	   
		
	}
@Test(description="Validate the edit",priority=1,enabled=true)
	public void editItem() throws InterruptedException {
	 mofer=new ManageOfferCodePage(driver);
	 mofer.edit();
	 mofer.editofercode(excel.readData(31, 1));
	 general=new GeneralUtility();
	 general.clickCommand(mofer.radionbtnno);
	 mofer.editfields(excel.readData(32, 1), excel.readData(33, 1), excel.readData(34, 1));
	 fileup= new FileUploadUtil();
	 fileup.fileUploadBySendkeys(mofer.choosefilebtn, Constants.path);
	 general.scroll(driver);
	 Thread.sleep(3000);
	 general.clickCommand(mofer.updatebtn);
	 Assert.assertEquals(mofer.editalert, Constants.ofercodealertedit);
	
	   
	 
	}
@Test(description="Validate the delete",priority=2,enabled=true)
   public void deleteItem() {
	 mofer=new ManageOfferCodePage(driver);
	 mofer.delete();
	 Assert.assertEquals(mofer.deletealert, Constants.ofrcodedeletealert);
}

}

