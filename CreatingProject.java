package StepDefination;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatingProject {
public static AndroidDriver driver;
	@Before
	public void setup() throws MalformedURLException {
	DesiredCapabilities cap = new DesiredCapabilities();

	cap.setCapability("deviceName", "a6fuugukwcwseekv");
	cap.setCapability("platformName", "Android");
	cap.setCapability("appPackage", "com.android.chrome");
	cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	driver = new AndroidDriver(url, cap);
	
	System.out.println("Account verification");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement account = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]"));
	account.click();
	WebElement accountverify = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[2]"));
	accountverify.click();
	WebElement gotit = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]"));
	gotit.click();
	System.out.println("Chrom browser lauched successfully");
	}
	@Given("Launch MC web application")
	public void launch_mc_web_application() {
		//Enter the URl 
				WebElement enterURL = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
				enterURL.sendKeys("https://devmcalc1webapp1dev.azurewebsites.net/Home/Index");
				WebElement clickURL = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
				clickURL.click();
				
				System.out.println("Material Calcualtion web application launched successfully");
				
	}

	@When("Click on New project")
	public void click_on_new_project() {
		Actions actions = new Actions(driver);
	     actions.perform();
	     driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
		 + "new UiSelector().textContains(\"Create a New Project\").instance(0))")).click();
	     System.out.println("Clicked on Tops");
	     
	     System.out.println("Successfully opened the create project screen");
	}

	@SuppressWarnings("unlikely-arg-type")
	@When("Enter the data in all fields")
	public void enter_the_data_in_all_fields() {
		 WebElement ProjectName = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText"));
	     ProjectName.sendKeys("Automation");
	     
	    //Page scroll
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     Actions actions = new Actions(driver);
	     actions.perform();
	     driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
		 + "new UiSelector().textContains(\"Type\").instance(0))"));
	     
         //Enter the Description value
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        WebElement description = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.GridView/android.view.View/android.view.View[2]/android.widget.EditText"));
	        description.sendKeys("Test");
	     
	      //Enter the Quantity value
	        WebElement quantity = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.GridView/android.view.View/android.view.View[3]/android.widget.EditText"));
	        quantity.click();
	        ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_1));
	        
	        ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));   	       
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	        //Enter the Width 
	        WebElement Width = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.GridView/android.view.View[1]/android.view.View[4]/android.widget.EditText"));
	        Width.click();
	      ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
	      ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_0));
	      
	      
	      ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));   
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      
	      //Enter the Height
	        WebElement height=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.GridView/android.view.View[1]/android.view.View[5]/android.widget.EditText"));
	        height.click();
	      ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_3));
	      ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_0));
	      
	      ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
	      
	      //Enter the 100s Flush Fin
	      WebElement FlushFin=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.GridView/android.view.View[1]/android.view.View[6]/android.view.View"));
	      FlushFin.click();

          //Selecting YES value	        
	      WebElement FlushFinYes=driver.findElement(AppiumBy.xpath(" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]\r\n"
	      		+ ""));
	      FlushFinYes.click();
	      
	      //Creating ArrayList for Exterior color
	       
	      String[] Extcolor1= {"Black","Canvas","Cocoa Bean","Dark Bronze","Dove Gray","Forest Green","Prairie Grass","Red Rock","Sandtone","Terratone","White","Other"};
	      ArrayList<String> ExtColour2 = new ArrayList<>(Arrays.asList(Extcolor1));
	      System.out.println(ExtColour2);
	      
	      WebElement ExtClrValues=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.GridView/android.view.View[1]/android.view.View[7]/android.view.View"));
	      ExtClrValues.click();
	     
	      //Selecting Exterior color
	      String ExtclrName="Black";
	      
	      if(ExtColour2.contains(ExtclrName)) {
	    	  System.out.println(("The Exterior color found successfully"));
	    	  WebElement Black=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
	    	  Black.click();
	    	  System.out.println("Selected the Black as Exterior color");
	      }else
	      {
	    	  System.out.println(("The Exterior color is not found"));
	    	  WebElement other=driver.findElement(AppiumBy.xpath("	\r\n"
	    	  		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[12]"));
	    	  other.click();
	    	  System.out.println("Selected the other as Exterior color");
	      }
	      
	      // Define the Interior color drop-down options using HashMap
	        HashMap<String, String> IntClrdropdownOptions = new HashMap<>();
	        IntClrdropdownOptions.put("Option 1", "Black");
	        IntClrdropdownOptions.put("Option 2", "Canvas");
	        IntClrdropdownOptions.put("Option 3", "Cocoa Bean");
	        IntClrdropdownOptions.put("Option 4", "Dark Bronze");
	        IntClrdropdownOptions.put("Option 5", "Dove Gray");
	        IntClrdropdownOptions.put("Option 6", "Other");
	        
	        // Define the option to select Interior color 
	        String optionToSelect = "Option 2";

	        // Click on the drop-down to open it
	        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.GridView/android.view.View/android.view.View[8]/android.view.View")).click();

	        // Select the Interior color
	        String optionXpath = IntClrdropdownOptions.get(optionToSelect);
	        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")).click();
	      
	      
	        // If the Flush Fin is set to YES then the Type should be only Window
	        
	        String typeValue = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.GridView/android.view.View[1]/android.view.View[9]/android.view.View")).getText();

	        // Define the expected value
	        String expectedValue = "Window";

	        // Assert whether the field contains the expected value
		    assert typeValue.contains(expectedValue);
		    
		    System.out.println("Type value is set to Window default for the Flush Fin Yes");
		    
		   
		    //Select the Shape
		    String Shapedropdown= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.GridView/android.view.View[1]/android.view.View[10]/android.view.View")).getText();
		    
		    // Define the expected value
	        String expectedShape = "Rectangle";

	        // Assert whether the field contains the expected value
		    assert Shapedropdown.contains(expectedShape); 
		    System.out.println("Rectangle shape is displaying default in Shape dropdown");
		    
		    
		    WebElement Shapes= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.GridView/android.view.View[1]/android.view.View[10]/android.view.View"));
		    List<WebElement> options = Shapes.findElements(By.className("android.view.View"));
			
		    ArrayList<String> FlushFinYesShapes=new ArrayList<>(Arrays.asList("Rectangle","Isosceless Triangle","Right Trianlge","Peak Pentagon","Angled Pentagon","Octagon","Trepezoid","Circle"));

		    // Assert whether the dropdown options match the expected options
	        for (String expectedOption : FlushFinYesShapes) {
				boolean optionFound = false;
	            for (WebElement option : options) {
	                if (option.getText().equals(expectedOption)) {
	                    optionFound = true;
	                    break;
	                }
	            }
	           // assert options.contains(FlushFinYesShapes);
	            System.out.println("Flush Fin Yes shapes are availble");

	        }
		    
		 		    
		    //Validating the shapes based on Flush Fin
		    
			ArrayList<String> FlushFinNoShapes=new ArrayList<>(Arrays.asList("Curve", "Oval"));
		    
			ArrayList<String> FlushFinYesShapes1=new ArrayList<>(Arrays.asList("Rectangle","Isosceless Triangle","Right Trianlge","Peak Pentagon","Angled Pentagon","Octagon","Trepezoid","Circle"));
		    
			 for (String value : FlushFinNoShapes) {
		            if (FlushFinYesShapes1.contains(value)) {
		                System.out.println(value + " is present in FlushFin Yes Shapes.");
		            } else {
		                System.out.println(value + " is not present in in FlushFin Yes Shapes.");
		            }
		        }
			 
			 //select the value from shape drop-down
			 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.GridView/android.view.View[1]/android.view.View[10]/android.view.View")).click();
			 if (FlushFinYesShapes.contains("Circle")) {
	               driver.findElement(By.xpath("	\r\n"
	               		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[8]")).click();
	               System.out.println("Successfully selected the Circle as shape for Window");
			 } else {
	                System.out.println("Circle is not present in in FlushFin Yes Shapes.");
	            }
			 
			 //Checking project name
			 String ProjectName1 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.EditText")).getText();
	         //assert ProjectName1.contains("Automation");
			 
	         WebElement ProjectName11 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
	         ProjectName11.sendKeys("Automation");
			 
            
	}

	@When("Save project and submit project")
	public void save_project_and_submit_project() {
		 //Save the project
        
        WebElement saveproject = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView[1]"));
        saveproject.click();
        
        WebElement OKbutton = driver.findElement(AppiumBy.xpath("	\r\n"
        		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button"));
        OKbutton.click();
    	System.out.println("Project got saved successfully");
        //Delete the second line item
        
        WebElement deleteLineItem = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.GridView/android.view.View[2]/android.view.View/android.widget.TextView"));
        deleteLineItem.click();
        
        
        //Submitting the project
        
       WebElement submitproject = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.TextView[1]"));
       submitproject.click();
    	System.out.println("Submitted the created project");
	}

	@Then("New project created")
	public void new_project_created() {
		String SuccessMsg = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.TextView")).getText();
        assert SuccessMsg.contains("New Project Created");
		
		 WebElement successpopup = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[4]/android.widget.Button"));
		 successpopup.click();
		 
		 //Check the project got created or not
			String projects = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.widget.TextView")).getText();

	        // Name of the project to be created
	        String projectName = "Automation";

	        // Assertion to check if the project is present in the list of projects
	        boolean projectFound = false;
	            
			if (projects.equals(projectName)) {
	                projectFound = true;
	    	        System.out.println("Project created successfully:"+projectFound);
	            }
	        }
	}

