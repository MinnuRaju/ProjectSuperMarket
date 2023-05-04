package com.pom.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.supermarket.utilities.GeneralUtility;

public class ManageOfferCodePage {
	WebDriver driver;
	GeneralUtility general;
	
@FindBy(xpath="//i[@class='nav-icon fas fa-cubes']")
WebElement manageofrbtn;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
WebElement newbtn;
@FindBy(xpath="//input[@name='offer_code']")
WebElement offercode;
@FindBy(xpath="//input[@value='yes']")
public
WebElement radionbtnyes;
@FindBy(xpath="//input[@value='no']")
public
WebElement radionbtnno;
@FindBy(xpath="//input[@name='offer_per']")
WebElement offerpercn;
@FindBy(xpath="//input[@name='offer_price']")
WebElement amount;
@FindBy(xpath="//div[@class='note-editable card-block']")
WebElement decription;
@FindBy(xpath="//input[@name='main_img']")
public
WebElement choosefilebtn;
@FindBy(xpath="//a[@type='button']")
public
WebElement cancelbtn;
@FindBy(xpath="//button[@class='btn btn-danger']")
public
WebElement savebtn;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
public
WebElement alert;
@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss'][1]")
WebElement editbtn;
@FindBy(xpath="//button[@name='update']")
public
WebElement updatebtn;
@FindBy(xpath="//a[@class='btn btn-default btn-fix']")
public
WebElement cancelbtnedit;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
public
WebElement editalert;
@FindBy(xpath="//i[@class='fas fa-trash-alt'][1]")
WebElement deletebtn;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
public
WebElement deletealert;

  public void create() throws InterruptedException {
	  manageofrbtn.click();
	  newbtn.click();
  }
  
  public void offercode(String ofer) {
	  offercode.sendKeys(ofer);
  }
  
  public void createFields(String percentage,String amounts,String desc) {
	  offerpercn.sendKeys(percentage);
	  amount.sendKeys(amounts);
	  decription.sendKeys(desc);
  }
  
  public void edit() {
	  editbtn.click();
	  
  }
  public void editofercode(String ofer) {
	  offercode.clear();
	  offercode.sendKeys(ofer);
  }
  
  public void editfields(String percentagee,String amountse,String desce) {
	  offerpercn.clear();
	  offerpercn.sendKeys(percentagee);
	  amount.clear();
	  amount.sendKeys(amountse);
	  decription.clear();
	  decription.sendKeys(desce);
  }
  
  public void delete() {
	  deletebtn.click();
	  general=new GeneralUtility();
	  general.alertAccept(driver);
  }
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ManageOfferCodePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
