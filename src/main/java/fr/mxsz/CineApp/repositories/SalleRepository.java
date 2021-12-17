package fr.mxsz.CineApp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.mxsz.CineApp.entities.Salle;

public interface SalleRepository extends MongoRepository<Salle, String> {

}
