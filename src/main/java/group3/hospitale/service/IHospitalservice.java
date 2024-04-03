package group3.hospitale.service;

import group3.hospitale.entities.Consultation;
import group3.hospitale.entities.Medecin;
import group3.hospitale.entities.Patient;
import group3.hospitale.entities.RendezVous;

public interface IHospitalservice {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}
