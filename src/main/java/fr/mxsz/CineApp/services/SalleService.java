package fr.mxsz.CineApp.services;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;

import fr.mxsz.CineApp.dtos.GetSalleDTO;
import fr.mxsz.CineApp.entities.Salle;
import fr.mxsz.CineApp.repositories.SalleRepository;

public class SalleService {

	private SalleRepository repository;
	private ModelMapper mapper;
	
	public SalleService(SalleRepository repository,
			ModelMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	/**
	 * Récuperation d'une liste de salles
	 * @return List<Salle> 
	 */
	public List<Salle> findAll(){
		return this.repository.findAll();
	}
	
	/**
	 * Ajout ou modification d'une salle
	 * @param salle Salle
	 * @return Salle
	 */
	public Salle save(Salle salle) {
		return this.repository.save(salle);
	}
	
	/**
	 * Suppression d'une salle
	 * @param salle Salle
	 */
	public void delete(Salle salle) {
		this.repository.delete(salle);
	}
	
	public GetSalleDTO getSalle(String id) {
		
		Optional<Salle> salle = this.repository.findById(id);
		
		ModelMapper mapper = new ModelMapper();
		GetSalleDTO getSalleDTO = mapper.map(salle.get(), GetSalleDTO.class);
		
		return getSalleDTO;
	}
}
