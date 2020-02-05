package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefhandson {
WebDriver driver;
/*
@Given("TestMeApp logged into machine")
public void testmeapp_logged_into_machine()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_h2a.09.22\\Desktop\\selenium traning\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By .linkText("SignIn")).click();
	}
*/
@When("admin provides {string} and {string}")
public void admin_provides_and(String string, String string2) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_h2a.09.22\\Desktop\\selenium traning\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By .linkText("SignIn")).click();
	driver.findElement(By .name("userName")).sendKeys("admin");
	driver.findElement(By .name("password")).sendKeys("Password456");
	driver.findElement(By .name("Login")).click();
}
@Then("login is success")
public void  login_is_success(io.cucumber.datatable.DataTable dataTable) {
	
}
@When("admin adding new category as sports")
public void admin_adding_new_category_as_sports() {
driver.findElement(By .xpath("//h4[text()='Add Category']")).click();
driver.findElement(By .name("catgName")).sendKeys("Sports");
driver.findElement(By .name("catgDesc")).sendKeys("playing");
driver.findElement(By .linkText("adminHome")).click();

}
}
