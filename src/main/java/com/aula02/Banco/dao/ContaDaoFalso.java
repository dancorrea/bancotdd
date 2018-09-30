package com.aula02.Banco.dao;

import java.util.ArrayList;
import java.util.List;

import com.aula02.Banco.dominio.Conta;

public class ContaDaoFalso implements Dao {

	private static List<Conta> leiloes = new ArrayList<Conta>();
	
	public void salvaConta(Conta conta) {
		leiloes.add(conta);
	}

	public List<Conta> getContas(){
		return leiloes;
	}
	
	
	public void atualizaConta(Conta conta) { /* faz nada! */ }
}
