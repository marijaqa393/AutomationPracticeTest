package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class PdpPage extends PageObject {

	public PdpPage(WebDriver driver) {
		super(driver);
	}

	
	//Elements
	        private WebElement pdpItem() { 
     	        return driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]"));
     }
			private WebElement  sendToAFriend() {
				return driver.findElement(By.xpath("//a[@id='send_friend_button']"));
			}
			private WebElement  nameInputField() {
				return driver.findElement(By.xpath("//input[@id='friend_name']"));
			}
			
			private WebElement  emailInputField() {
				return driver.findElement(By.xpath("//input[@id='friend_email']"));
			}
			private WebElement sendButton() {
				return driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]/button[1]/span[1]"));
			}
		
			private WebElement selectColorIcon() {
				return driver.findElement(By.xpath("//a[@id='color_14']"));
			}

			private WebElement selectSizeDropdown() {
				return driver.findElement(By.xpath("//select[@id='group_1']"));
			}
		
			/*private WebElement selectSizeM() {
				return driver.findElement(By.xpath("//option[contains(text(),'M')]"));
			}
			*/
			private WebElement addToCartButton() {
				return driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
			}
			
			private WebElement sendToAFriendMessage() {
				return driver.findElement(By.xpath("//input[@class='button']"));
			}
			
			private WebElement successfulAddedToCart() {
				return driver.findElement(By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']/h2[1]"));
			}
			
			//Actions
			
		    public void pdpItem_Click() {
			    	pdpItem().click();
			    }
			
			
			public void sendToafriend_Click() {
				sendToAFriend().click();
			}
			public void nameInputField_Fill() {
				nameInputField().sendKeys("Marija");
			}
			
			public void emailInputField_Fill() {
				emailInputField().sendKeys("marija@yopmail.com");
			}
			public void sendButton_Click() {
				sendButton().click();
			}
			
	        public void selectColorIcon_Click() {
	        	selectColorIcon().click();
           }
 
	        public void selectSizeDropdown_Click() {
	        	selectSizeDropdown().click();
	        }
	        
	        public void selectSizeM_Select() {
	        	selectSizeDropdown().sendKeys("M");
	        	selectSizeDropdown().sendKeys(Keys.ENTER);
	        }
	        public void addToCartButton_Click() {
	        	addToCartButton().click();
	        }
	        
	        public String successfulAddedToCart_GetText() {
	        return successfulAddedToCart().getText();
	        }
	        
	        public void sendToAFriendMessage_Close() {
	        	sendToAFriendMessage().click();
	        }
	        
	        public boolean pdpItem_IsDisplayed() {
	        	return pdpItem().isDisplayed();
	        }
}
