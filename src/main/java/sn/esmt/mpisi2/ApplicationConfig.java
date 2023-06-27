package sn.esmt.mpisi2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Etudiant getEtudiantBean() {
        Etudiant etudiant =  new Etudiant();

        etudiant.setNom("Mouhamed Tall");
        etudiant.setAge(27);
        return etudiant;
    }
}
