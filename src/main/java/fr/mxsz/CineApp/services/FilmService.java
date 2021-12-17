package fr.mxsz.CineApp.services;

import java.util.List;

import org.modelmapper.ModelMapper;

import fr.mxsz.CineApp.entities.Film;
import fr.mxsz.CineApp.repositories.FilmRepository;

public class FilmService {

	private FilmRepository repository;
	private ModelMapper mapper;
	
	public FilmService(FilmRepository repository,
			ModelMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	/**
	 * Récuperation d'une liste de films
	 * @return List<Film> 
	 */
	public List<Film> findAll(){
		return this.repository.findAll();
	}
	
	/**
	 * Ajout ou modification d'un film
	 * @param film Film
	 * @return Film
	 */
	public Film save(Film film) {
		return this.repository.save(film);
	}
	
	/**
	 * Suppression d'un film
	 * @param film Film
	 */
	public void delete(Film film) {
		this.repository.delete(film);
	}
}
