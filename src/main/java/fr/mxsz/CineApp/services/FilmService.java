package fr.mxsz.CineApp.services;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;

import fr.mxsz.CineApp.dtos.GetFilmDTO;
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
	
	public GetFilmDTO getFilm(String id) {
		
		Optional<Film> film = this.repository.findById(id);
		
		ModelMapper mapper = new ModelMapper();
		GetFilmDTO getFilmDTO = mapper.map(film.get(), GetFilmDTO.class);
		
		return getFilmDTO;
	}
}
