package Page;

import Base.BasePage;
import Test.InsiderScenarioTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static Constants.ConstantsCarrersPage.LOCATION;
import static Constants.ConstantsOpenPositionQAPage.*;

public class OpenPositionQAPage extends BasePage {
    public OpenPositionQAPage(WebDriver webDriver) {
        super(webDriver);
    }
    private static Logger log = Logger.getLogger(InsiderScenarioTest.class.getName());


    public OpenPositionQAPage clickFilterByLocation(){
        scroll(QA_DEPARTMENT);
        click(FILTER_BY_LOCATION);
        return this;
    }
    public OpenPositionQAPage clickLocationIstanbul(){
        click(LOCATION_ISTANBUL);
        return this;
    }
    public OpenPositionQAPage departmentQaControl(){
        boolean elementExist = checkElementIsExist(QA_DEPARTMENT);
        if (elementExist){
            log.info(QA_DEPARTMENT + " ekran uzerinde tespit edilmiştir.");
        }else {
            log.info(QA_DEPARTMENT + "ekran uzerinde tespit edilememistir.");
        }
        return this;
    }
    public OpenPositionQAPage listPositionTitleControl(){
        scroll(POSITION_TITLE);
        List<WebElement> items = findElements(POSITIONCARD);

        for ( int i = 1 ; i <= items.size() ; i++ ) {
            String str = "(//div[@class='position-list-item-wrapper bg-light'])[" + (i) + "]";
            scroll(By.xpath("//h3[@class='mb-0']"));
            mouseOver(findElement(By.xpath(str)));

            String positionContainsStr = "(//p[@class='position-title font-weight-bold' and contains(text(),'Quality Assurance')])[" + (i) + "]";
            isElementVisible(By.xpath(positionContainsStr));
        }
        return this;
    }

    public OpenPositionQAPage listPositionDepartmentControl(){
        List<WebElement> items = findElements(POSITION_DEPARTMENT);
        for ( int i = 1 ; i <= items.size() ; i++ ) {
            String str = "(//div[@class='position-list-item-wrapper bg-light'])[" + (i) + "]";
            scroll(By.xpath("//h3[@class='mb-0']"));
            mouseOver(findElement(By.xpath(str)));

            String departmentContains = "(//span[@class='position-department text-large font-weight-600 text-primary' and contains(text(),'Quality Assurance')])[" + ( i ) + "]";
            isElementVisible(By.xpath(departmentContains));
        }
        return this;
    }
    public OpenPositionQAPage listPositionLocationControl(){
        List<WebElement> items = findElements(POSITION_LOCATION);
        for ( int i = 1 ; i <= items.size() ; i++ ) {
            String str = "(//div[@class='position-list-item-wrapper bg-light'])[" + (i) + "]";
            scroll(By.xpath("//h3[@class='mb-0']"));
            mouseOver(findElement(By.xpath(str)));

            String locationContainsStr = "(//div[@class='position-location text-large' and contains(text(),'Istanbul, Turkey')])[" + ( i ) + "]";
            isElementVisible(By.xpath(locationContainsStr));
        }
        return this;
    }
    public OpenPositionQAPage clickViewRole(){
        mouseHover(ILKPOSITIONCARD);
        ExpectedConditions.presenceOfElementLocated(VIEW_ROLE);
        return this;
    }
    public OpenPositionQAPage checkLeverApp(){
        //doesStartsWithUrl("https://jobs.lever.co/");
        isElementVisible(APPLYFORTHISJOB);

        return this;
    }
}
