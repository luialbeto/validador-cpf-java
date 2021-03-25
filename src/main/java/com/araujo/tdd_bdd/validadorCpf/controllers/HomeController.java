package com.araujo.tdd_bdd.validadorCpf.controllers;

import com.araujo.tdd_bdd.validadorCpf.models.Cliente;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("https://www.torneseumprogramador.com.br/")

	public String index() {
		return "home/index";
	}

	@GetMapping("/valida-cpf")

	public String validadorCpf(Cliente cliente, Model model) {
		boolean verdade = cliente.validarCPF(null);
		model.addAttribute("verdade", verdade);
		return "home/cpfValidado";
	}
}
