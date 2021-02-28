package newTourPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToursLandingPages extends NewTBasePage_WebElement {

    public NewToursLandingPages(WebDriver driver) {

        super(driver);
    }

    @FindBy(linkText = "SIGN-ON")
    private WebElement signOnPage;

    @FindBy(linkText = "REGISTER")
    private WebElement registerPage;

    @FindBy(linkText = "SUPPORT")
    private WebElement supportPage;

    @FindBy(linkText = "CONTACT")
    private WebElement contactPage;

    //  SIGN-ON PAGE LINK CALLING CLASS
    public void clickOnRegisterPage() {

        click(registerPage);
    }

    public void clickOnSignOnLink() {

        click(signOnPage);
    }

    public void clickOnSupportLink(){
        click(supportPage);
    }

    public void clickOnContactLink(){

        click(contactPage);
    }

}
