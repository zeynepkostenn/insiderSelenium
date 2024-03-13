package Constants;


import org.openqa.selenium.By;

public class ConstantsMainPage {
    public static final String WEBLINK ="https://useinsider.com/";
    public static final By COMPANY = By.xpath("//a[normalize-space()='Company']");
    public static final By CAREERS = By.xpath("//a[normalize-space()='Careers']");
    public static final By APPLYFORTHISJOB = By.xpath("//a[text()='Apply for this job'])[1]");
    public static final By ACCEPT_ALL = By.cssSelector("a#wt-cli-accept-all-btn");
}
