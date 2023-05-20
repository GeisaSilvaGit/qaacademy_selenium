package qaacqdemy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreencherFormulario {


@Test
    public void preencherNome() throws InterruptedException{

        String nome = "//*[@id='basicBootstrapForm']/div[1]/div[1]/input";
        String sobrenome = "//*[@id='basicBootstrapForm']/div[1]/div[2]/input";
        String endereco = "//*[@id='basicBootstrapForm']/div[2]/div/textarea";
        String email = "//*[@id='eid']/input";
        String telefone = "//*[@id='basicBootstrapForm']/div[4]/div/input";
        String genero = "//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input";
        String hobbies = "//*[@id='checkbox1']";
        String habilidade = "//*[@id='basicBootstrapForm']/div[8]/div"; 
        String OpcaoJava = "//*[@id='Skills']/option[39]";
        


        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();
        drive.get("https://demo.automationtesting.in/Register.html");

        Thread.sleep(2000);
         drive.findElement(By.xpath(nome)).click();
         drive.findElement(By.xpath(nome)).sendKeys("Geisa");
         drive.findElement(By.xpath(sobrenome)).sendKeys("Silva");
         drive.findElement(By.xpath(sobrenome)).click();
         drive.findElement(By.xpath(endereco)).click();
         drive.findElement(By.xpath(endereco)).sendKeys("Avenida guarapiranga");
         drive.findElement(By.xpath(email)).click();
         drive.findElement(By.xpath(email)).sendKeys("geisa_mb@yahoo.com.br");
         drive.findElement(By.xpath(telefone)).click();
         drive.findElement(By.xpath(telefone)).sendKeys("985265243");
         drive.findElement(By.xpath(genero)).click();
         drive.findElement(By.xpath(hobbies)).click();
         JavascriptExecutor js = (JavascriptExecutor) drive;
         js.executeScript("window.scrollBy(0,400)", "");
         drive.findElement(By.xpath(habilidade)).click();
         drive.findElement(By.xpath(OpcaoJava)).click();
         drive.findElement(By.xpath(habilidade)).click();

    
}
}
