package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Techfios_homepage {

	@FindBy(how=How.XPATH,using=".//*[@id='side-menu']/li[5]/a")
	WebElement bankcash;


	@FindBy(how=How.XPATH,using=".//*[@id='side-menu']/li[5]/ul/li[1]/a")
	WebElement new_account;
	
	@FindBy(how=How.XPATH,using="//span[text()='Products & Services']") 
	WebElement Product_Service; 	 

	@FindBy(how=How.XPATH,using="//a[text()='New Product']")
	 WebElement NewProduct;
	
	@FindBy(how = How.XPATH, using = "//text()[contains(.,'CRM')]/ancestor::a[1]")
	WebElement CRM;
	@FindBy(how = How.XPATH, using = "//a[text()='Add Contact']")
	WebElement AddContact;


public void ClickNewProducts()
{

Product_Service.click();
NewProduct.click();

}
	
	
public void click_Account(){
	
	bankcash.click();
	new_account.click();	
	
	
}

public void click_CrmProduct() {
	
	CRM.click();
	AddContact.click();
}


}
