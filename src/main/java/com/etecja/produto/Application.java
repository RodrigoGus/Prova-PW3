package com.etecja.produto;

import java.util.Date;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.etecja.entidades.Produto;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Scanner s = new Scanner(System.in);
		String nome = null, marca = null, codigoBarra = null;
		Integer quantidade = null;
		
		do {
			try {
				System.out.print("Insira o nome do produto: ");
				nome = s.nextLine();
				System.out.print("Insira a marca do produto: ");
				s.nextLine();
				marca = s.nextLine();
				System.out.print("Insira a quantidade do produto: ");
				quantidade = s.nextInt();
				System.out.print("Insira o código de barras: ");
				s.nextLine();
				codigoBarra = s.nextLine();
			} catch(Exception e) {
			}
			Produto p = new Produto(nome, marca, codigoBarra, quantidade, new Date());
			break;
		} while(true);
	}

}
