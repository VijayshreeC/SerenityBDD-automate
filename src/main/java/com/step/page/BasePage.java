package com.step.page;

import com.step.objects.LoginObject;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BasePage extends PageObject implements LoginObject{
	
	@FindBy(xpath="")
	WebElementFacade search
;
	public void openBrowser() {
		open();
		element(search).type("asdf");
		search.type("adf");
		
		search.shouldBeCurrentlyVisible();
		search.shouldBePresent();
		//search.containsOnlyText(arg0);
	}

}
