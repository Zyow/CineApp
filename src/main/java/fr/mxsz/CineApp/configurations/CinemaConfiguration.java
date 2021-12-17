package fr.mxsz.CineApp.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.mxsz.CineApp.repositories.CinemaRepository;
import fr.mxsz.CineApp.services.CinemaService;

@Configuration
public class CinemaConfiguration {

	@Bean
	public CinemaService cinemaService(CinemaRepository repository) {
		return new CinemaService(repository);
	}
}
