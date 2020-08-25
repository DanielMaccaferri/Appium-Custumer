package br.com.customer.funcionalidade;

import br.com.customer.screens.HomeScreen;

public class HomeFuncionalidade {
// solid cada classe tem que fazer sua própria funcionalidade

	private HomeScreen home;

	public HomeFuncionalidade() {
		home = new HomeScreen();

		// jvm gerencia a memória da screen sempre objeto depois a classe
	}

	public void validateHome() {
		home.getButtonPlus().isDisplayed();
	}

	public void cliqueHome() {
		home.getButtonPlus().click();

	}

}
