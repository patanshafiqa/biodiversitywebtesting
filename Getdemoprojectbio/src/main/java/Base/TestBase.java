package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

	//private static final long DEFAULT_TIMEOUT = ;
	public static WebDriver driver;
	public static Properties prop;
	
	@BeforeMethod
	public void selectBrowser(String browser) throws IOException {
		
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
			driver=new ChromeDriver();
			readconfig();
			launchApp();
		}
		else if(browsername.equals("firefox"))
		    {
				System.setProperty("webdriver.gecko.driver", "");
				
			}
	}
	
	public void readconfig() throws IOException
	{
		prop=new Properties();
		FileInputStream fi = new FileInputStream(System.getProperty("C:\\Users\\patan\\eclipse-workspace\\Orangehrm\\Config"));
			prop.load(fi);
			System.out.println(prop.getProperty("username"));
			
	
			// TODO Auto-generated catch block
		
	}
/*
	public static void propertyFileLoader() throws IOException {
		prop = new Properties();

		File file = new File(System.getProperty("user.dir")+"\\Config\\config.properties");

		FileReader fr = new FileReader(file);
		prop.load(fr);

	}


	public static String propertyFileReader(String Data) throws IOException {
		propertyFileLoader();
		String data = prop.getProperty(Data);
		return data;
	}
*/
	@BeforeClass
	public void launchApp() throws IOException {

		String s=prop.getProperty("BaseURL");
		driver.get(s);
	}

	@AfterClass
    public void teardown()
    {
    	//driver.close();
    }
}

