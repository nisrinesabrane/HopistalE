package group3.hospitale.repositories;
import group3.hospitale.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String name);
}
