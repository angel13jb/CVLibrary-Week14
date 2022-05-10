package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[contains(text(),'Accept All')]")
    WebElement cookiesAcceptField;

    @FindBy(xpath ="//input[@id='keywords']" )
    WebElement jobTitleBox;
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationBox;

    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @FindBy(xpath ="//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionLink;

    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salarymin;

    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobButton;

    public  void hanldingIframe(){
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(cookiesAcceptField);
        driver.switchTo().defaultContent();
    }

    public void enterJobTitle(String jobTitle){
        sendTextToElement(jobTitleBox,jobTitle);
    }
    public void enterLocation(String location){
        sendTextToElement(locationBox,location);
    }
    public void selectDistance(String distance){
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionLink);
    }
    public void enterMinSalary(String minSalary){
        sendTextToElement(salarymin,minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String sType){
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);

    }
    public void selectJobType(String jobType){
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
    }
    public void clickOnFindjobsButton(){
        clickOnElement(findJobButton);
    }

}
