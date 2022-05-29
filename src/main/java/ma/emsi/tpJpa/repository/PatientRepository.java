package ma.emsi.tpJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.tpJpa.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

}
