package bookroom;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminRentRoom;
import pages.ContactUsPage;
import pages.RentRoom;
import resources.test_data.TestData;

public class BookRoomTests extends BaseTests {
    @Test
    public void BookRoom() throws InterruptedException {
        RentRoom rentRoom = page;
        rentRoom.clickBookRoom();
        rentRoom.clickNextButton();
        Thread.sleep(3000);
        rentRoom.selectDays();
        Thread.sleep(1000000);
        rentRoom.setFirstNameField(TestData.firstNameField);
        rentRoom.setLastNameField(TestData.lastNameField);
        rentRoom.setEmailField(TestData.emailAdress);
        rentRoom.setPhoneField(TestData.phoneNumber);
        Thread.sleep(4000);
    }

    @Test
    /*Task 2: Admin Portal Interaction */
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

    @Test
    /* Task 3: Contact Us Form and Admin Panel*/
    public void verifyContactUsMessage() throws InterruptedException{
        RentRoom rentRoom = page;
        String expectedName =  rentRoom.addNameContactUs(TestData.NameContactUs);
        rentRoom.addEmailContactUs("iacobclaudiu1998@gmail.com");
        rentRoom.addMesssageContactUs("This test is created in order to verify if a contact us form is received by the support team");
        String expectedSubject = rentRoom.addSubjectContactUs(TestData.SubjectContactUs);
        rentRoom.addPhoneContactUs("+40723715100");
        rentRoom.submitContactUsMessage();
        Thread.sleep(3000);
        AdminRentRoom adminRoom = page1;
        adminRoom.adminPage();
        adminRoom.setUsername(TestData.username);
        adminRoom.setPassword(TestData.password);
        adminRoom.clickLogin();
        ContactUsPage contactUsPage = page2;
        contactUsPage.contacUsPagelink();
        Thread.sleep(4000);
        Assert.assertTrue(contactUsPage.getNameDetailsContactUs().contains(expectedName),
                "Expected name: " + expectedName + " not found in the list.");
        Assert.assertTrue(contactUsPage.getSubjectDetailsContactUs().contains(expectedSubject),
                "Expected subject: " + expectedSubject + " not found in the list.");
        Thread.sleep(10);
    }

    @Test
     /* Task 4 Open a browser and navigate to https://automationintesting.online/ Take a screenshot of the Map section of the homepage and create a test report
    Confirm in the test report that the screenshot is correct
    Rerun to the test to confirm it now passes. */
    public void verifyScreenshot() throws InterruptedException{

    }


}
