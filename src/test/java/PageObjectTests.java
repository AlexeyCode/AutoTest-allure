// import DriverFactory.DriverFactory;
// import io.qameta.allure.Attachment;
// import io.qameta.allure.Description;
// import org.junit.jupiter.api.*;
// import org.openqa.selenium.OutputType;
// import org.openqa.selenium.TakesScreenshot;
// import pages.WikiLoginPage;
// import pages.WikiMain;
// import DriverFactory.DriverType;
// import org.openqa.selenium.WebDriver;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertTrue;


// public class PageObjectTests {
//     private WebDriver driver;
//     private WikiMain wikiMain;
//     private WikiLoginPage wikiLoginPage;
//     @Attachment
//     public byte[] attachScreenshot(){
//         return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//     }

//     @BeforeEach
//     void setUp(){
//         driver = DriverFactory.getDriver(DriverType.CHROME);
//         driver.get("https://www.wikipedia.org/");
//     }

//     @Test
//     @Description(value = "Проверка работы поиска на Wiki")
//     void searchTest(){
//         wikiMain = new WikiMain(driver);
//         wikiMain.sendText("Selenium");
//         attachScreenshot();
//         assertEquals("Selenium",driver.getTitle().substring(0,8));

//     }

//     @Test
//     @Description(value = "Проверка логина пользователем")
//     void loginTest(){
//         wikiLoginPage = new WikiLoginPage(driver);
//         wikiLoginPage.login("Logintest1","Gthtljp22");
//         attachScreenshot();
//         assertTrue(wikiLoginPage.isLogged("Logintest1"));
//     }

//     @AfterEach
//     void tearDown(){
//         driver.quit();
//     }

//     //    @ParameterizedTest(name = "run #{index} with [{arguments}]")
// //    @ValueSource(strings = {"Hello", "JUnit5"})
// //    void valueNotNull(String word){
// //        assertNotNull(word);
// //    }
// }
