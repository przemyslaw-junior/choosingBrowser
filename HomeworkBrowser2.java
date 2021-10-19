import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HomeworkBrowser2 {
    @Test
    public void openGooglePeageTest() {

        WebDriver driver = getDriver("firefox");
    }

    public  WebDriver getDriver (String browser) {

        if (browser == "chrome") {
            String pathChrome = "C:\\Users\\Laptop\\Documents\\chromedriver_win32\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", pathChrome);
            WebDriver driversChrome = new ChromeDriver();
            driversChrome.get("https://www.google.com/");
        } else if (browser == "firefox") {
            String pathFirefox = "C:\\Users\\Laptop\\Documents\\geckodriver-v0.30.0-win64\\geckodriver.exe";
            System.setProperty("webdriver.gecko.driver", pathFirefox);
            WebDriver driversFirefox = new FirefoxDriver();
            driversFirefox.get("https://www.google.com/");
        } else {
            throw new InvalidArgumentException("Invaled browser name");
        }
        return null;
    }
}
