package cn.edu.sdut.softlab.training.page;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 首页测试.
 *
 * @author subaochen
 */
public class IndexPageIT {

  private WebDriver driver;
  // 参见pom.xml文件中jetty的端口设定
  String baseUrl = "http://localhost:18080/training/";

  @Before
  public void setup() throws Exception {
    driver = new HtmlUnitDriver(true);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }

  @Test
  public void testIndexPage() throws Exception {
    driver.get(baseUrl + "/");
    (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
      @Override
      public Boolean apply(WebDriver driver) {
        return driver.getTitle().contains("SpringMVC");
      }
    });

    // 首页必须包含两个链接
  }

}
