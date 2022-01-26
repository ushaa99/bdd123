package steps;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class script {
	WebDriver d1;
@Given("Open chrome browser and url of the application")
public void open_chrome_browser_and_url_of_the_application() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rama\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
	d1=new ChromeDriver();
	d1.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	System.out.println("entered URL in chrome browser");
}

@When("Enter {string} , {string} and  click on login button")
public void enter_and_click_on_login_button(String Username, String password) {
    // Write code here that turns the phrase above into concrete actions
	d1.findElement(By.id("email")).sendKeys(Username);
	d1.findElement(By.name("passwd")).sendKeys(password);
	d1.findElement(By.name("SubmitLogin")).click();
    System.out.println("entered id & password");
}

@Then("Success in login")
public void success_in_login() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("loggedin");
	}
@When("search the product and click on the search button")
public void search_the_product_and_click_on_the_search_button() {
    // Write code here that turns the phrase above into concrete actions
	d1.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Dresses");
	d1.findElement(By.name("submit_search")).click();
	System.out.println("entered search keyword dresses");

}


@When("scroll the products and select one among them")
public void scroll_the_products_and_select_one_among_them() {
    // Write code here that turns the phrase above into concrete actions
	d1.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
	

}

@Then("add the product to cart.")
public void add_the_product_to_cart() {
    // Write code here that turns the phrase above into concrete actions
	d1.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")).click();
	System.out.println("added the product to the cart");

}

@Then("take screenshot")
public void take_screenshot() throws IOException, AWTException {
    // Write code here that turns the phrase above into concrete actions
	TakesScreenshot tk1=(TakesScreenshot) d1;
	File source=tk1.getScreenshotAs(OutputType.FILE)
	;
	File destination=new File("C:\\Users\\Rama\\Downloads\\table_files\\screen121.jpg");
	FileHandler.copy(source,destination);


	Robot robot1=new Robot();
	Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rect=new Rectangle(sc_size);
	BufferedImage Source=robot1.createScreenCapture(rect);
	File Destination=new File("C:\\Users\\Rama\\Downloads\\table_files\\screen122.jpg");
	ImageIO.write(Source, "jpg", Destination);
	

	}
	

}


//c5c8132ce7f548f6badc80dc159d7ac7  





/*
@Given("Open chrome browser and url of the application")
public void open_chrome_browser_and_url_of_the_application() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Enter {string} , {string} and click on login button")
public void enter_and_click_on_login_button(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Success in login")
public void success_in_login() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Open chrome browser and url of the application")
public void open_chrome_browser_and_url_of_the_application() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Enter {string} , {string} and click on login button")
public void enter_and_click_on_login_button(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Success in login")
public void success_in_login() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

*/

