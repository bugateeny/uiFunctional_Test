package hook_TestRunner;

import base.BaseUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;


public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base)
    {
        this.base = base;
    }

    @Before
    public void initialize() {
//        System.setProperty("webdriver.chrome.driver","C:\\Sele files\\chromedriver.exe");


        String chromeDriverLocation = "src/main/resources/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();

        // FireFox  browser
//        String fireFoxDriverLocation ="src/main/resources/drivers/geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver",fireFoxDriverLocation);
//        base.driver= new FirefoxDriver();

    }

    @After
    public void tearDown() throws Exception {


//        base.driver.quit();
//        takeAScreenShot();
    }

    private void takeAScreenShot() throws Exception {
        TakesScreenshot scrShot = ((TakesScreenshot) base.driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("target/screenshot" + System.currentTimeMillis() + ".png"));
    }
}
