package fr.mxsz.CineApp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.mxsz.CineApp.entities.Salle;
import fr.mxsz.CineApp.services.SalleService;

@RestController
@RequestMapping("salles")
public class SalleController {
	
	SalleService service;
	
	public SalleController (SalleService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Salle> findAll(){
		return service.findAll();
	}

	@PostMapping
	public Salle save(@RequestBody Salle salle) {
		return this.service.save(salle);
	}
	
	@PutMapping
	public Salle update(@RequestBody Salle salle) {
		return this.service.save(salle);
	}
	
	@DeleteMapping
	public void delete(@RequestBody Salle salle) {
		this.service.delete(salle);
	}
}
