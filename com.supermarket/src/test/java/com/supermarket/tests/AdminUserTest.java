package com.supermarket.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pom.supermarket.pages.AdminUserPage;
import com.pom.supermarket.pages.LoginPage;
import com.pom.supermarket.utilities.ExcelUtil;
import com.pom.supermarket.utilities.FileUploadUtil;
import com.pom.supermarket.utilities.GeneralUtility;
import com.pom.supermarket.utilities.WaitUtil;
import com.supermarket.constants.Constants;
import com.supermarket.extenreport.TestListener;

import junit.framework.Assert;

public class AdminUserTest extends BaseClass {
	GeneralUtility general;
	ExcelUtil excel;
	LoginPage loginp;
	AdminUserPage admin;
	WaitUtil waitobj;
	ThreadLocal<ExtentTest> extentTest = TestListener.getTestInstance();
	
	
@Test(description="Validate the new user created",priority=0,enabled=true)	
  public void createNewUser() throws IOException {
	   excel= new ExcelUtil();
	   loginp=new LoginPage(driver);
	   extentTest.get().log(Status.PASS, "LOGIN TO THE APPLICATION");
	   loginp.login(excel.readData(0, 1 ),excel.readData(1, 1));
	   admin=new AdminUserPage(driver);
	   admin.create(excel.readData(35, 1), excel.readData(36, 1));
	   waitobj=new WaitUtil();
	   waitobj.implicitWait(driver);
	   general=new GeneralUtility();
	   general.selectByValue(admin.usertype, Constants.usertypedropdown);
	   general.clickCommand(admin.submitbtn);
	   Assert.assertEquals(admin.createsuccess, Constants.adminusersuccesmsg);
	  
}

@Test(description="Validate the editing of user",priority=1,enabled=true)
  public void editUser() {
	 admin=new AdminUserPage(driver);
	 admin.edit(excel.readData(35, 1), excel.readData(36, 1));
	 waitobj=new WaitUtil();
	 waitobj.implicitWait(driver);
	 general=new GeneralUtility();
	 general.selectByValue(admin.usertype, Constants.usertypedropdown);
	 general.clickCommand(admin.updatebtn);
	 
	 
}
@Test(description="Vlaidate delete user",priority=2)
  public void deleteUser() {
	admin=new AdminUserPage(driver);
	admin.delete();
	general=new GeneralUtility();
	general.alertAccept(driver);
}

}
