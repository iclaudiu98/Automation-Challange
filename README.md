# Automation Testing Tasks

This repository contains automated test scripts for the website [automationintesting.online](https://automationintesting.online/). The tasks are designed to cover various scenarios and functionalities of the website.

## Task Descriptions:

### Task 1: Room Reservation
Visit the website [automationintesting.online](https://automationintesting.online/) and reserve a room for the upcoming month. Ensure that the booking period starts on the first Monday of the month and lasts for four consecutive days. If any of those days are unavailable, the booking period will be postponed to the following month. Verify the successful creation of the reservation.

### Task 2: Admin Portal Interaction
Log in to the admin portal at [https://automationintesting.online/#/admin/](https://automationintesting.online/#/admin/) using the credentials (admin / password). Add a double room to the system with amenities such as refreshments, a TV, and a safe. Update both the room's description and image after adding it to the system.

### Task 3: Contact Us Form and Admin Panel
1. Open a browser and navigate to [https://automationintesting.online/](https://automationintesting.online/).
2. Complete the Contact Us form.
3. Log into the admin panel found at Restful-booker-platform demo.
4. Access the created message in Restful-booker-platform demo.
5. Assert that the contents of the message match the details filled in the Contact Us form.

### Task 4: Screenshot and Test Report
1. Open a browser and navigate to [https://automationintesting.online/](https://automationintesting.online/).
2. Take a screenshot of the Map section on the homepage.
3. Create a test report.
4. Confirm in the test report that the screenshot is correct.
5. Rerun the test to confirm that it now passes.

## Prerequisites:

Before running the tests, ensure you have the following prerequisites installed and set up:

1. **Clone Repository:**
   - Clone this repository to your local machine:
     ```bash
     git clone https://github.com/your-username/automation-testing-tasks.git
     ```

2. **IntelliJ IDEA:**
   - Install [IntelliJ IDEA](https://www.jetbrains.com/idea/download/).

3. **Java:**
   - Ensure you have the latest version of Java JDK installed.
   - Go to the official Oracle JDK download page at Oracle JDK Downloads: https://www.oracle.com/java/technologies/downloads/


4. **Selenium and Dependencies:**
   - Make sure you have Selenium installed with the dependencies specified in the `pom.xml` file. If not, resolve dependencies using Maven:
     ```bash
     mvn clean install
     ```

## Running the Tests:
1. Execute each test script for the corresponding task.

## Reporting Issues:
If you encounter any issues or have suggestions, please contact iacobclaudiu1998@gmail.com.

Happy Testing!
