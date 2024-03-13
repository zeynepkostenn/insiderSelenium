package Page;

import Base.BasePage;
import Test.InsiderScenarioTest;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import java.util.logging.Logger;
import static Constants.ConstantsQACareerPage.*;

public class QACareerPage extends BasePage {
    public QACareerPage(WebDriver webDriver) {
        super(webDriver);
    }
    private static Logger log = Logger.getLogger(InsiderScenarioTest.class.getName());

    public QACareerPage checkPage() {
        //scroll(TITLE);
        Assert.assertNotNull(findElement(TITLE));
        return this;
    }

    public QACareerPage clickQACarrerPageUrl(){
        navigateToUrl(QA_CAREER_PAGE_URL);
        return this;
    }
    public QACareerPage clickFilter(){
        click(FILTER);
        return this;
    }
}
