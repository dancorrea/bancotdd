package com.aula02.Banco.dao;

import java.util.List;

import javax.management.RuntimeErrorException;

import com.aula02.Banco.dominio.Conta;

public interface Dao {

	List<Conta> getContas();

	void atualizaConta(Conta conta) throws RuntimeErrorException;

	void salvaConta(Conta conta);

}