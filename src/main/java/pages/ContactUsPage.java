package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ContactUsPage {
    private WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final String URL_CONTACT_US_PAGE = "https://automationintesting.online/#/admin/messages";

    private By fromField = By.className("col-10");

    public void contacUsPagelink() {
        driver.get(URL_CONTACT_US_PAGE);
    }

    public List<String> getNameDetailsContactUs(){
           List<WebElement> getRowDetailElement = driver.findElements(By.cssSelector(".col-sm-2"));
           List<String> messages = new ArrayList<>();
           for (WebElement element : getRowDetailElement){
                messages.add(element.getText());
           }
           messages.remove(0);
           System.out.println(messages);
           return messages;
    }

    public List<String> getSubjectDetailsContactUs(){
        List<WebElement> getRowDetailElement = driver.findElements(By.cssSelector(".col-sm-9"));
        List<String> messages = new ArrayList<>();
        for (WebElement element : getRowDetailElement){
            messages.add(element.getText());
        }
        messages.remove(0);
        System.out.println(messages);
        return messages;
    }








}
