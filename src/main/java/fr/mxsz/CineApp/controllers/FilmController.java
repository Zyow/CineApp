package fr.mxsz.CineApp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.mxsz.CineApp.entities.Film;
import fr.mxsz.CineApp.services.FilmService;

@RestController
@RequestMapping("films")
public class FilmController {
	
	FilmService service;
	
	public FilmController(FilmService service) {
		this.service = service;
	}

	/**
	 * Méthode qui retourne la liste des films
	 * @return List<Film> 
	 */
	@GetMapping
	public	List<Film> findAll(){
		return service.findAll();
	}
	
	/**
	 * Méthode pour ajouter nouveau film
	 * @param film Film
	 * @return Film
	 */
	@PostMapping
	public Film save(@RequestBody Film film) {
		return this.service.save(film);
	}
	
	/**
	 * Méthode pour mettre à jour un film existant
	 * @param film Film
	 * @return Film
	 */
	@PutMapping
	public Film update(@RequestBody Film film) {
		return this.service.save(film);
	}
	
	/**
	 * Méthode pour supprimer un film
	 * @param film Film
	 */
	@DeleteMapping
	public void delete (@RequestBody Film film) {
		this.service.delete(film);
	}
}
