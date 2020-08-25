package br.com.customer.funcionalidade;

import com.github.javafaker.Faker;

import br.com.customer.screens.InsertClientsScreen;

public class InsertClientsFuncionalidade {

	private InsertClientsScreen clients;
	Faker faker = new Faker();

	public InsertClientsFuncionalidade() {
		clients = new InsertClientsScreen();
	}

	public void escreName() {
		clients.getName().sendKeys(faker.name().fullName());
	}

	public void escreTelefone() {
		clients.getTelefone().sendKeys(faker.phoneNumber().cellPhone());
	}

	public void escreEmail()
	{
		clients.getEmail().sendKeys(faker.internet().emailAddress());
	}
	
	public void escreCPF()
	{
		clients.getCPF().sendKeys("32032032050");
					}
	
	public void escreDescricao(){
		clients.getDescricao().sendKeys("Meus Testes");
					}
	
	public void clickSalvar(){
		clients.getSalvar().click();
					}
	
}