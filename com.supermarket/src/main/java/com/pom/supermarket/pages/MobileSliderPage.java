package com.pom.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.supermarket.utilities.GeneralUtility;

public class MobileSliderPage {
	WebDriver driver;
	GeneralUtility general;
	
	
	
@FindBy(xpath="//i[@class='nav-icon fas fa-window-minimize']")	
WebElement mobileslider;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")	
WebElement newbtn;
@FindBy(xpath="//select[@class='form-control selectpicker']")
public	
WebElement categorydrop;	
@FindBy(xpath="//input[@name='main_img']")
public	
WebElement choosefiledrop;
@FindBy(xpath="//button[@name='create']")
public	
WebElement savebtn;
@FindBy(xpath="//a[@class='btn btn-default btn-fix']")
public	
WebElement cancelbtn;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
public	
WebElement alertmsg;
@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss'][1]")	
WebElement editbtn;
@FindBy(xpath="//button[@name='update']")
public	
WebElement updatebtn;
@FindBy(xpath="//a[@class='btn btn-sm btn btn-danger btncss'][1]")	
WebElement deletebtn;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
public	
WebElement editalertmsg;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
public	
WebElement deletealertmsg;


  public void create() {
	  mobileslider.click();
	  newbtn.click();  
  }

  public void edit() {
	  editbtn.click();
  }
  
  public void delete() {
	  deletebtn.click();
  }














   public MobileSliderPage(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }



	
}
