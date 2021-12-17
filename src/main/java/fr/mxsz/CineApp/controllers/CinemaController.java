package fr.mxsz.CineApp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.mxsz.CineApp.entities.Cinema;
import fr.mxsz.CineApp.entities.Seance;
import fr.mxsz.CineApp.services.CinemaService;

@RestController
@RequestMapping("cinemas")
public class CinemaController {

	CinemaService service;
	
	public CinemaController(CinemaService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Cinema> findAll(){
		return this.service.findAll();
	}
	
	@PostMapping
	public Cinema save(@RequestBody Cinema cinema) {
		return this.service.save(cinema);
	}
	
	@PutMapping
	public Cinema update(@RequestBody Cinema cinema) {
		return this.service.save(cinema);
	}
	
	@DeleteMapping
	public void Cinema(@RequestBody Cinema cinema) {
		this.service.delete(cinema);
	}
}
