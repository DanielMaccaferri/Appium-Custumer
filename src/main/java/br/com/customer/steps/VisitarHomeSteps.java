package br.com.customer.steps;

import br.com.customer.funcionalidade.HomeFuncionalidade;
import br.com.customer.funcionalidade.InsertClientsFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class VisitarHomeSteps {
	HomeFuncionalidade home = new HomeFuncionalidade();
	InsertClientsFuncionalidade clients = new InsertClientsFuncionalidade();

	@Dado("que entro no app")
	public void que_entro_no_app() {
		home.validateHome();
		home.cliqueHome();
		clients.escreName();
		clients.escreTelefone();
		clients.escreEmail();
		clients.escreCPF();
		clients.escreDescricao();
		clients.clickSalvar();
	}

	@Entao("eu visito a tela home")
	public void eu_visito_a_tela_home() {

	}
}
