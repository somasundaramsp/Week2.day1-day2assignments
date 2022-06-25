package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("username"));
		WebElement usernameElement = driver.findElement(By.id("username"));
		usernameElement.sendKeys("DemoSalesManager");

		WebElement ElementPassword = driver.findElement(By.id("password"));
		ElementPassword.sendKeys("crmsfa");

		WebElement ElementloginButton = driver.findElement(By.className("decorativeSubmit"));
		ElementloginButton.click();

		WebElement Elementcrmsfa = driver.findElement(By.linkText("CRM/SFA"));
		Elementcrmsfa.click();

		WebElement LeadsElement = driver.findElement(By.linkText("Leads"));
		LeadsElement.click();

		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();

		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("Somu Technologies");

		WebElement elementfirstname = driver.findElement(By.id("createLeadForm_firstName"));
		elementfirstname.sendKeys("Somasundaram");

		WebElement elementlastname = driver.findElement(By.id("createLeadForm_lastName"));
		elementlastname.sendKeys("Subramanian");

		WebElement elementfirstnamelocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementfirstnamelocal.sendKeys("Somu");

		WebElement elementDepartment = driver.findElement(By.id("createLeadForm_departmentName"));
		elementDepartment.sendKeys("Stickers");

		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("Printing a stickers");

		WebElement elementemail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementemail.sendKeys("somu.natchu@gmail.com");

		WebElement elementStateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		elementStateDropDown.sendKeys("New York");

		WebElement elementCreateButton = driver.findElement(By.name("submitButton"));
		elementCreateButton.click();

		WebElement elementedit = driver.findElement(By.xpath("//*[text()=\"Edit\"]"));
		elementedit.click();

		WebElement elementDescriptionEdit = driver.findElement(By.id("updateLeadForm_description"));
		elementDescriptionEdit.clear();

		WebElement elementImportantNote = driver.findElement(By.id("updateLeadForm_importantNote"));
		elementImportantNote.sendKeys("Printing a data");

		WebElement elementUpdateButton = driver.findElement(By.name("submitButton"));
		elementUpdateButton.click();

		String title = driver.getTitle();
		System.out.println(title);

	}
}
