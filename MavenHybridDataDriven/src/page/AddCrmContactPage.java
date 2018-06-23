package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCrmContactPage {
	
	WebDriver driver;
	
public AddCrmContactPage(WebDriver ldriver){
		
	this.driver=ldriver;

}


//username=Id= user_login

/*@FindBy(how=How.XPATH,using="//text()[contains(.,'CRM')]/ancestor::a[1]")
WebElement CRM;
@FindBy(how=How.XPATH,using="//a[text()='Add Contact']")
	WebElement AddContact;
	*/
	@FindBy(how=How.ID,using="account")
	WebElement FullName;
	
	@FindBy(how=How.ID, using="company")
	WebElement company;
	
	@FindBy(how=How.ID, using="email")
	WebElement email;
	
	@FindBy(how=How.ID, using="phone")
	WebElement phone;
	
	@FindBy(how=How.ID, using="address")
	WebElement addres;
	
	@FindBy(how=How.ID, using="city")
	WebElement city;
	
	@FindBy(how=How.ID, using="state")
	WebElement state;
	
	@FindBy(how=How.ID, using="zip")
	WebElement zip;
	
	@FindBy(how=How.ID, using="submit")
	WebElement submit;
	
	public void AddCrmContact(String account,String Company,String Email,String Phone, String address, String City, String State, String Zip) 
	 {	
	 FullName.sendKeys(account);
	 company.sendKeys(Company);
	 email.sendKeys(Email);
	 phone.sendKeys(Phone);
	 addres.sendKeys(address);
	 city.sendKeys(City);
	 state.sendKeys(State);
	 zip.sendKeys(Zip);
	 submit.click();
	
}
}
