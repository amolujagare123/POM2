package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
    private final WebDriver driver;

    @FindBy(id = "name")
    private WebElement txtFavoriteMovie;

    @FindBy(name = "submit")
    private WebElement btnSubmit;

    @FindBy(linkText = "Dashboard")
    private WebElement lnkDashboard;

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void typeFavoriteMovie(String movie) {
        txtFavoriteMovie.clear();
        txtFavoriteMovie.sendKeys(movie);
    }

    public void clickSubmit() {
        btnSubmit.click();
    }

    public void clickDashboard() {
        lnkDashboard.click();
    }
}
