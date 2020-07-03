package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	private WebDriver driver;
	
	private By totalTaxExclTotal = By.cssSelector("div.cart-total span.value");
	
	private By nomeCliente = By.cssSelector("div.address");
	
	private By botaoContinueAdrress = By.name("confirm-addresses");
	
	private By shippingValor = By.cssSelector("span.carrier-price");
	
	private By botaoContinueShipping = By.name("confirmDeliveryOption");
	
	private By radioPayByCheck = By.id("payment-option-1");
	
	private By amountPayByCheck = By.cssSelector("#payment-option-1-additional-information > section > dl > dd:nth-child(2)");
	
	private By checkboxIAgree = By.id("conditions_to_approve[terms-and-conditions]");
	
	private By botaoConfirmaPedido = By.cssSelector("#payment-confirmation button");
	
	
	public CheckoutPage (WebDriver driver) {
		
		this.driver = driver;	
		
	}
	
	public String obter_totalTaxIncTotal() {
		
		return driver.findElement(totalTaxExclTotal).getText();
	}
	
	public String obter_nomeCliente() {
		
		return driver.findElement(nomeCliente).getText();
		
	}
	
	public void clicarBotaoContinueAdrress() {
		
		driver.findElement(botaoContinueAdrress).click();
	}
	
	public String obter_shippingValor() {
		return driver.findElement(shippingValor).getText();
	}
	
	public void clicarBotaoContinueShipping() {
	
	 driver.findElement(botaoContinueShipping).click();
	
	}
	
	public void selecionarRadioPayByCheck() {
		
		driver.findElement(radioPayByCheck).click();
		
			}
	
	public String obter_amountPayByCheck() {
		
		return driver.findElement(amountPayByCheck).getText();
	}
	
	public void selecionarCheckboxIAgree() {
		
		driver.findElement(checkboxIAgree).click();
	}
	
	public boolean estaSelecionadoCheckoutIAgree() {
		
		return driver.findElement(checkboxIAgree).isSelected();
		
	}
	
	 public PedidoPage clicarBotaoConfirmaPedido() {
		driver.findElement(botaoConfirmaPedido).click();
		return new PedidoPage(driver);
		
	}

}
