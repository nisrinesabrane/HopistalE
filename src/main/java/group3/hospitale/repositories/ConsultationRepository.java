package group3.hospitale.repositories;
import group3.hospitale.entities.Consultation;
import group3.hospitale.entities.Patient;
import group3.hospitale.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
    void setDateConsultation(Date date);

    void setRendezVous(RendezVous rendezVous);

    void setRapport(String rapportDeLaConsultation);
}
