package com.etecja.resources;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etecja.entidades.Produto;

import ch.qos.logback.core.model.Model;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        produtos.add(produto);
        return produto;
    }

    @GetMapping("/{codigoBarra}")
    public Produto buscarProduto(@PathVariable String codigoBarra, String nome, String marca, Integer quantidade, Date dtCadastro) {
        public String findAll(Model model) throws ParseException{
        	Produto p = new Produto();
    		model.addAttribute("produtos", p);
    		return "produtos";
    }

}
