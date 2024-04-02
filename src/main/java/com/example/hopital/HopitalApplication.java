package com.example.hopital;

import com.example.hopital.entities.Patient;
import com.example.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HopitalApplication {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);
    }

        /*Patient patient=new Patient();
        patient.setId(null);
        patient.setNom("Mohamed");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(23);


        Patient patient2 = new Patient(null, "Yassine", new Date(),false,123);
        // En utilisant Builder
        Patient patient3 = Patient.builder()
                .nom("Imane")
                .dateNaissance(new Date())
                .score(56)
                .malade(true)
                .build();

         */

        /*
        patientRepository.save(new Patient(null,"Mohamed",new Date(),false,34));
        patientRepository.save(new Patient(null,"Hanane",new Date(),false,4321));
        patientRepository.save(new Patient(null,"Imane",new Date(),false,34));
         */

        @Bean
        CommandLineRunner commandLineRunner(PatientRepository patientRepository){
            return args -> {
                patientRepository.save(
                        new Patient(null,"soufiane",new Date(),true,65));
                patientRepository.save(
                        new Patient(null,"oumaima",new Date(),true,200));
                patientRepository.save(
                        new Patient(null,"farouk",new Date(),true,83));

                List<Patient> patients = patientRepository.findAll();
                patients.forEach(p->{
                    System.out.println(p.getNom());
                });


            };
        }

    }

