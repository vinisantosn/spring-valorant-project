package dev.vinisantosn.valorantProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import dev.vinisantosn.domain.Agente;
import dev.vinisantosn.repository.IAgenteRepository;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages="dev.vinisantosn.repository")
@EntityScan("dev.vinisantosn.*")
@ComponentScan(basePackages="dev.vinisantosn")
public class ValorantProjectApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(ValorantProjectApplication.class);
	
	@Autowired
	private IAgenteRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ValorantProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("START APPLICATION ...");
		Agente agente = createAgente();
		repository.save(agente);
		
	}

	private Agente createAgente() {
		return Agente.builder()
				.nome("Sage")
				.papel("Sentinela")
				.saude(100)
				.armadura(50)
				.ultimate("Ressurreição")
				.build();
		
	}

}
