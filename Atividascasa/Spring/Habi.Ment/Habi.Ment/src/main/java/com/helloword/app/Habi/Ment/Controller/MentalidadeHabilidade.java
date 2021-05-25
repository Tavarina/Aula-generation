package com.helloword.app.Habi.Ment.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class MentalidadeHabilidade {
	
	    @RequestMapping(value = "/MentalidadeHabilidade")
		@GetMapping
		
		public String MentalidadesHabilidades() {
			return "\n Minhas mentalidades são: Responsabilidade pessoal e Persistência;"
					+ "\n E minhas habilidades são: Proatividade e atenção aos detalhes.";
		}
	
	    @RequestMapping(value = "/Objetivo")
		@GetMapping
		public String objetivo() {
			return "\n Meu objetivo de aprendizagem: Aprender Spring, criar meu pitch e estudar mais java.";
		}
}



