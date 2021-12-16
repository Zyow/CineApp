package fr.mxsz.CineApp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.mxsz.CineApp.entities.Film;

public interface FilmRepository extends MongoRepository<Film, String>{

}
