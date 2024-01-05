package bookroom;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.AdminRentRoom;
import pages.RentRoom;
import resources.test_data.TestData;

public class BookRoomTests extends BaseTests {
    @Test
    public void BookRoom() throws InterruptedException {
        RentRoom rentRoom = page;
        rentRoom.clickBookRoom();
        Thread.sleep(3000);
        rentRoom.setFirstNameField(TestData.firstNameField);
        rentRoom.setLastNameField(TestData.lastNameField);
        rentRoom.setEmailField(TestData.emailAdress);
        rentRoom.setPhoneField(TestData.phoneNumber);
        rentRoom.clickNextButton();
        Thread.sleep(4000);
    }

    @Test
    public void AdminRentRoomTests() throws InterruptedException {
        AdminRentRoom adminRoom = page1;
        adminRoom.adminPage();
        adminRoom.setUsername(TestData.username);
        adminRoom.setPassword(TestData.password);
        adminRoom.clickLogin();
        Thread.sleep(4000);
        adminRoom.setRoomName("555");
        adminRoom.selectRoomType("Double");
        adminRoom.setRefreshCheckbox();
        adminRoom.setSafeCheckbox();
        adminRoom.setTvCheckbox();
        adminRoom.setRoomPrice("300");
        adminRoom.clickCreateRoom();
        Thread.sleep(2000);
        adminRoom.updateRoomName(By.id("roomName555"));
        Thread.sleep(2000);
        adminRoom.clickEditRoom();
        adminRoom.setRoomDescription("Description of the room, test added this description");
        Thread.sleep(2000);
        adminRoom.setRoomImage("https://images.pexels.com/photos/1457842/pexels-photo-1457842.jpeg");
        Thread.sleep(3000);
        adminRoom.updateRoom();

    }
}
