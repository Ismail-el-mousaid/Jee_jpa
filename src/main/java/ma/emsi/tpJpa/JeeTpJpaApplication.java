package ma.emsi.tpJpa;

import java.util.Date;
import ma.emsi.tpJpa.entities.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.emsi.tpJpa.repository.PatientRepository;

@SpringBootApplication
public class JeeTpJpaApplication implements CommandLineRunner{
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(JeeTpJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		patientRepository.save( new Patient(null, "ismail", new Date(), 455, false));
		patientRepository.save( new Patient(null, "yassine", new Date(), 855, true));
		
	}

}
