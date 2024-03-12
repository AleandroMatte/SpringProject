package com.example.demo.controllers;



public class Hello {
	private long idade ;
	private String nome ;
	

	public Hello(long idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}

	public long getIdade() {
		return idade;
	}

	public void setIdade(long idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Hello() {
	}

	public String helo() {
		return this.nome;
	}
}
