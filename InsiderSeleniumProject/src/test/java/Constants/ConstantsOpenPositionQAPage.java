package Constants;


import org.openqa.selenium.By;

public class ConstantsOpenPositionQAPage {
    public static final By FILTER_BY_LOCATION = By.xpath("//span[@id='select2-filter-by-location-container']");
    public static final By LOCATION_ISTANBUL = By.xpath("//li[contains(@data-select2-id,'Istanbul')]");
    public static final By QA_DEPARTMENT = By.xpath("//span[contains(@title,'Quality Assurance')]");
    public static final By POSITION_TITLE = By.xpath("//p[@class='position-title font-weight-bold' and contains(text(),'Quality Assurance')]");
    public static final By POSITION_DEPARTMENT = By.xpath("//*[contains(@class,'position-department text-large')]");
    public static final By POSITION_LOCATION = By.xpath("//*[contains(@class,'position-location')]");
    public static final By POSITIONCARD = By.xpath("//div[@class='position-list-item-wrapper bg-light']");
    public static final By ILKPOSITIONCARD = By.xpath("(//div[@data-team='qualityassurance'])[1]");
    public static final By VIEW_ROLE = By.xpath("(//a[text()='View Role'])[1]");
    public static final By APPLYFORTHISJOB = By.xpath("//a[text()='Apply for this job'])[1]");

}
