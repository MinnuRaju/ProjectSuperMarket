package com.pom.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminUserPage {
	WebDriver driver;

@FindBy(xpath="//i[@class='nav-icon fas fa-users']")
WebElement element;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
WebElement newbtn;
@FindBy(xpath="//input[@name='username']")
WebElement username;
@FindBy(xpath="//input[@name='password']")
WebElement password;
@FindBy(xpath="//select[@id='user_type']")
public
WebElement usertype;
@FindBy(xpath="//button[@name='Create']")
public
WebElement submitbtn;
@FindBy(xpath="//button[@name='Create']")
WebElement resetbtn;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
public
WebElement createsuccess;
@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss'][1]")
WebElement editbtn;
@FindBy(xpath="//a[@class='btn btn-sm btn btn-danger btncss'][1]")
WebElement deletbtn;
@FindBy(xpath="//button[@class='btn btn-block-sm btn-info']")
public
WebElement updatebtn;

  public void create(String uname,String pword) {
	  element.click();
	  newbtn.click();
	  username.clear();
	  username.sendKeys(uname);
	  password.clear();
	  password.sendKeys(pword);
  }

  public void edit(String uname,String pword) {
	  editbtn.click();
	  username.clear();
	  username.sendKeys(uname);
	  password.clear();
	  password.sendKeys(pword);
  }
  
  public void delete() {
	  deletbtn.click();
  }




  public AdminUserPage(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }

	
	

}
