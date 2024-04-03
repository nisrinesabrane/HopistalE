package group3.hospitale;

import group3.hospitale.entities.*;
import group3.hospitale.repositories.ConsultationRepository;
import group3.hospitale.repositories.MedecinRepository;
import group3.hospitale.repositories.PatientRepository;
import group3.hospitale.repositories.RendezVousRepository;
import group3.hospitale.service.IHospitalservice;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalEApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalEApplication.class, args);
	}
	@Bean
	CommandLineRunner start(IHospitalservice hospitalservice,PatientRepository patientRepository,
							RendezVousRepository rendezVousRepository,
							ConsultationRepository consultationRepository,MedecinRepository medecinRepository){
		return  args -> {
			Stream.of("mohamed","hassan","najat")
					.forEach(name->{
						Patient patient=new Patient();
						patient.setNom(name);
						patient.setDateNaissance(new Date());
						patient.setMalade(false);
						hospitalservice.savePatient(patient);
					});
			Stream.of("aymane","hanane","yasmine")
					.forEach(name->{
						Medecin medecin=new Medecin();
						medecin.setNom(name);
						medecin.setEmail(name+"@gmail.com");
						medecin.setSpecialite(Math.random()>0.5?"cardio":"denstiste");
						hospitalservice.saveMedecin(medecin);
					});
			Patient patient=patientRepository.findById(1L).orElse(null);
			Patient patient1=patientRepository.findByNom("mohamed");
			Medecin medecin=medecinRepository.findByNom("yasmine");

			RendezVous rendezVous=new RendezVous();
			rendezVous.setDate(new Date());
			rendezVous.setStatus(StatusRDV.PENDING);
			rendezVous.setMedecin(medecin);
			rendezVous.setPatient(patient);
			rendezVousRepository.save(rendezVous);

			RendezVous rendezVous1=rendezVousRepository.findById(1L).orElse(null);
			Consultation consultation=new Consultation();
			consultation.setDateConsultation(new Date());
			consultation.setRendezVous(rendezVous1);
			consultation.setRapport("rapport de la consultation");


		};
	}

	}
