package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.ListaNumerica;

@Controller
@RequestMapping(value="/")
@CrossOrigin(value="/*")
public class ListaNumericaController {
	
//	@GetMapping(value = "/olamundo")
//	public ResponseEntity<ListaNumerica> olaMundo() {
//		ListaNumerica ln = new ListaNumerica();
//		ln.add(0).add(2).add(3).add(4).add(4).add(4);
//		ln.calcularTotal();
//		return ResponseEntity.ok(ln);
//	}

	
//	como ele espera receber a lista dos numeros
//	{
//  	"numeros": [10, 2]
//	}
	@PostMapping(value="/calculartotal")
	public ResponseEntity<ListaNumerica> create(@RequestBody ListaNumerica listaDeNumeros){
		try {
			
			listaDeNumeros.calcularTotal();
			return ResponseEntity.ok(listaDeNumeros);
			
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(new ListaNumerica());
		}
	}
	
}
