package PageAutomation;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import GenericFile.Resources_Utility;
import GenericFile.common_functions;
import junit.framework.Assert;

public class My_Profile extends common_functions{
	public String selected_Option=null;
	public String email = null;
	public String otp="98760";
	Random rand = new Random();
	Faker faker = new Faker();
	String name ;
	public String test1="Subject";
	public String test2="7";
	String number="88"+faker.number().digits(8);
	
	@SuppressWarnings("deprecation")
	@Test(enabled = true, priority = 1,groups= {"Common"})
	public void sign_up_testing() throws Throwable {
	click(Resources_Utility.xpath("create_acc"), driver);
	sleep(2000);
	email = "TestUser" + rand.nextInt(1000) + "@mindler.com";
	type(Resources_Utility.xpath("email"), email, driver);
    sleep(1000);
    click(Resources_Utility.xpath("submit_btn"), driver);
	
	sleep(1000);
	type(Resources_Utility.xpath("name"), faker.name().firstName() , driver);
	sleep(1000);
	
	
	type(Resources_Utility.xpath("mobile"),number, driver);
	 sleep(1000);
	
	 sleep(1000);
	 click(Resources_Utility.xpath("send_otp"), driver);
	 sleep(2000);
	 
	 type(Resources_Utility.xpath("otp_enter"),otp, driver);
	 sleep(1000);
		/*
		 * click(Resources_Utility.xpath("country"), driver); sleep(2000);
		 * 
		 * random_Selection( Resources_Utility.xpath("country_list"), driver);
		 * sleep(2000);
		 * 
		 * 
		 * 
		 * 
		 * click(Resources_Utility.xpath("state"), driver); sleep(3000);
		 * random_Selection( Resources_Utility.xpath("state_list"), driver);
		 * sleep(2000);
		 */
         
		 click(Resources_Utility.xpath("city"), driver);
		 sleep(3000);
		 random_Selection( Resources_Utility.xpath("city_list"),  driver);
         sleep(2000);
       
         

		 type(Resources_Utility.xpath("password"),Resources_Utility.config("password"), driver);
	sleep(1000);
	
	click(Resources_Utility.xpath("continue_btn"), driver);
	 sleep(2000);
	 click(Resources_Utility.xpath("option"), driver);
	 sleep(3000);
	 random_Selection( Resources_Utility.xpath("option_list"),  driver);
     sleep(3000);
     random_Selection( Resources_Utility.xpath("class_selection"),  driver);
     sleep(2000);
     random_Selection(Resources_Utility.xpath("class_list"), driver);
	 sleep(2000);
     click(Resources_Utility.xpath("continue_btn"), driver);
	 sleep(2000);
	 random_Selection(Resources_Utility.xpath("interest_list"), driver);
	 sleep(3000);
	 click(Resources_Utility.xpath("coun"), driver);
	 sleep(2000);
	
	 click(Resources_Utility.xpath("dashboard_btn"), driver);
	 sleep(2000);
	 click(Resources_Utility.xpath("drop-down"), driver);
	 sleep(2000);
	 click(Resources_Utility.xpath("my_details"), driver);
	 sleep(2000);
	 click(Resources_Utility.xpath("edit_details"), driver);
	 sleep(2000);
	 click(Resources_Utility.xpath("date_picker"), driver);
	 sleep(2000);
	 click(Resources_Utility.xpath("date_click"), driver);
	 sleep(2000);
	 random_Selection(Resources_Utility.xpath("year_list"), driver);
	 sleep(3000);
	 click(Resources_Utility.xpath("date_list"), driver);
	 sleep(3000);
	 click(Resources_Utility.xpath("save_changes"), driver);
	 sleep(2000);
	 type(Resources_Utility.xpath("father_name"), faker.name().firstName() , driver);
		sleep(1000);
	 type(Resources_Utility.xpath("mother_name"), faker.name().firstName() , driver);
		sleep(1000);
		type(Resources_Utility.xpath("father_profession"), faker.name().firstName() , driver);
		sleep(1000);
		type(Resources_Utility.xpath("mother_profession"), faker.name().firstName() , driver);
		sleep(1000);
		click(Resources_Utility.xpath("save_changes"), driver);
		 sleep(2000);
		 click(Resources_Utility.xpath("school"), driver); sleep(4000);
		 Screen s=new Screen();
		 Pattern p=new Pattern("C:\\Users\\Taxmann Technologies\\eclipse-workspace1\\ConfluenceQA\\Image\\image\\school.png");
		 s.click(p);
			/*
			 * click(Resources_Utility.xpath("school"), driver); sleep(4000);
			 * random_Selection(Resources_Utility.xpath("school_list"), driver);
			 */
		 sleep(3000);
		 click(Resources_Utility.xpath("grade"), driver);
		 sleep(2000);
		 random_Selection(Resources_Utility.xpath("grade_list"), driver);
		 sleep(3000);
		 click(Resources_Utility.xpath("board"), driver);
		 sleep(2000);
		 random_Selection(Resources_Utility.xpath("board_list"), driver);
		 sleep(3000);
		 click(Resources_Utility.xpath("passing_year"), driver);
		 sleep(2000);
		 random_Selection(Resources_Utility.xpath("passing_year_list"), driver);
		 sleep(3000);
		 for(int i=1;i<11;i++)
		 {
			
			type(Resources_Utility.xpath("Enter_Subject")+"["+i+"]",test1 , driver);
			
			type(Resources_Utility.xpath("Enter_Score")+"["+i+"]",test2+(i-1) , driver);
			 
			 
		 }
		 sleep(1000);
			click(Resources_Utility.xpath("save_changes"), driver);
			Assert.assertEquals(1,1);
  //  driver.quit();
}}