package PageAutomation;

import org.testng.annotations.Test;

import GenericFile.Resources_Utility;
import GenericFile.common_functions;

public class Assessment extends common_functions {
	
	@Test(enabled = true, priority = 1,groups= {"Common"})
	public void assessment_stream() throws Throwable{
	
	type(Resources_Utility.xpath("login_id"), Resources_Utility.config("email"), driver);
    sleep(1000);
    type(Resources_Utility.xpath("password_login"), Resources_Utility.config("password"), driver);
    sleep(1000);
    click(Resources_Utility.xpath("continue_btn"), driver);
    sleep(2000);
    click(Resources_Utility.xpath("All_services"), driver);
    sleep(2000);
    click(Resources_Utility.xpath("assessment"), driver);
    sleep(2000);

}}
