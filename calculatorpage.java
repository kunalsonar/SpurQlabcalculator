package pageobjectmodel;
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class calculatorpage {
public WebDriver driver;
	
private By results = By.xpath("//div[@id='sciOutPut']");
private By one = By.xpath("(//span[@class='scinm'])[7]");
private By two = By.xpath("(//span[@class='scinm'])[8]");
private By three = By.xpath("(//span[@class='scinm'])[9]");
private By four = By.xpath("(//span[@class='scinm'])[4]");
private By five = By.xpath("(//span[@class='scinm'])[5]");
private By six = By.xpath("(//span[@class='scinm'])[6]");
private By seven = By.xpath("(//span[@class='scinm'])[1]");
private By eight = By.xpath("(//span[@class='scinm'])[2]");
private By nine = By.xpath("(//span[@class='scinm'])[3]");
private By zero = By.xpath("(//span[@class='scinm'])[10]");

private By add = By.xpath("(//span[@class='sciop'])[1]");
private By sub = By.xpath("(//span[@class='sciop'])[3]");
private By mult = By.xpath("(//span[@class='sciop'])[5]");
private By div = By.xpath("(//span[@class='sciop'])[8]");
private By ac = By.xpath("(//span[@class='scieq'])[1]");
private By neg = By.xpath("(//span[@class='sciop'])[10]");
private By equal = By.xpath("(//span[@class='scieq'])[2]");



public  calculatorpage(WebDriver driver2) {

	this.driver=driver2;
}


public WebElement zeroa() {
	return driver.findElement(zero);
	}


public WebElement adda() {
	return driver.findElement(add);
	}


public WebElement multa() {
	return driver.findElement(mult);
	}


public WebElement diva() {
	return driver.findElement(div);
	}


public WebElement suba() {
	return driver.findElement(sub);
	}

public WebElement nega() {
	return driver.findElement(neg);
	}

public WebElement aca() {
	return driver.findElement(ac);
	}

public WebElement onea() {
	return driver.findElement(one);
	}

public WebElement twoa() {
	return driver.findElement(two);
	}

public WebElement threea() {
	return driver.findElement(three);
	}

public WebElement foura() {
	return driver.findElement(four);
	}

public WebElement fivea() {
	return driver.findElement(five);
	}

public WebElement sixa() {
	return driver.findElement(six);
	}

public WebElement sevena() {
	return driver.findElement(seven);
	}

public WebElement eighta() {
	return driver.findElement(eight);
	}

public WebElement ninea() {
	return driver.findElement(nine);
	}


public WebElement resulta() {
	return driver.findElement(results);
	}

public WebElement equala() {
	return driver.findElement(equal);
	}



}



	


