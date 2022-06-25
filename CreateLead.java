package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] arg) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("username"));
		WebElement usernameElement = driver.findElement(By.id("username"));
		usernameElement.sendKeys("DemosalesManager");

		driver.findElement(By.name("PASSWORD"));
		WebElement PasswordElement = driver.findElement(By.name("PASSWORD"));
		PasswordElement.sendKeys("crmsfa");

		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();

		WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaElement.click();

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

		String title = driver.getTitle();
		System.out.println(title);

	}

}