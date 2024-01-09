package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RentRoom {
    private WebDriver driver;
    private By bookThisRoomButton = By.className("openBooking");
    private By bookRoomConfirmButton = By.xpath("/html/body/div/div[2]/div/div[4]/div/div[2]/div[3]/button[2]");
    private By nextButton = By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div[2]/div[2]/div/div[1]/span[1]/button[3]");
    private By firstNameField = By.name("firstname");
    private By lastNameField = By.name("lastname");
    private By emailField = By.name("email");
    private By phoneField = By.name("phone");

    private By nameContactUs = By.id("name");
    private By emailContactUs = By.id("email");
    private By phoneContactUs = By.id("phone");
    private By subjectContactUs = By.id("subject");

    private By messageContactUs = By.id("description");

    private By submitContactUs = By.id("submitContact");


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

    public String addNameContactUs(String name){
        driver.findElement(nameContactUs).sendKeys(name);
        return name;
    }

    public String addPhoneContactUs(String phone){
        driver.findElement(phoneContactUs).sendKeys(phone);
        return phone;
    }

    public String addSubjectContactUs(String subject){
        driver.findElement(subjectContactUs).sendKeys(subject);
        return subject;
    }

    public String addEmailContactUs(String email){
        driver.findElement(emailContactUs).sendKeys(email);
        return email;
    }

    public String addMesssageContactUs(String message){
        driver.findElement(messageContactUs).sendKeys(message);
        return message;
    }

    public void submitContactUsMessage(){
        driver.findElement(submitContactUs).click();
    }

    public void selectDays(){
        WebElement startDate = driver.findElement(By.xpath("//button[contains(text(),'05')]"));
        WebElement endDate = driver.findElement(By.xpath("//button[contains(text(),'09')]"));
        Actions actions = new Actions(driver);
        startDate.getLocation();
        endDate.getLocation();
        actions.dragAndDrop(startDate,endDate);

    }

}
