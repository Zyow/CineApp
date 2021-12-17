package fr.mxsz.CineApp.configurations;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.mxsz.CineApp.repositories.SalleRepository;
import fr.mxsz.CineApp.services.SalleService;

@Configuration
public class SalleConfiguration {

	@Bean
	public SalleService salleService(
			SalleRepository repository,
			ModelMapper mapper
			) {
		return new SalleService(repository, mapper);
	}
}
