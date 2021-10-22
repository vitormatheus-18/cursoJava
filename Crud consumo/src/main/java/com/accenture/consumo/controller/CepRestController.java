package com.accenture.consumo.controller;

import com.accenture.consumo.interfaces.CepService;
import com.accenture.consumo.model.Endereco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CepRestController {

	@Autowired
	private CepService cepService;

	@GetMapping("/{cep}")
	public ModelAndView getCep(@PathVariable String cep) {
		
		Endereco endereco = cepService.buscaEnderecoPorCep(cep);

		ModelAndView modelAndView = new ModelAndView("endereco");		
		modelAndView.addObject("endereco", endereco);
		
		return modelAndView; 
	}

}