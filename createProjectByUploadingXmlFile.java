package StepDefination;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.*;

public class createProjectByUploadingXmlFile extends CreatingProject {

	@When("Click on Upload xml file")
	public void click_on_upload_xml_file() {
		WebElement uploadbutton=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View"));
		uploadbutton.click();
		WebElement filePathInput = null;
		for (int i = 0; i < 3; i++) {
		    try {
		        filePathInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/androidx.cardview.widget.CardView[2]"));
		        break; // Break out of the loop if element is found
		    } catch (StaleElementReferenceException e) {
		        e.printStackTrace();
		        // Wait for a short duration before retrying
		    }
		}

		// Check if filePathInput is not null before clicking
		if (filePathInput != null) {
		    filePathInput.click();
		    try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@When("Verify the data in all fields")
	public void verify_the_data_in_all_fields() {
		
	}
	@Then("New project created by uploaded xml file")
	public void new_project_created_by_uploaded_xml_file() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
