package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.AdminRentRoom;
import pages.ContactUsPage;
import pages.RentRoom;

public class BaseTests {
    private static final String URL_PAGE = "https://automationintesting.online";
    protected RentRoom page;
    protected AdminRentRoom page1;

    protected ContactUsPage page2;
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(URL_PAGE);
        driver.manage().window().maximize();
        page = new RentRoom(driver);
        page1 = new AdminRentRoom(driver);
        page2 = new ContactUsPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
