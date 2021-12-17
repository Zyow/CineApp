package fr.mxsz.CineApp.services;

import java.util.List;

import fr.mxsz.CineApp.entities.Cinema;
import fr.mxsz.CineApp.repositories.CinemaRepository;

public class CinemaService {

	CinemaRepository repository;
	
	public CinemaService(CinemaRepository repository) {
		this.repository = repository;
	}
	
	public List<Cinema> findAll(){
		return this.repository.findAll();
	}
	
	public Cinema save (Cinema cinema) {
		return this.repository.save(cinema);
	}
	
	public void delete(Cinema cinema) {
		this.repository.delete(cinema);
	}
}
