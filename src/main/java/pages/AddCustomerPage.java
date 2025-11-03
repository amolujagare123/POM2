package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
    private final WebDriver driver;

    @FindBy(name = "name")
    private WebElement txtName;

    @FindBy(name = "contact1")
    private WebElement txtContact1;

    @FindBy(name = "contact2")
    private WebElement txtContact2;

    @FindBy(name = "address")
    private WebElement txtAddress;

    @FindBy(name = "Submit")
    private WebElement btnAdd;

    public AddCustomerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void typeName(String name) {
        txtName.clear();
        txtName.sendKeys(name);
    }

    public void typeContact1(String c1) {
        txtContact1.clear();
        txtContact1.sendKeys(c1);
    }

    public void typeContact2(String c2) {
        txtContact2.clear();
        txtContact2.sendKeys(c2);
    }

    public void typeAddress(String addr) {
        txtAddress.clear();
        txtAddress.sendKeys(addr);
    }

    public void clickAdd() {
        btnAdd.click();
    }

    public void typeAddress2(String addr) {
        txtAddress.clear();
        txtAddress.sendKeys(addr);
    }
}
