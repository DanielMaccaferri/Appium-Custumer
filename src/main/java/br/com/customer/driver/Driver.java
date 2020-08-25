package br.com.customer.driver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class Driver {

	private static AndroidDriver<?> driver;

	public static AndroidDriver<?> getDriver() {
		if (driver == null) {
			conectar();
		}
		return driver;
	}

	@SuppressWarnings("rawtypes") // isso para métodos que já foram depreciados
	private static AndroidDriver<?> conectar() {
		File diretorioAplicacao = new File("app");
		File arquivoAplicacao = new File(diretorioAplicacao, "Customer.apk");

		DesiredCapabilities capacidade = new DesiredCapabilities();
		capacidade.setCapability("deviceName", "emulator-5554");
		capacidade.setCapability("platformName", "Android");
		capacidade.setCapability("app", arquivoAplicacao.getAbsolutePath());
		capacidade.setCapability("automationName", "UiAutomator1");
		capacidade.setCapability("newCommandTimeout", 4600);
		capacidade.setCapability("unicodeKeyboard", true);
		capacidade.setCapability("resetKeyboard", true);

		try {
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capacidade);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return driver;
	}

	public static WebDriverWait esperarpeloDriver(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait;
	}

	@After
	private static void encerrarDriver() {
		try {
			driver.quit();
		} catch (Exception ign) {
		}
	}
}
