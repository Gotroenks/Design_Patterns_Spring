package one.digitalinnovation.labpadroesprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot geral via Spring Initiazr
 * Os seguintes módulos foram selecionado:
 *  - Spring Data JPA;
 *  - Spring WEB;
 *  - H2 DataBase;
 *  - OpenFeign
 *
 *	@author Gotroenks <a href="https://github.com/Gotroenks">GitHub</a>
 */

@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
