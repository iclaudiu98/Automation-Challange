package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class AdminRentRoom {
    private static final String URL_ADMIN_PAGE = "https://automationintesting.online/#/admin";
    private WebDriver driver;
    private By username = By.id("username");
    private By password = By.id("password");

    private By loginButton = By.id("doLogin");

    private By roomName = By.id("roomName");

    private By safeCheckbox = By.id("safeCheckbox");
    private By refreshCheckbox = By.id("refreshCheckbox");
    private By tvCheckbox = By.id("tvCheckbox");

    private By roomPrice = By.id("roomPrice");

    private By createRoom = By.id("createRoom");

    private By editButton = By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[1]/div[2]/button");

    private By roomDescription = By.id("description");

    private By roomImage = By.id("image");

    private By updateButton = By.xpath("//*[@id=\"update\"]");

    public AdminRentRoom(WebDriver driver) {
        this.driver = driver;
    }

    public void adminPage() {
        driver.get(URL_ADMIN_PAGE);
    }

    public void setUsername(String userName) {
        driver.findElement(username).sendKeys(userName);
    }

    public void setPassword(String passWord) {
        driver.findElement(password).sendKeys(passWord);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();

    }

    public void selectRoomType(String roomType) {
        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"type\"]")));
        select.selectByVisibleText(roomType);
    }

    public void setRoomName(String setRoomName) {
        driver.findElement(roomName).sendKeys(setRoomName);
    }

    public void setSafeCheckbox() {
        driver.findElement(safeCheckbox).click();
    }

    public void setRefreshCheckbox() {
        driver.findElement(refreshCheckbox).click();
    }

    public void setTvCheckbox() {
        driver.findElement(tvCheckbox).click();
    }

    public void setRoomPrice(String price) {
        driver.findElement(roomPrice).sendKeys(price);
    }

    public void clickCreateRoom() {
        driver.findElement(createRoom).click();
    }

    public void updateRoomName(By element) {
        driver.findElement(element).click();
    }

    public void clickEditRoom() {
        driver.findElement(editButton).click();
    }

    public void setRoomDescription(String description) {
        driver.findElement(roomDescription).sendKeys(description);
    }

    public void setRoomImage(String image) {
        driver.findElement(roomImage).sendKeys(image);
    }

    public void updateRoom() {
        driver.findElement(updateButton).click();
    }


}
