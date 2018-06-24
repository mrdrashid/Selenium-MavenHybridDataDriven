package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddCrmContactPage;
import page.New_Bank;
import page.Techfios_homepage;
import page.Techfios_login;
import reader.ReadData;
import util.BrowserFactory;

public class AddCrmContactTest {

ReadData readExcelData = new ReadData();
	
	String UserName ;
	String Password;
	String account;
	String company;
	String email;
	String phone;
	String address;
	String city;
	String state;
	String zip;
	//String submit;
	
	public AddCrmContactTest() throws IOException{
		
		//String userdata[][]= readExcelData.getLogInDataFromExcelFile();	
		String userdata[][]= readExcelData.getLogInDataFromExcelFile();
		System.out.println(userdata.length);
		for(int j=1; j<userdata.length;j++)
		{
			UserName = userdata[j][0];
			Password = userdata[j][1];
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
	
	public void TechfiosTest() throws IOException ,InterruptedException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
		Techfios_login login = PageFactory.initElements(driver, Techfios_login.class);
		login.login_techfios(UserName, Password);
		Techfios_homepage click = PageFactory.initElements(driver, Techfios_homepage.class);		
		click.click_CrmProduct();
	
		AddCrmContactPage  Contacts = PageFactory.initElements(driver, AddCrmContactPage.class);	
		Contacts.AddCrmContact(account, company, email, phone, address, city, state, zip);
		
		driver.close();
		driver.quit();
	}
}


