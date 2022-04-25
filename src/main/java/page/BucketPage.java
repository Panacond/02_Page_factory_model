package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BucketPage extends BasePage{

    @FindBy(css = "div[class$='sum-price']>span")
    private WebElement getPrice;

    public BucketPage(WebDriver driver){super(driver);}

    public Integer getStringPrice() {
        try {
            waitVisibilityOfElement(5, getPrice);
            return Integer.parseInt(getPrice.getText());
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            return 0;
        }
    }
}
