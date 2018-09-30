package com.aula02.Banco.builder;

import java.util.ArrayList;
import java.util.List;

import com.aula02.Banco.dominio.Conta;
import com.aula02.Banco.dominio.Usuario;

public class ContaBuilder {
	
	private List<Conta> contas;
	private Usuario usuario;
	
	public ContaBuilder(){
		contas = new ArrayList<Conta>();
	}
	
	public ContaBuilder addConta(Conta conta, Usuario usuario){
		conta.setUsuario(usuario);
		this.contas.add(conta);
		return this;
	}
	
	public List<Conta> constroi() {
		return this.contas;
	}
	
}