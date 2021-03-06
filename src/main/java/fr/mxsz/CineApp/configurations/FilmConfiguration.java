package fr.mxsz.CineApp.configurations;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.mxsz.CineApp.repositories.FilmRepository;
import fr.mxsz.CineApp.services.FilmService;

@Configuration
public class FilmConfiguration {

	@Bean
	public FilmService filmService(
			FilmRepository repository,
			ModelMapper mapper
			) {
		return new FilmService(repository, mapper);
	}
}
