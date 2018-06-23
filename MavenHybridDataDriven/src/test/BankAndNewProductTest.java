package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddCrmContactPage;
import page.BankAndNewProductPage;
import page.NewProductPage;
import page.New_Bank;
import page.Techfios_homepage;
import page.Techfios_login;
import reader.ReadData;
import util.BrowserFactory;

public class BankAndNewProductTest {
ReadData readExcelData = new ReadData();
	
	String username ;
	String password;
	String accounttile;
	String description;
	String blance;
	String Name;
	String Price;
	String Itemnumber;
	String Description;
	String account;
	String company;
	String email;
	String phone;
	String address;
	String city;
	String state;
	String zip;

	
	
	public BankAndNewProductTest() throws IOException{
		
		String userdata[][]= readExcelData.getLogInDataFromExcelFile();	
		for(int j=1; j<userdata.length;j++)
		{
			username = userdata[j][0];
			password = userdata[j][1];
			accounttile = userdata[j][2];
			description = userdata[j][3];
			blance = userdata[j][4];
			Name=userdata[j][5];
			Price=userdata[j][6];
			Itemnumber=userdata[j][7];
			Description=userdata[j][8];	
			account = userdata[j][9];
			company = userdata[j][10];
			email = userdata[j][11];
			phone = userdata[j][12];
			address = userdata[j][13];
			city = userdata[j][14];
			state = userdata[j][15];
			zip = userdata[j][16];
			
	    }		
	}
		
	@Test
	public void TechfiosTest() throws IOException, InterruptedException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
		Techfios_login login = PageFactory.initElements(driver, Techfios_login.class);
		login.login_techfios(username, password);
		Techfios_homepage click = PageFactory.initElements(driver, Techfios_homepage.class);	
		click.click_CrmProduct();
		AddCrmContactPage  Contacts = PageFactory.initElements(driver, AddCrmContactPage.class);	
		Contacts.AddCrmContact(account, company, email, phone, address, city, state, zip);
		
		Thread.sleep(3000);
		
		click.click_Account();
	
		New_Bank account1 = PageFactory.initElements(driver, New_Bank.class);	
		account1.select_account(accounttile, description, blance);
		
		Thread.sleep(3000);
	
		Techfios_homepage home = PageFactory.initElements(driver, Techfios_homepage.class);		
		home.ClickNewProducts();
		
		Thread.sleep(2000);
		
		NewProductPage  product = PageFactory.initElements(driver, NewProductPage.class);	
		product.AddingNewProductInfo(Name, Price, Itemnumber, Description);
		
		
		
		driver.close();
		driver.quit();
	}
}

