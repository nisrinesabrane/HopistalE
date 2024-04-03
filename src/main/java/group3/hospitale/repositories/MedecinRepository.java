package group3.hospitale.repositories;
import group3.hospitale.entities.Medecin;
import group3.hospitale.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String nom);
}
