package com.Plobal.TestScripts;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.extent.ExtentReporter;
import com.utility.Utilities;

public class PlobalTestScripts {
//hello
	private com.business.Plobal.PlobalBusinessLogic plobalBusiness;

	@BeforeTest
	public void Before() throws InterruptedException {
		Utilities.relaunch = true;
		plobalBusiness = new com.business.Plobal.PlobalBusinessLogic("plobal");
	}

	@Test(priority = 0)
	public void plobalAppLaunch() throws Exception {
		plobalBusiness.plobalWelcome();
		ExtentReporter.jiraID = "PP-58";
	}

	@Parameters({ "invalidEmailId", "invalidPassword", "validEmailId", "validPassword" })
	@Test(priority = 1)
	public void plobalLogin(String invalidEmailId, String invalidPassword, String validEmailId, String validPassword)throws Exception {
		plobalBusiness.loginToApp(invalidEmailId, invalidPassword, validEmailId, validPassword);
		ExtentReporter.jiraID = "PP-66";
	}

	@Parameters({ "size" })
	@Test(priority = 2)
	public void plobalSelectItem(String size) throws Exception {
		plobalBusiness.productItem(size);
		ExtentReporter.jiraID = "PP-62";
	}

	@Test(priority = 3)
	public void plobalPaymentOption() throws Exception {
		plobalBusiness.paymentOptions();
		ExtentReporter.jiraID = "PP-63";
	}

	@Parameters({ "address" })
	@Test(priority = 4)
	public void plobalDeliveryAddress(String address) throws Exception {
		plobalBusiness.paymentCheckOut(address);
		ExtentReporter.jiraID = "PP-64";
	}

	@Parameters({ "deliveryaddress" })
	@Test(priority = 5)
	public void plobalSearchProduct(String deliveryaddress) throws Exception {
		plobalBusiness.searchProduct(deliveryaddress);
		ExtentReporter.jiraID = "PP-65";
	}

	@Parameters({ "searchAddress" })
	@Test(priority = 6)
	public void plobalSearchProductByBarCode(String searchAddress) throws Exception {
		plobalBusiness.barCodeSearch(searchAddress);
		ExtentReporter.jiraID = "PP-67";
	}

	@Test(priority = 7)
	public void plobalLogout() throws Exception {
		plobalBusiness.logOut();
		ExtentReporter.jiraID = "PP-56";
	}
	
	@Parameters({ "cleverTapEmail","cleverTapPassword" , "email"})
	@Test(priority = 8)
	public void plobalCleverTap(String cleverTapEmail, String cleverTapPassword, String email) throws Exception {
		plobalBusiness.CleverTap(cleverTapEmail,cleverTapPassword, email);
//		ExtentReporter.jiraID = "PP-56";
	}
	
	@Test(priority = 9)
	public void plobalCleverTapLoginevents() throws Exception
	{
		plobalBusiness.loginEventsCleverTap();
		ExtentReporter.jiraID = "PP-77";
	}
	
	@Test(priority = 10)
	public void plobalCleverTapProductViewed() throws Exception
	{
		plobalBusiness.productViewedCleverTap();
		ExtentReporter.jiraID = "PP-78";
	}
	
	@Test(priority = 11)
	public void plobalCleverTapAddToCart() throws Exception
	{
		plobalBusiness.addToCartCleverTap();
		ExtentReporter.jiraID = "PP-79";
	}
	
	@Test(priority = 12)
	public void plobalCleverTapPaymentPending() throws Exception
	{
		plobalBusiness.orderPlacedPaymentPending();
		ExtentReporter.jiraID = "PP-80";
	}
	
	@Test(priority = 13)
	public void plobalCleverTapSelectAddress() throws Exception
	{
		plobalBusiness.orderSelectAddressCleverTap();
		ExtentReporter.jiraID = "PP-81";
	}
	
	@Test(priority = 14)
	public void plobalCleverTapOrderCharged() throws Exception
	{
		plobalBusiness.orderChargedCleverTap();
		ExtentReporter.jiraID = "PP-82";
	}
	
	@Test(priority = 15)
	public void plobalCleverTapLogout() throws Exception
	{
		plobalBusiness.logoutCleverTap();
		ExtentReporter.jiraID = "PP-83";
	}
	
	

	@AfterTest
	public void plobalAppQuit() throws Exception {
		plobalBusiness.TearDown();
	}
}
