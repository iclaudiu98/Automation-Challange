package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RentRoom {
    private WebDriver driver;
    private By bookThisRoomButton = By.className("openBooking");
    private By bookRoomConfirmButton = By.xpath("/html/body/div/div[2]/div/div[4]/div/div[2]/div[3]/button[2]");
    private By nextButton = By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div[2]/div[2]/div/div[1]/span[1]/button[3]");
    private By firstNameField = By.name("firstname");
    private By lastNameField = By.name("lastname");
    private By emailField = By.name("email");
    private By phoneField = By.name("phone");

    public RentRoom(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBookRoom() {
        driver.findElement(bookThisRoomButton).click();
    }

    public void setFirstNameField(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastNameField(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setEmailField(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPhoneField(String phone) {
        driver.findElement(phoneField).sendKeys(phone);

    }

    public void clickConfirmBookRoom() {
        driver.findElement(bookRoomConfirmButton).click();
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

}
