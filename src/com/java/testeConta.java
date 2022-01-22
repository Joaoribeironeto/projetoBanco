package com.java;

public class testeConta {

	public static void main(String[] args) {

		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();

		contaCorrente.numero = 12;
		contaCorrente.saldo = 100.5;
		contaCorrente.cliente.nome = "João";
		contaCorrente.cliente.idade = 17;

		contaPoupanca.numero = 15;
		contaPoupanca.saldo = 50.25;
		contaPoupanca.cliente.nome = "Lucas";
		contaPoupanca.cliente.idade = 23;

		contaInvestimento.numero = 18;
		contaInvestimento.saldo = 38;
		contaInvestimento.cliente.nome = "Daniel";
		contaInvestimento.cliente.idade = 26;
		
		if (contaCorrente.saldo > 100) {
			System.out.println("O seu saldo é superior a 100");
		} else {
			System.out.println("O seu saldo é inferior a 100");
		}

	}	

}
