import  org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Pizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver",
                "C:\\Users\\Trisha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        try {
            driver.get("C:\\Users\\Trisha\\Desktop\\pizza.html");
            System.out.println("Title"+ driver.getTitle());
        
            driver.findElement(By.name("name")).sendKeys("Trisha");
            driver.findElement(By.name("size")).sendKeys("Large");
            driver.findElement(By.tagName("button")).click();
            Thread.sleep(1000);
       }
        catch(Exception e){
          System.out.println ("error");
        }
        finally {
            driver.quit();
        }
    }  
}
