package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BankAndNewProductPage {
	
WebDriver driver;
	
	public BankAndNewProductPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how=How.ID,using="account")
	WebElement account;


	@FindBy(how=How.ID,using="description")
	WebElement Description;
	
	
	@FindBy(how=How.ID,using="balance")
	WebElement Balance;
	
	@FindBy(how=How.XPATH,using=".//*[@id='page-wrapper']/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement submit;	
	
	 @FindBy(how=How.ID,using="name")
	 WebElement Prodname1;
	 
	 @FindBy(how=How.ID,using="sales_price")
	 WebElement SalesPrice;
	 
	 @FindBy(how=How.ID, using="item_number")
	 WebElement item_number;
	 
	 @FindBy(how=How.ID, using="description")
	 WebElement Description1;
	  
	 @FindBy(how=How.ID,using="submit")
	 WebElement submit_button;
	 
	 @FindBy(how=How.ID,using="account")
		WebElement FullName;
		
		@FindBy(how=How.ID, using="company")
		WebElement companys;
		
		@FindBy(how=How.ID, using="email")
		WebElement emails;
		
		@FindBy(how=How.ID, using="phone")
		WebElement phones;
		
		@FindBy(how=How.ID, using="address")
		WebElement addres;
		
		@FindBy(how=How.ID, using="city")
		WebElement citys;
		
		@FindBy(how=How.ID, using="state")
		WebElement sta;

		
		@FindBy(how=How.ID, using="zip")
		WebElement zipcode;
		
		@FindBy(how=How.ID, using="submit")
		WebElement submits;

	
	

	 public void select_account1(String Prodname,String account_title,String Desc,String balan){
			Prodname1.sendKeys(Prodname);
			account.sendKeys(account_title);	
			Description.sendKeys(Desc);
			Balance.sendKeys(balan);
		    submit.click();
		    
	 }  
	 
	 
	
	public void select_account2(String Prodname, String price,String itemnumber,String Desc1){	 
		     
			 SalesPrice.sendKeys(price);
			 item_number.sendKeys(itemnumber);
			 Description.sendKeys(Desc1);
			 submit_button.click(); 
	}		 
			 public void AddCrmContact(String account,String company,String email,String phone, String address, String city, String state, String zip) 
			 {	
			 FullName.sendKeys(account);
			 companys.sendKeys(company);
			 emails.sendKeys(email);
			 phones.sendKeys(phone);
			 addres.sendKeys(address);
			 citys.sendKeys(city);
			 sta.sendKeys(state);
			 zipcode.sendKeys(zip);
			 submits.click();		 
		

}
}


