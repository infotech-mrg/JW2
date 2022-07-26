import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ggl {
    @Test
    public void testName0() {
        System.setProperty("webdriver.gecko.driver",
                "src/test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com/");
    }

    @Test
    public void testName1() {
        System.setProperty("webdriver.gecko.driver","C:\\Program Files\\gecko\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com/");
    }

    @Test
    public void testName2() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
    }

    @Test
    public void testName3() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
    }


    @Test
    public void testName4() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String FullXPath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
        String nameLocatorElValue = "q";

        driver.get("https://www.google.com/");
        WebElement textInput = driver.findElement(By.name(nameLocatorElValue));
        textInput.sendKeys("QA");
        textInput.submit();
        WebElement elementStatistics = driver.findElement(By.id("result-stats"));
        String textFromStatistics = elementStatistics.getText();
        String[] sStrIntoArrOfElements = textFromStatistics.split(" ");
        String numOfResInArr = sStrIntoArrOfElements[1];
        numOfResInArr.replace(","," ");
        int StrIntoNum = Integer.parseInt(numOfResInArr);
        Assert.assertTrue(StrIntoNum > 10000000);


    }
}