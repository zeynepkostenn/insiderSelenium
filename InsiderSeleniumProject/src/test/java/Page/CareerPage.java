package Page;

import Base.BasePage;
import Test.InsiderScenarioTest;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import java.util.logging.Logger;

import static Constants.ConstantsCarrersPage.*;

public class CareerPage extends BasePage {
    public CareerPage(WebDriver webDriver) {
        super(webDriver);
    }
    private static Logger log = Logger.getLogger(InsiderScenarioTest.class.getName());

    public CareerPage checkPage() {
        //scroll(LOCATION);
        Assert.assertNotNull(findElement(LOCATION));
        return this;
    }

    public CareerPage teamsControl(){
        boolean elementExist = checkElementIsExist(TEAMS);
        if (elementExist){
            log.info(TEAMS + " ekran uzerinde tespit edilmiştir.");
        }else {
            log.info(TEAMS + "ekran uzerinde tespit edilememistir.");
        }
        return this;
    }
    public CareerPage locationControl(){
        boolean elementExist = checkElementIsExist(LOCATION);
        if (elementExist){
            log.info(LOCATION + " ekran uzerinde tespit edilmiştir.");
        }else {
            log.info(LOCATION + "ekran uzerinde tespit edilememistir.");
        }
        return this;
    }
    public CareerPage lifeAtInsiderControl(){
        boolean elementExist = checkElementIsExist(LIFEATINSIDER);
        if (elementExist){
            log.info(LIFEATINSIDER + " ekran uzerinde tespit edilmiştir.");
        }else {
            log.info(LIFEATINSIDER + "ekran uzerinde tespit edilememistir.");
        }
        return this;
    }

}
