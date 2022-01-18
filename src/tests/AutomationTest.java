package tests;


import org.testng.Assert;
import org.testng.annotations.Test;


import pages.HomePage;
import pages.PdpPage;


public class AutomationTest extends Browser{

	
	
	@Test(priority=0)
	public void ProductTest() throws InterruptedException {
		
		HomePage HP = new HomePage(driver);
		HP.searchField_Fill();
		Thread.sleep(2000);
		HP.searchIcon_Click();
		Thread.sleep(2000);
	     
		
		PdpPage PDP = new PdpPage(driver);
		
		if(PDP.pdpItem_IsDisplayed() == true) {
			System.out.println("PDP Item is displayed!");
		}else {
			System.out.println("PDP Item is NOT displayed!");
		}
		
		PDP.pdpItem_Click();
		Thread.sleep(2000);
		
		PDP.selectColorIcon_Click();	
		Thread.sleep(2000);
		
		PDP.selectSizeDropdown_Click();
		Thread.sleep(2000);
		
		PDP.selectSizeM_Select();
		Thread.sleep(3500);
		
		PDP.sendToafriend_Click();
		Thread.sleep(2000);
		
		PDP.nameInputField_Fill();
		Thread.sleep(2000);
		
		PDP.emailInputField_Fill();
		Thread.sleep(2000);
		
		PDP.sendButton_Click();
		Thread.sleep(2000);
		
		PDP.sendToAFriendMessage_Close();
		Thread.sleep(2000);
		
		PDP.addToCartButton_Click();
		Thread.sleep(5000);
		
		
		
		Assert.assertEquals(PDP.successfulAddedToCart_GetText(), "Product successfully added to your shopping cart");;
		
		Thread.sleep(1000);

		
	}
	

}
