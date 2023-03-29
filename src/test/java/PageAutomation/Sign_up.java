package PageAutomation;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import GenericFile.Resources_Utility;
import GenericFile.common_functions;



public class Sign_up extends common_functions{
	public String selected_Option=null;
	public String email = null;
	public String otp="98760";
	Random rand = new Random();
	Faker faker = new Faker();
	String name ;
	@Test(enabled = true, priority = 1,groups= {"Common"})
	public void sign_up_testing() throws Throwable {
	click(Resources_Utility.xpath("create_acc"), driver);
	sleep(2000);
	email = "TestUser" + rand.nextInt(1000) + "@mindler.com";
	type(Resources_Utility.xpath("email"), email, driver);
    sleep(1000);
    click(Resources_Utility.xpath("submit_btn"), driver);
	
	//click(Resources_Utility.xpath("login_btn"), driver);
	sleep(1000);
	type(Resources_Utility.xpath("name"), faker.name().firstName() , driver);
	sleep(1000);
	//type(Resources_Utility.xpath("name"),faker.name().lastName(),driver);
	//sleep(1000);
	type(Resources_Utility.xpath("mobile"),Resources_Utility.config("num"), driver);
	 sleep(1000);
	type(Resources_Utility.xpath("mobile"),faker.number().digits(8), driver);
	 sleep(1000);
	 click(Resources_Utility.xpath("send_otp"), driver);
	 sleep(2000);
	 
	 type(Resources_Utility.xpath("otp_enter"),otp, driver);
	 sleep(1000);
	 click(Resources_Utility.xpath("country"), driver);
	 sleep(2000);
	 
	 random_Selection( Resources_Utility.xpath("country_list"),  driver);
	 sleep(2000);
	
		

		 
		 click(Resources_Utility.xpath("state"), driver);
		 sleep(3000);
		 random_Selection( Resources_Utility.xpath("state_list"),  driver);
         sleep(2000);
       
         
		 type(Resources_Utility.xpath("city"), Resources_Utility.config("city") , driver);
			sleep(2000);
		 type(Resources_Utility.xpath("password"),Resources_Utility.config("password"), driver);
	sleep(1000);
	
	click(Resources_Utility.xpath("continue_btn"), driver);
	 sleep(2000);
	
    driver.quit();
}}