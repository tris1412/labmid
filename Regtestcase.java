/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regtestcase;

/**
 *
 * @author Trisha
 */


    /**
     * @param args the command line arguments
     */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Regtestcase {

    public static void main(String[] args) {

        try {
            // Set EdgeDriver path
            System.setProperty("webdriver.edge.driver",
                    "C:\\Users\\Trisha\\Downloads\\edgedriver_win64\\msedgedriver.exe");

            WebDriver driver = new EdgeDriver();

            // Load your HTML form
            driver.get("C:\\Users\\Trisha\\Desktop\\regform.html");

            // -------------------------
            // TEST CASE 1: VALID INPUT
            // -------------------------
            System.out.println("Running TC1: Valid Input...");
            driver.findElement(By.name("name")).sendKeys("Trisha");
            driver.findElement(By.name("email")).sendKeys("trisha@example.com");
            driver.findElement(By.name("password")).sendKeys("Abc@1234");
            driver.findElement(By.tagName("button")).click();

            System.out.println("TC1 executed successfully!");
            Thread.sleep(3000); // see result


            // -------------------------
            // TEST CASE 2: EMPTY NAME
            // -------------------------
            System.out.println("Running TC2: Empty Name...");

            // Reload form
            driver.get("C:\\Users\\Trisha\\Desktop\\regform.html");

            driver.findElement(By.name("email")).sendKeys("test@example.com");
            driver.findElement(By.name("password")).sendKeys("Password123");
            driver.findElement(By.tagName("button")).click();

            System.out.println("TC2 executed (should show browser 'required' message).");
            Thread.sleep(3000);

            // Close browser
            driver.quit();

        } catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }
}

