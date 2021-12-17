package fr.mxsz.CineApp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.mxsz.CineApp.entities.Cinema;

public interface CinemaRepository extends MongoRepository<Cinema, String>{

}
