package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject {

	
	public HomePage(WebDriver driver) {
		super(driver);
	}
		
		//Elements
		private WebElement searchField() {
			return driver.findElement(By.xpath("//input[@id='search_query_top']"));
		}
		
        private WebElement searchIcon() {
        	return driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]"));
        }
       
		
		//Actions
		public void searchField_Fill() {
			searchField().sendKeys("Shirt");
		}
		
        public void searchIcon_Click() {
        searchIcon().click();
        }
	 
}
