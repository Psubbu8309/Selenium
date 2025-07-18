package selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPomPage {


	// Declaration
	@FindBy(xpath = "//h2")
	private WebElement header;

	@FindBy(name = "email")
	private WebElement UN;

	@FindBy(id = "pass")
	private WebElement pswd;

	@FindBy(name = "login")
	private WebElement login;

	// Initialization
	public FBLoginPomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getHeader() {
		return header;
	}

	public WebElement getUN() {
		return UN;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getLogin() {
		return login;
	}

}

	