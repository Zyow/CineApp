package fr.mxsz.CineApp.services;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;

import fr.mxsz.CineApp.dtos.GetSeanceDTO;
import fr.mxsz.CineApp.entities.Seance;
import fr.mxsz.CineApp.repositories.SeanceRepository;

public class SeanceService {

	SeanceRepository repository;
	
	public SeanceService(SeanceRepository repository) {
		this.repository = repository;
	}
	
	/**
	 * Récupération de la liste des séances
	 * @return List<Seance
	 */
	public List<Seance> findAll(){
		return this.repository.findAll();
	}
	
	/**
	 * Sauvegarde ou modification d'une nouvelle seance
	 * @param seance
	 * @return
	 */
	public Seance save(Seance seance) {
		return this.repository.save(seance);
	}
	
	/**
	 * Suppression d'une seance
	 * @param seance
	 */
	public void delete(Seance seance) {
		this.repository.delete(seance);
	}
	
	public GetSeanceDTO getSeance(String id) {
		
		Optional<Seance> seance = this.repository.findById(id);
		
		ModelMapper mapper = new ModelMapper();
		GetSeanceDTO getSeanceDTO = mapper.map(seance.get(), GetSeanceDTO.class);
		
		return getSeanceDTO;
	}
}
