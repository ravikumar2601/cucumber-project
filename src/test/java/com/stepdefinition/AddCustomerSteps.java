package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepository.AddCustomerPage;
import com.objectrepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class AddCustomerSteps extends FunctionalLibrary {
	
	
	@Given("user click on add customer")
	public void user_click_on_add_customer() {
		
		HomePage page=new HomePage();
		
		button(page.getAddCustomerButton());
	}
	@When("user is filling all the field")
	public void user_is_filling_all_the_field(DataTable dataTable) {
		List<List<String>> asLists = dataTable.asLists(String.class);
		
		AddCustomerPage page=new AddCustomerPage();
		
		button(page.getDoneButton());
		type(page.getfName(), asLists.get(0).get(0));
		type(page.getlName(), asLists.get(0).get(1));
		type(page.getMail(),  asLists.get(0).get(2));
		type(page.getAddress(),  asLists.get(0).get(3));
		type(page.getPhno(),  asLists.get(0).get(4));
		
		
	}
	
	@When("user is filling all the field.")
	public void user_is_filling_all_the_field2(DataTable dataTable) {
	    List<Map<String, String>> asMaps = dataTable.asMaps(String.class, String.class); 
	    driver.findElement(By.xpath("label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(asMaps.get(0).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(asMaps.get(2).get("lname"));
		driver.findElement(By.id("email")).sendKeys(asMaps.get(1).get("email"));
		driver.findElement(By.name("addr")).sendKeys(asMaps.get(2).get("address"));
		driver.findElement(By.name("telephoneno")).sendKeys(asMaps.get(0).get("phone"));

	    
	}
	@When("user is filling all the fields..")
	public void user_is_filling_all_the_fields1(DataTable dataTable) {
	    Map<String, String> asMap = dataTable.asMap(String.class, String.class);

		driver.findElement(By.xpath("label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(asMap.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(asMap.get("lname"));
		driver.findElement(By.id("email")).sendKeys(asMap.get("email"));
		driver.findElement(By.name("addr")).sendKeys(asMap.get("address"));
		driver.findElement(By.name("telephoneno")).sendKeys(asMap.get("phone"));
	}


	/*@When("user is filling all the fields")
	public void user_is_filling_all_the_fields() {
		
		AddCustomerPage page=new AddCustomerPage();
		
		driver.findElement(By.xpath("label[@for='done']")).click();
	   type(page.getfName(), "karthi");
	    driver.findElement(By.id("lname")).sendKeys("Kumar");
	    driver.findElement(By.id("email")).sendKeys("kumarravi@gmail.com");
	    driver.findElement(By.name("addr")).sendKeys("Salem");
	    driver.findElement(By.name("telephoneno")).sendKeys("1234567890");
	}*/
	@When("user is filling all the fieldssss")
	public void user_is_filling_all_the_fields(DataTable cusDatas) {
		List<String> asList = cusDatas.asList(System.class);

		driver.findElement(By.xpath("label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(asList.get(0));
		driver.findElement(By.id("lname")).sendKeys(asList.get(1));
		driver.findElement(By.id("email")).sendKeys(asList.get(2));
		driver.findElement(By.name("addr")).sendKeys(asList.get(3));
		driver.findElement(By.name("telephoneno")).sendKeys(asList.get(3));

	}


	@When("user click on submit")
	public void user_click_on_submit() {
		AddCustomerPage page=new AddCustomerPage();
		
	button(page.getSubmitButton());
	}

	@Then("user should be displayed customer id is generate")
	public void user_should_be_displayed_customer_id_is_generate() {
		Assert.assertTrue(driver.findElement(By.xpath("(td[@align='center'])[2]")).isDisplayed());
	}


}
