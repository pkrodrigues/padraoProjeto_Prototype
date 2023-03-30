import org.junit.jupiter.api.Test;
import patternofprojects.prototype.classes.ItensPackage;
import patternofprojects.prototype.classes.TravelPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TravelPackageTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        TravelPackage travelPackage =new TravelPackage(89, "Paris", "Passeio completo em Paris", new ItensPackage("031.3654146315","Tonic Hotel du Louvre", "CM/AL/CT/JT", "Mini Van"));

        TravelPackage travelPackageClone = travelPackage.clone();
        travelPackageClone.setId_travel_package(45);
        travelPackageClone.setPackage_name("New York");
        travelPackageClone.getItensPackage().setAccommodation("Algum lugar qualquer");
        assertEquals("TravelPackage{id_travel_pakage=89, package_name='Paris', description='Passeio completo em Paris',intensPackage=Itens do Pacote{arline_tickets='031.3654146315',accommodation='Tonic Hotel du Louvre',food='CM/AL/CT/JT', transfer='Mini Van'}", travelPackage.toString());
        assertEquals("TravelPackage{id_travel_pakage=45, package_name='New York', description='Passeio completo em Paris',intensPackage=Itens do Pacote{arline_tickets='031.3654146315',accommodation='Algumlugar qualquer',food='CM/AL/CT/JT', transfer='Mini Van'}", travelPackage.toString());

    }

}
