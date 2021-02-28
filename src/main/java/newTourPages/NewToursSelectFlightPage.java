package newTourPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToursSelectFlightPage extends NewTBasePage_WebElement {

    public NewToursSelectFlightPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//input[@value='Blue Skies Airlines$361$271$7:10']")
    private WebElement departFlightRadio;

    @FindBy(xpath = "//input[@value='Unified Airlines$633$303$18:44']")
    private WebElement returnFlightRadio;

    @FindBy(xpath = "//input[@name='reserveFlights']")
    private WebElement reserveFlightLocator;

    public void clickOnDepartureRadioButton(){

        click(departFlightRadio);
    }
    public void clickOnReturnRadioButton(){

        click(returnFlightRadio);
    }
    public void clickOnReserveFlight(){
        click(reserveFlightLocator);
    }


}
