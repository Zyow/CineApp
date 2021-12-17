package fr.mxsz.CineApp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.mxsz.CineApp.entities.Seance;
import fr.mxsz.CineApp.services.SeanceService;

@RestController
@RequestMapping("seances")
public class SeanceController {

	SeanceService service;
	
	public SeanceController(SeanceService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Seance> findAll(){
		return this.service.findAll();
	}
	
	@PostMapping
	public Seance save(@RequestBody Seance seance) {
		return this.service.save(seance);
	}
	
	@PutMapping
	public Seance update(@RequestBody Seance seance) {
		return this.service.save(seance);
	}
	
	@DeleteMapping
	public void Seance(@RequestBody Seance seance) {
		this.service.delete(seance);
	}
	
	
}
