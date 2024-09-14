import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Searching {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        By close = AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]\n");
        By search =By.id("com.booking:id/facet_search_box_cta");
        By destination = By.id("com.booking:id/facet_search_box_basic_field_label");
        By write = By.id("com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content");
        By city = By.id("com.booking:id/view_disambiguation_destination_subtitle");
        By btnsearch = By.id("com.booking:id/facet_date_picker_confirm");
        By secondoption = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup");
        By btnselect = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"com.booking:id/property_availability_cta_facetframe\"]/android.view.ViewGroup\n");
        By btnselect2 = By.id("com.booking:id/rooms_item_select_text_view");
        Thread.sleep(3000);
        By btnreserve = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.booking:id/main_action\"]");
        By firstname = By.id("com.booking:id/bstage1_contact_firstname_value");
        By lastname = By.id("com.booking:id/bstage1_contact_lastname_value");




        driver.findElement(close).click();
        driver.findElement(destination).click();
        driver.findElement(write).click();
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.C));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.U));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.S));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.C));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.O));
        driver.findElement(city).click();

        driver.findElement(btnsearch).click();

        driver.findElement(search).click();

        driver.findElement(secondoption).click();

        driver.findElement(btnselect).click();

        driver.findElement(btnselect2).click();

        driver.findElement(btnreserve).click();

        //String elementHierarchy = driver.getPageSource();
        //Thread.sleep(3000);
        //System.out.println(elementHierarchy);
        Thread.sleep(3000);
        driver.findElement(firstname).click();
        Thread.sleep(3000);
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.J));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.O));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.S));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.E));
        driver.findElement(lastname).click();
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.H));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.U));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.R));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.T));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.A));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.D));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.O));
        Thread.sleep(3000);
        WebElement views = driver.findElement(By.id("com.booking:id/bstage1_contact_email_value"));
        views.click();
        ((AndroidDriver) driver).isKeyboardShown();
        views.sendKeys("test@example.com");
    }

}
