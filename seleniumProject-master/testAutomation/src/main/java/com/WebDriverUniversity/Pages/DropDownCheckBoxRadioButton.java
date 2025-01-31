package com.WebDriverUniversity.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class DropDownCheckBoxRadioButton extends PageObject {
	
	public DropDownCheckBoxRadioButton(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"checkboxes\"]/label[4]")
	private WebElement checkBox;

	@FindBy(id="dropdowm-menu-1")
	private WebElement dropDownMenu;
	
	public void clickCheckBox() {
		Select select = new Select(dropDownMenu);
		select.selectByIndex(1);
		checkBox.click();
	}
}

