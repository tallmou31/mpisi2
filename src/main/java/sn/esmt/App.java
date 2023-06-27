package sn.esmt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sn.esmt.mpisi2.ApplicationConfig;
import sn.esmt.mpisi2.Etudiant;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Etudiant etudiant = context.getBean(Etudiant.class);
        System.out.println( "Hello " + etudiant.getNom() + "  Age : " + etudiant.getAge() );
    }
}
