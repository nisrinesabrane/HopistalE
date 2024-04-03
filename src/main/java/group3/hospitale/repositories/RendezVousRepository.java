package group3.hospitale.repositories;
import group3.hospitale.entities.Medecin;
import  group3.hospitale.entities.Patient;
import group3.hospitale.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {
}
