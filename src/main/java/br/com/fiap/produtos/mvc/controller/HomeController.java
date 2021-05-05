package br.com.fiap.produtos.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.produtos.mvc.dto.Produto;
import br.com.fiap.produtos.mvc.service.impl.ProdutoServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	private ProdutoServiceImpl service;
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView("home-produtos");
		List<Produto> produtos = service.listaProdutos();
		view.addObject("produtos", produtos);
		return view;		
	}

}
