package fr.mxsz.CineApp.services;

import java.util.List;

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
}
