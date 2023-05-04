package com.supermarket.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pom.supermarket.pages.LoginPage;
import com.pom.supermarket.pages.MobileSliderPage;
import com.pom.supermarket.utilities.ExcelUtil;
import com.pom.supermarket.utilities.FileUploadUtil;
import com.pom.supermarket.utilities.GeneralUtility;
import com.supermarket.constants.Constants;
import com.supermarket.extenreport.TestListener;

import junit.framework.Assert;

public class MoblieSliderpTest extends BaseClass {
	GeneralUtility general;
	ExcelUtil excel;
	LoginPage loginp;
	FileUploadUtil filepload;
	MobileSliderPage mbsldr;
	ThreadLocal<ExtentTest> extentTest = TestListener.getTestInstance();
	
	
@Test(description="Validate new Item created",priority=0,enabled=true)	
  public void createnewItem() throws IOException {
	 excel=new ExcelUtil();
     loginp=new LoginPage(driver);
	 extentTest.get().log(Status.PASS, "LOGIN TO THE APPLICATION");
     loginp.login(excel.readData(0, 1), excel.readData(1, 1));
     mbsldr=new MobileSliderPage(driver);
     mbsldr.create();
     general=new GeneralUtility();
     general.selectByVisibletext(mbsldr.categorydrop, Constants.mobliesidercatgrop);
     filepload=new FileUploadUtil();
     filepload.fileUploadBySendkeys(mbsldr.choosefiledrop, Constants.path);
     general.clickCommand(mbsldr.savebtn);
     //Assert.assertEquals(mbsldr.alertmsg, Constants.mobliesideralertmsg);
     general.clickCommand(mbsldr.cancelbtn);
     
     }

@Test(description="Validate edit Item",priority=1) 
   public void editItem() {
	   mbsldr=new MobileSliderPage(driver);
	   mbsldr.edit();
	   general=new GeneralUtility();
	   general.selectByVisibletext(mbsldr.categorydrop, Constants.catchangedrop);
	   filepload=new FileUploadUtil();
	   filepload.fileUploadBySendkeys(mbsldr.choosefiledrop, Constants.path);
	   general.clickCommand(mbsldr.updatebtn);
	   Assert.assertEquals(mbsldr.editalertmsg, Constants.mobileslidereditalertmsg);
	   
	   
   }
@Test(description="validate delete Item",priority=2)   
   public void deleteItem() {
	mbsldr=new MobileSliderPage(driver);
	mbsldr.delete();
	general=new GeneralUtility();
	general.alertAccept(driver);
	Assert.assertEquals(mbsldr.deletealertmsg, Constants.mobilesliderdeletealertmsg);
	
	 
   
	
}


}
