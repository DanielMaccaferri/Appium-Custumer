package br.com.customer.screens;

import static br.com.customer.driver.Driver.getDriver;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class InsertClientsScreen {

	public InsertClientsScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}

	@AndroidFindBy(id = "txtNome")
	MobileElement Name;

	@AndroidFindBy(id = "txtTelefone")
	MobileElement Telefone;

	@AndroidFindBy(id = "txtEmail")
	MobileElement Email;

	@AndroidFindBy(id = "txtCpf")
	MobileElement CPF;

	@AndroidFindBy(id = "txtDescricao")
	MobileElement Descricao;

	@AndroidFindBy(id = "chooseDateButton")
	MobileElement Data;

	@AndroidFindBy(id = "button1")
	MobileElement Ok;

	@AndroidFindBy(id = "edtObs")
	MobileElement Comentario;

	@AndroidFindBy(id = "imageView12")
	MobileElement Salvar;

	public MobileElement getName() {
		return Name;
	}

	public void setName(MobileElement name) {
		Name = name;
	}

	public MobileElement getTelefone() {
		return Telefone;
	}

	public void setTelefone(MobileElement telefone) {
		Telefone = telefone;
	}

	public MobileElement getEmail() {
		return Email;
	}

	public void setEmail(MobileElement email) {
		Email = email;
	}

	public MobileElement getCPF() {
		return CPF;
	}

	public void setCPF(MobileElement cPF) {
		CPF = cPF;
	}

	public MobileElement getDescricao() {
		return Descricao;
	}

	public void setDescricao(MobileElement descricao) {
		Descricao = descricao;
	}

	public MobileElement getData() {
		return Data;
	}

	public void setData(MobileElement data) {
		Data = data;
	}

	public MobileElement getOk() {
		return Ok;
	}

	public void setOk(MobileElement ok) {
		Ok = ok;
	}

	public MobileElement getComentario() {
		return Comentario;
	}

	public void setComentario(MobileElement comentario) {
		Comentario = comentario;
	}

	public MobileElement getSalvar() {
		return Salvar;
	}

	public void setSalvar(MobileElement salvar) {
		Salvar = salvar;
	}
}