import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods 
{
	public static WebDriver driver = null;
	public static String string = null;
	
	public static void main(String[] args) throws InterruptedException
	{
		enterURL();
		deleteCookies();
		maximizeWindow();
		getTheTitle();
		getCurrentURL();
		getPageSource();
		getWindowHandle();
		closeWindow();	
	}

	public static void enterURL()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");	
	}
	
	public static void deleteCookies()
	{
		driver.manage().deleteAllCookies();
	}
	
	public static void maximizeWindow() throws InterruptedException
	{
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public static void getTheTitle()
	{
		string = driver.getTitle();
		System.out.println(string);
	}
	
	public static void getCurrentURL()
	{
		string = driver.getCurrentUrl();
		System.out.println(string);
	}
	
	public static void getPageSource()
	{
		string = driver.getPageSource();
		//System.out.println(string);
	}
	
	public static void getWindowHandle()
	{
		string = driver.getWindowHandle();
		System.out.println(string);
	}
	
	public static void closeWindow()
	{
		driver.close();
	}
	
}