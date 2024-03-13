package Page;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import static Constants.ConstantsMainPage.*;

public class MainPage extends BasePage {
    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }
    public MainPage approveCookies() {
        isElementVisible(ACCEPT_ALL);
        click(ACCEPT_ALL);
        return this;
    }
    public MainPage clickCompany(){
        click(COMPANY);
        return this;
    }
    public MainPage clickCareers(){
        click(CAREERS);
        return this;
    }
}
