// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class EbebekSepetTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void ebebekSepet() {
    driver.get("https://www.e-bebek.com/");
    driver.manage().window().setSize(new Dimension(1051, 846));
    js.executeScript("window.scrollTo(0,38.400001525878906)");
    {
      WebElement element = driver.findElement(By.id("txtSearchBox"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("searchContent"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".search-wrapper")).click();
    driver.findElement(By.id("txtSearchBox")).sendKeys("biberon");
    driver.findElement(By.id("txtSearchBox")).sendKeys(Keys.ENTER);
    js.executeScript("window.scrollTo(0,244)");
    driver.findElement(By.id("addToCartBtn")).click();
    driver.findElement(By.id("btnShowCart")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".col-6:nth-child(3) .product-item-anchor .product-item-content"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    js.executeScript("window.scrollTo(0,214.39999389648438)");
    js.executeScript("window.scrollTo(0,256)");
    driver.findElement(By.cssSelector(".cx-item-list-row:nth-child(1) .dec-product")).click();
    driver.findElement(By.cssSelector(".cx-item-list-row:nth-child(1) .dec-product")).click();
    driver.findElement(By.id("btnGoToShippingAddress")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-add-fav"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    js.executeScript("window.scrollTo(0,401.6000061035156)");
  }
}
