
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstscript {

    public static void main(String[] args){
       //stem.setProperty("Webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        if(title.equals("Google")){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is incorrect");
        }

    }
}
