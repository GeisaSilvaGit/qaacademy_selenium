package qaacqdemy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraClasse {

    String cursosOnlineBotao = "comp-k7g9c7sd2label";
    String cursosPresenciais = "comp-k7g9c7sd1label";
    String botaoContato = "comp-k7g9c7sd3label";
    String botaoDepoimento = "comp-k7g9c7sd4label";
    String botaoMatricula = "comp-k7g9c7sd5label";


    @Test
    public void testeAberturaNavegador() throws InterruptedException{

        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();
        drive.get("https://www.qaacademy.com.br/");

        Thread.sleep(6000);
         drive.findElement(By.id(cursosPresenciais)).click();;
        drive.findElement(By.id(cursosOnlineBotao)).click();;
        drive.findElement(By.id(botaoContato)).click();;
        drive.findElement(By.id(botaoDepoimento)).click();;
        drive.findElement(By.id(botaoMatricula)).click();;
    }

    
}
