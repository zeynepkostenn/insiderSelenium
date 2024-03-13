package Test;

import Base.BaseTest;
import Page.CareerPage;
import Page.MainPage;
import Page.OpenPositionQAPage;
import Page.QACareerPage;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.logging.Logger;


public class InsiderScenarioTest extends BaseTest {
    MainPage mainPage;
    CareerPage careerPage;
    QACareerPage qaCareerPage;
    OpenPositionQAPage openPositionQAPage;

    private static Logger log = Logger.getLogger(InsiderScenarioTest.class.getName());

    @BeforeClass
    public static void beforeClass() throws Exception {
        log.info("**************** Test started ****************");
    }

    @Before
    public void before() {
        mainPage = new MainPage(getWebDriver());
        careerPage = new CareerPage(getWebDriver());
        qaCareerPage = new QACareerPage(getWebDriver());
        openPositionQAPage = new OpenPositionQAPage(getWebDriver());
        log.info("**************** Driver activated ***************");

    }


    @Test
    public void testmainPage() throws InterruptedException {
        log.info("**************** Insider test Started ***************");

        ExpectedConditions.titleIs("#1 Leader in Individualized, Cross-Channel CX — Insider");

        mainPage
                .approveCookies()
                .clickCompany() //Company Tab'ına tıklanır.
                .clickCareers(); //Carrers Tab'ına tıklanıldı.
        careerPage
                .checkPage()
                .teamsControl()
                .locationControl()
                .lifeAtInsiderControl();
        qaCareerPage
                .clickQACarrerPageUrl()
                .checkPage()
                .clickFilter();
        openPositionQAPage
                .clickFilterByLocation()
                .clickLocationIstanbul()
                .departmentQaControl()
                .listPositionTitleControl()
                .listPositionDepartmentControl()
                .listPositionLocationControl()
                .clickViewRole()
                .checkLeverApp();


        log.info("**************** SCENARIO FINISHED *************");

    }


    @After
    public void after() throws InterruptedException {
        tearDown();
        log.info("**************** Test Finished ****************");
    }


}
