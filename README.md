Tutorials_Ninja_E-commerce

**Description**

This project is a demonstration of automated testing for the Tutorialsninja website using Selenium WebDriver and TestNG framework. The goal of the project is to automate various test scenarios to ensure the functionality, usability, and reliability of the website.

The Tutorialsninja website is an e-commerce platform that offers a variety of products across different categories such as electronics, accessories, and software. The automated tests cover key functionalities of the website, including user authentication, product search, adding products to cart, navigating through product categories, managing wishlist and cart items, and logging out.

The automation test scripts are written in Java programming language, leveraging the Selenium WebDriver library for interacting with web elements on the website. TestNG framework is used for organizing and executing the test cases, providing features such as test parameterization, grouping, and reporting.

By automating these test scenarios, the project aims to achieve the following objectives:

- Ensure the correctness and reliability of critical website functionalities.
- Identify and prevent regressions in the application during development and maintenance.
- Accelerate the testing process by automating repetitive tasks, allowing for faster release cycles.
- Provide a foundation for continuous integration and delivery practices, enabling seamless integration of automated tests into the development pipeline.
## Technical Stack

The project utilizes the following technologies and tools:

1. **Java**: The programming language used for writing the automation test scripts. Java provides robust support for object-oriented programming and is widely used in the automation testing ecosystem.

2. **Selenium WebDriver**: Selenium WebDriver is a powerful tool for automating web browsers. In this project, Selenium WebDriver is used to interact with web elements on the Tutorialsninja website, perform actions, and validate behaviors.

3. **TestNG**: TestNG is a testing framework inspired by JUnit and NUnit but introducing some new functionalities that make it more powerful and easier to use. It is used for organizing and executing test cases in this project. TestNG provides features like test parameterization, grouping, dependency management, and test reporting.

4. **Maven**: Maven is a build automation tool used for managing project dependencies, building the project, and generating reports. Maven simplifies the build process and helps in maintaining project consistency. It is used to manage dependencies and run the automated tests in this project.

5. **Chrome WebDriver**: Chrome WebDriver is a tool provided by Selenium WebDriver specifically for automating tests in the Chrome browser. It acts as a bridge between the Selenium WebDriver scripts and the Chrome browser, enabling automated interactions with web elements.

6. **IDE (Integrated Development Environment)**: An IDE such as IntelliJ IDEA or Eclipse can be used for writing, editing, and debugging the automation test scripts. IDEs provide features like syntax highlighting, code completion, and debugging tools, making the development process more efficient.

By leveraging this technical stack, the project achieves efficient and reliable automation testing of the Tutorialsninja website, ensuring the quality and functionality of the web application.



## Features

- Login functionality testing
- Search functionality testing
- Add to cart functionality testing
- Navigation through different product categories testing
- Logout functionality testing
## Prerequisites
Before running the automated tests, ensure the following prerequisites are met:

1. **Java Development Kit (JDK)**: The project is developed using Java, so ensure JDK is installed on your machine. You can download and install JDK from the [official Oracle website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. **Maven**: Maven is used as the build automation tool and dependency management. Make sure Maven is installed on your system. You can download Maven from the [official Apache Maven website](https://maven.apache.org/download.cgi).

3. **Chrome WebDriver**: Chrome WebDriver is required for automating tests in the Chrome browser. Download the appropriate version of Chrome WebDriver compatible with your Chrome browser version from the [Chrome WebDriver downloads page](https://sites.google.com/a/chromium.org/chromedriver/downloads). After downloading, add the WebDriver executable to your system PATH.

4. **Chrome Browser**: Ensure Google Chrome browser is installed on your machine. The automated tests are designed to run on the Chrome browser.

5. **Internet Connection**: Ensure you have a stable internet connection as the automated tests interact with the Tutorialsninja website.

Once you have installed the prerequisites mentioned above, you are ready to set up and run the automated tests.

## Documentation
### Project Structure

- `src/main/java`: Contains the Java source code for the automation project.
- `src/test/java`: Contains the TestNG test classes.
- `pom.xml`: Maven configuration file containing project dependencies.

### TestNG Test Classes

1. `ProjectNEW2`: Contains the TestNG test methods for various functionalities of the Tutorialsninja website.

### Test Methods

1. `Login`: Tests the login functionality by entering valid credentials.
2. `search`: Tests the search functionality by searching for a product.
3. `List`: Tests adding a product to the cart, managing the wishlist, and cart items.
4. `Show`: Tests navigating through different product categories.
5. `CheckLogOut`: Tests the logout functionality.
6. `Camera`: Placeholder for additional test scenarios related to the Cameras category.

### Test Data

No external test data is used in this project. Test data is hardcoded within the test methods.

### Dependencies

- Selenium WebDriver: Used for browser automation.
- TestNG: Testing framework for organizing and executing tests.
- Chrome WebDriver: Required for automating tests in the Chrome browser.

### Running Tests

1. Ensure JDK, Maven, and Chrome WebDriver are installed.
2. Clone the repository to your local machine.
3. Open the project in your IDE.
4. Resolve dependencies with Maven (`mvn clean install`).
5. Run the tests individually or collectively using TestNG.

### Test Reports

TestNG generates test reports in the `test-output` directory after executing the tests. You can view the reports in HTML format for detailed test results.

### Troubleshooting

If you encounter any issues with running the tests, ensure that the Chrome WebDriver version is compatible with your Chrome browser version. You may need to download the appropriate version of Chrome WebDriver and update the system PATH accordingly.




## Installation

1. Clone the repository to your local machine.
2. Open the project in your preferred IDE.
3. Resolve any dependencies using Maven.
    ## Demo

To demonstrate how to use the Postman collection for testing the Booking API, follow these steps:

1. **Import the Collection**: Download the provided Postman collection (`Booking_API.postman_collection.json`) and import it into Postman.

2. **Set Up Environment**: Configure the necessary environment variables such as `{{fname}}`, `{{lname}}`, `{{b_id}}`, and `{{b_token}}`. Ensure that these variables are correctly populated with appropriate values.

3. **Execute Requests**:
   - Start by running the "Token Generator" request to obtain an authentication token.
   - Use the token to execute other requests like "Create Booking", "Update Booking", and "Delete Booking".
   - Verify the responses and test assertions to ensure that the API behaves as expected.

4. **Review Test Results**: Pay close attention to the test results in Postman. Ensure that all tests pass for each request, indicating that the API endpoints are functioning correctly.

5. **Explore Documentation**: Refer to the API documentation provided in the "Documentation" section for additional details about each endpoint and its expected behavior.

6. **Experiment and Learn**: Feel free to experiment with different scenarios, inputs, and configurations to deepen your understanding of how the Booking API works and how to effectively test it using the Postman collection.

By following these steps, you'll gain hands-on experience in using the Postman collection to interact with the Booking API and perform comprehensive testing.

## Running Tests

### 1. Login Test (`Login` method)
   - Description: This test verifies the login functionality of the Tutorialsninja website.
   
### 2. Search Test (`search` method)
   - Description: This test verifies the search functionality by searching for a product on the website.
   
### 3. Add to Cart Test (`List` method)
   - Description: This test verifies the functionality of adding a product to the cart and managing the wishlist and cart items.
   
### 4. Show Categories Test (`Show` method)
   - Description: This test verifies the functionality of navigating through different product categories on the website.
   
### 5. Logout Test (`CheckLogOut` method)
   - Description: This test verifies the logout functionality of the Tutorialsninja website.
   
### 6. Additional Test (`Camera` method)
   - Description: Placeholder for additional test scenarios related to the Cameras category.

## Deployment

1. Clone the repository to your local machine.
2. Open the project in your preferred IDE.
3. Resolve any dependencies using Maven.
4. Configure Chrome WebDriver and ensure it's added to the system PATH.
5. Run the test scripts individually or collectively using TestNG.


## Contribution

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/new-feature`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to the branch (`git push origin feature/new-feature`).
6. Create a new Pull Request.


## Acknowledgements

 Special thanks to [Tutorialsninja](https://tutorialsninja.com/demo/index.php?route=checkout/cart) for providing the test environment.

## License
This project is licensed under the [MIT License](LICENSE).## Feedback

Your feedback is valuable! If you have any questions, suggestions, or issues, please feel free to open an [issue](https://github.com/Rajeshwari06Nimbalkar/Tutorials_Ninja_E-commerce-/issues) 
or [pull request](https://github.com/Rajeshwari06Nimbalkar/Tutorials_Ninja_E-commerce-/pulls) on GitHub. We appreciate your contributions to improve this project.


## Usage/Examples

1. Open the `ProjectNEW2` class located in the `TestNGdemos` package.
2. Run the tests individually or collectively using TestNG.
3. View the test results in the console or in the testing reports generated by TestNG.


