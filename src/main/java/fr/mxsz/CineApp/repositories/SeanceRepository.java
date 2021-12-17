package fr.mxsz.CineApp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.mxsz.CineApp.entities.Seance;

public interface SeanceRepository extends MongoRepository<Seance, String> {

}
