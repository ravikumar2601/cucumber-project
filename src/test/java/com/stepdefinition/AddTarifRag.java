package com.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddTarifRag {
	
	/*@Given("user launch telecom page")
	public void user_launch_telecom_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAVI KUMAR\\eclipse-workspace\\AddCustomerOneList\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize(); 
	}*/

	@Given("user clicking on add tariff plan")
	public void user_clicking_on_add_tariff_plan() {
		Hook.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}
//value passing through sendkeys
	@When("user is filling all the fields")
	public void user_is_filling_all_the_fields() {
		Hook.driver.findElement(By.id("rental1")).sendKeys("250");
		Hook.driver.findElement(By.id("local_minutes")).sendKeys("1500");
		Hook.driver.findElement(By.id("inter_minutes")).sendKeys("60");
		Hook.driver.findElement(By.id("sms_pack")).sendKeys("200");
		Hook.driver.findElement(By.id("minutes_charges")).sendKeys("1");
		Hook.driver.findElement(By.id("inter_charges")).sendKeys("5");
		Hook.driver.findElement(By.id("sms_charges")).sendKeys("3"); 
	}
//value passing through one dimensional list
	@When("user is filling all the fields one dimension list")
	public void user_is_filling_all_the_fields_one_dimension_list(DataTable data) {
		List<String> l=data.asList(String.class);
		Hook.driver.findElement(By.id("rental1")).sendKeys(l.get(0));
		Hook.driver.findElement(By.id("local_minutes")).sendKeys(l.get(1));
		Hook.driver.findElement(By.id("inter_minutes")).sendKeys(l.get(2));
		Hook.driver.findElement(By.id("sms_pack")).sendKeys(l.get(3));
		Hook.driver.findElement(By.id("minutes_charges")).sendKeys(l.get(4));
		Hook.driver.findElement(By.id("inter_charges")).sendKeys(l.get(5));
		Hook.driver.findElement(By.id("sms_charges")).sendKeys(l.get(6)); 
	}

	@When("user is filling all fields {string},{string},{string},{string},{string},{string},{string}")
	public void user_is_filling_all_fields(String rent, String min, String intermin, String sms, String charge, String intercharge, String smscharge) {
		Hook.driver.findElement(By.id("rental1")).sendKeys(rent);
		Hook.driver.findElement(By.id("local_minutes")).sendKeys(min);
		Hook.driver.findElement(By.id("inter_minutes")).sendKeys(intermin);
		Hook.driver.findElement(By.id("sms_pack")).sendKeys(sms);
		Hook.driver.findElement(By.id("minutes_charges")).sendKeys(charge);
		Hook.driver.findElement(By.id("inter_charges")).sendKeys(intercharge);
		Hook.driver.findElement(By.id("sms_charges")).sendKeys(smscharge); 
	}

	@When("user clicking on submit")
	public void user_clicking_on_submit() {
		Hook.driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("user should get display of congratulation you add tariff plan")
	public void user_should_get_display_of_congratulation_you_add_tariff_plan() {
		Assert.assertTrue(Hook.driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}

	@Then("user should displayed of home button")
	public void user_should_displayed_of_home_button() {
		Assert.assertTrue(Hook.driver.findElement(By.xpath("//a[@class='button']")).isEnabled());
	}
}
