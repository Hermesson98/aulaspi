package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.Evento;

@Controller
public class EventosController {
	
	@RequestMapping("/Eventos/form")
	public String form() {
		System.out.println("Chamando o método form: ");
		
		return "formEvento";
		
	}
	@RequestMapping("/Eventos/submit")
	public String submit (Evento h){
		System.out.println(h.getNome());
		System.out.println(h.getLocal());
		System.out.println(h.getHorario());
		System.out.println(h.getData());
		
		return "submit";
	 
	 
 }


}
