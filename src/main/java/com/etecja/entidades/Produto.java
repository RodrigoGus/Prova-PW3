package com.etecja.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Produto implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String codigoBarra;
	private String nome;
	private String marca;
	private Integer quantidade;
	private Date dtCadastro;
	
	public Produto() {}
	public Produto(String nome, String marca, String codigoBarra, Integer quantidade, Date dtCadastro) {
		super();
		this.nome = nome;
		this.marca = marca;
        this.codigoBarra = codigoBarra;
		this.quantidade = quantidade;
		this.dtCadastro = dtCadastro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Date getDtCadastro() {
		return dtCadastro;
	}
}
