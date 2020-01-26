package keywordLibrary;

		import java.lang.reflect.Method;
		import java.util.concurrent.TimeUnit;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.ie.InternetExplorerDriver;
        import org.openqa.selenium.support.ui.Select;

		public class KeywordLib {
			static WebDriver driver;
			public static void controller(String methodName, String arg1, String arg2, 
					String arg3) throws NoSuchMethodException, Exception {
				Method method = KeywordLib.class.getDeclaredMethod(methodName, 
						String.class, String.class, String.class);
				method.invoke(KeywordLib.class, arg1, arg2, arg3);
			}
			public static void launchBrowser(String arg1, String arg2, String arg3) 
					throws Exception {
				if(arg1.equals("chrome")) {
					System.setProperty("webdriver.chrome.driver","E:\\selenium project\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
				} else if(arg1.equals("firefox")) {
					System.setProperty("webdriver.gecko.driver", 
							"E:\\\\geckodriver.exe");
					driver = new FirefoxDriver();
					}
				else if (arg1.equals("ie")) {
					System.setProperty("webdriver.ie.driver", 
							"E:\\\\IEServerDriver.exe");
					driver = new InternetExplorerDriver();
				} 
				else {
					throw new Exception("Invalid browser name");
				}
				driver.get(arg2);
				}
			public static void enterText(String arg1, String arg2, String arg3) {
				if (arg1.equals("name")){
					driver.findElement(By.name(arg2)).sendKeys(arg3);
				}
				else if(arg1.equals("id")) {
					driver.findElement(By.id(arg2)).sendKeys(arg3);
				}
				else if(arg1.equals("xpath")) {
					driver.findElement(By.xpath(arg2)).sendKeys(arg3);
				}		
			}
			public static void click(String arg1, String arg2, String arg3) {
				if(arg1.equals("name")) {
					driver.findElement(By.name(arg2)).click();
				}
				else if(arg1.equals("id")) {
					driver.findElement(By.id(arg2)).click();
				}
				else if(arg1.equals("xpath")) {
					driver.findElement(By.xpath(arg2)).click();
				}	
			}
			public static void radioButton(String arg1, String arg2, String arg3)
			{
				if (arg1.equals("name")) {
					driver.findElement(By.name(arg2)).click();
					}
				else if (arg1.equals("id")) {
					driver.findElement(By.id(arg2)).click();
				}
					else if(arg1.equals("xpath")) {
						driver.findElement(By.xpath(arg2)).click();
				}
			}
			public static void selectDropDown(String arg1, String arg2, String arg3) {
				if (arg1.equals("name")){
					Select obj = new Select(driver.findElement(By.name(arg2)));
					obj.selectByVisibleText(arg3);
				}
				else if(arg1.equals("id")) {
					Select obj = new Select(driver.findElement(By.name(arg2)));
					obj.selectByVisibleText(arg3);
				}	
				else if(arg1.equals("xpath")) {
					Select obj = new Select(driver.findElement(By.name(arg2)));
					obj.selectByVisibleText(arg3);
				}
				}
	}
			
