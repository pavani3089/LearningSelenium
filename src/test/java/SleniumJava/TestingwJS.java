package SleniumJava;


import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TestingwJS {

    public static void main (String args[]){

        HtmlUnitDriver driver = new HtmlUnitDriver();
        driver.setJavascriptEnabled(true);
        driver.get("http://www.google.com");

        System.out.println("Title of the page is" + driver.getTitle());

        WebElement java = driver.findElement(By.name("q"));
        java.sendKeys("Java Code Geeks");
        java.submit();

        System.out.println("Title of the page now is " + driver.getTitle());
    }
}