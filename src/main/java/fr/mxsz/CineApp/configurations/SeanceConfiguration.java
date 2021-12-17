package fr.mxsz.CineApp.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.mxsz.CineApp.repositories.SeanceRepository;
import fr.mxsz.CineApp.services.SeanceService;

@Configuration
public class SeanceConfiguration {

	@Bean
	public SeanceService seanceService(SeanceRepository repository) {
		return new SeanceService(repository);
	}
}
