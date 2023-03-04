package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Gmail 
{
	@Given("user open browser with {string} and {string}")
	public void user_open_browser_with_and(String string, String string2)
	{ 
		Object [] input1=new Object[2];
	    input1[0]=string;
	    input1[1]=string2;
		Hashtable<String,Object>output4 =  SeleniumOperations.browserlaunch(input1);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user open browser", output4.get("MESSAGE").toString());
	}

	@Given("user enter url as {string}")
	public void user_enter_url_as(String string) 
	{
		Object [] input2= new Object[2];
	    input2[0]=string;
	    Hashtable<String,Object>output4 =SeleniumOperations.OpenApplication(input2);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user enter URL", output4.get("MESSAGE").toString());
	}

	@When("user enter username")
	public void user_enter_username() 
	{
		Object [] input3= new Object[2];
	    input3[0]="//*[@type='email']";
	    input3[1]="dabeshekhar@gmail.com";
	    Hashtable<String,Object>output4 =SeleniumOperations.SendTextOnUi(input3);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user enter username", output4.get("MESSAGE").toString());
		
	}

	@Then("user click on next button")
	public void user_click_on_next_button() throws InterruptedException
	{
		Object [] input4= new Object[2];
	    input4[0]="(//*[@class='VfPpkd-vQzf8d'])[2]";
	    Hashtable<String,Object>output4 =SeleniumOperations.ClickOnElement(input4);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user click on next button", output4.get("MESSAGE").toString());
	    Thread.sleep(3000);
	}

	@Then("user Enter password")
	public void user_enter_password() throws InterruptedException
	{
		
		Object [] input5= new Object[2];
	    input5[0]="//*[@type='password']";
	    input5[1]="Shekhar@123";
	    Thread.sleep(5000);
	    Hashtable<String,Object>output4 =SeleniumOperations.SendTextPass(input5);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user Enter password", output4.get("MESSAGE").toString());
		
	}
	@Then("user click on next button after password")
	public void user_click_on_next_button_after_password() 
	{
		Object [] input6= new Object[2];
	    input6[0]="//*[text()='Next']";
	    Hashtable<String,Object>output4 =SeleniumOperations.ClickOnElement(input6);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user click on next button after password", output4.get("MESSAGE").toString());
	    
	}

	@Then("user click on compose button")
	public void user_click_on_compose_button() throws InterruptedException
	{
		Object [] input7= new Object[2];
	    input7[0]="(//*[@role='button'])[13]";
	    Thread.sleep(5000);
	    Hashtable<String,Object>output4 =SeleniumOperations.ClickOnElement(input7);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user click on compose button", output4.get("MESSAGE").toString());
		 Thread.sleep(3000);
	}

	@Then("user enter id of sender")
	public void user_enter_id_of_sender() throws InterruptedException
	{
		Object [] input8= new Object[2];
	    input8[0]="(//*[@type='text'])[4]";
	    input8[1]="dabeshekhar@gmail.com";
	   Thread.sleep(3000);
	    Hashtable<String,Object>output4 =SeleniumOperations.SendTextOnUi(input8);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user enter id of sender", output4.get("MESSAGE").toString());
	}
     
	@Then("user enter subject as Test mail")
	public void user_enter_subject_as_test_mail() throws InterruptedException 
	{
		
		Object [] input9= new Object[2];
	    input9[0]="//*[@name='subjectbox']";
	    input9[1]="Test Mail";
	    Thread.sleep(5000);
	    Hashtable<String,Object>output4 =SeleniumOperations.SendTextOnUi1(input9);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user enter subject as Test mail", output4.get("MESSAGE").toString());
		
	}

	@Then("user write mail as Test mail body")
	public void user_write_mail_as_test_mail_body() throws InterruptedException
	{
		Object [] input10= new Object[2];
	    input10[0]="//*[@class='Am Al editable LW-avf tS-tW']";
	    input10[1]="Test email Body";
	    Thread.sleep(5000);
	    Hashtable<String,Object>output4 =SeleniumOperations.SendTextOnUi(input10);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user write mail as Test mail body", output4.get("MESSAGE").toString());
		Thread.sleep(3000);
	}
     
	@Then("user click on more option")
	public void user_click_on_more_option() throws InterruptedException
	{
		Object [] input11= new Object[2];
	    input11[0]="(//*[@class='J-J5-Ji J-JN-M-I-JG'])[5]";
	    Thread.sleep(5000);
	    Hashtable<String,Object>output4 =SeleniumOperations.ClickOnElement(input11);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user click on more option", output4.get("MESSAGE").toString());
	   
	}

	@Then("user select Lable option")
	public void user_select_lable_option() throws InterruptedException 
	{
		Object [] input12= new Object[2];
	    input12[0]="(//*[@class='J-N-Jz'])[9]";
	    Thread.sleep(5000);
	    Hashtable<String,Object>output4 =SeleniumOperations.ClickOnElement(input12);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user select Lable option", output4.get("MESSAGE").toString());
	}

	@Then("user select Social option")
	public void user_select_social_option() throws InterruptedException 
	{
		Object [] input13= new Object[2];
	    input13[0]="(//*[@class='J-LC-Jz'])[1]";
	    Thread.sleep(5000);
	    Hashtable<String,Object>output4 =SeleniumOperations.ClickOnElement(input13);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user select Social option", output4.get("MESSAGE").toString());
	    
	}

	@Then("user click on send button")
	public void user_click_on_send_button() throws InterruptedException 
	{
		Object [] input14= new Object[2];
	    input14[0]="//*[text()='Send']";
	    Thread.sleep(5000);
	    Hashtable<String,Object>output4 =SeleniumOperations.ClickOnElement(input14);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user click on send button", output4.get("MESSAGE").toString());
	}


	@Then("user verify the mail by clicking on Social option")
	public void user_verify_the_mail_by_clicking_on_social_option() throws InterruptedException 
	{
		Object [] input16= new Object[2];
	    input16[0]="(//*[text()='Social'])[1]";
	    Thread.sleep(5000);
	    Hashtable<String,Object>output4 =SeleniumOperations.ClickOnElement(input16);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user verify the mail by clicking on Social option", output4.get("MESSAGE").toString());
	}
	@Then("user mark Mail as star")
	public void user_mark_mail_as_star() throws InterruptedException
	{
		Object [] input15= new Object[2];
	    input15[0]="(//*[@class='aXw T-KT'])[1]";
	    Thread.sleep(5000);
	    Hashtable<String,Object>output4 =SeleniumOperations.ClickOnElement(input15);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user mark Mail as star", output4.get("MESSAGE").toString());
	}
	
	@Then("user open the mail successfully")
	public void user_open_the_mail_successfully() throws InterruptedException
	{
		Object [] input17= new Object[2];
	    input17[0]="(//*[@class='zA yO'])[1]";
	    Thread.sleep(5000);
	    Hashtable<String,Object>output4 =SeleniumOperations.ClickOnElement(input17);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user open the mail successfully", output4.get("MESSAGE").toString());
	}
	@Then("Application shows mail send successfully")
	public void application_shows_mail_send_successfully() throws InterruptedException 
	{
		Object [] input18= new Object[2];
	    input18[0]="(//*[text()='Test email Body'])[13]";
	    input18[1]="Test email Body";
	    Thread.sleep(5000);
	    Hashtable<String,Object>output4 =SeleniumOperations.ValidationbyGetText(input18);  
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "Application shows mail send successfully", output4.get("MESSAGE").toString());
	}

    
	

}
