package testcases;

	import java.io.IOException;
	import java.util.Scanner;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.By;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;

	import pageobjectmodel.calculatorpage;
	import resources.Baseclass;
	import java.util.Scanner;
	public class verifycalcu   extends Baseclass {

		@Test
	public void enterCredientials() throws InterruptedException {
			calculatorpage log = new calculatorpage(driver);

			log.foura().click();
			log.twoa().click();
			log.threea().click();
			log.multa().click();
			log.fivea().click();
			log.twoa().click();
			log.fivea().click();
			log.equala().click();
			Thread.sleep(100);
			
			
			log.foura().click();
			log.zeroa().click();
			log.zeroa().click();
			log.zeroa().click();
			log.diva().click();
			log.twoa().click();
			log.zeroa().click();
			log.zeroa().click();
			log.equala().click();
			Thread.sleep(100);
			
			
			log.nega().click();
			log.twoa().click();
			log.threea().click();
			log.foura().click();
			log.twoa().click();
			log.threea().click();
			log.foura().click();
			log.adda().click();
			log.threea().click();
			log.foura().click();
			log.fivea().click();
			log.threea().click();
			log.foura().click();
			log.fivea().click();
			log.equala().click();
			Thread.sleep(100);
			
			
			log.twoa().click();
			log.threea().click();
			log.foura().click();
			log.eighta().click();
			log.twoa().click();
			log.threea().click();
			log.suba().click();
			log.nega().click();
			log.twoa().click();
			log.threea().click();
			log.zeroa().click();
			log.ninea().click();
			log.foura().click();
			log.eighta().click();
			log.twoa().click();
			log.threea().click();
			log.equala().click();
			 	



	}
	}








