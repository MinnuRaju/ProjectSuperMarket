package com.pom.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategory {
	WebDriver driver;

@FindBy(xpath="//li[@class='nav-item has-treeview'][3]")
WebElement managectbtn;
@FindBy(xpath="//a[@class='active nav-link']")
WebElement categorybtn;
@FindBy(xpath="//p[text()='Sub Category']")
WebElement subcategory;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
WebElement newbtn;
@FindBy(xpath="//input[@name='category']")
WebElement categorytextbox;
@FindBy(xpath="//li[@class='ms-elem-selectable ms-hover']")
WebElement selectgrop1;
@FindBy(xpath="//div[@class='ms-selection']")
WebElement selectgrop2;
@FindBy(xpath="//input[@name='main_img']")
WebElement choosefile;
@FindBy(xpath="//input[@name='top_menu'][1]")
WebElement radio1;
@FindBy(xpath="//input[@name='show_home']")
WebElement radio2;




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ManageCategory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}
