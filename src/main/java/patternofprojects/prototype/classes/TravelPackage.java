package patternofprojects.prototype.classes;

public class TravelPackage implements Cloneable {

        private int id_travel_package;
        private String package_name;
        private String description;

        private ItensPackage itensPackage;

    public TravelPackage(int id_travel_package, String package_name, String description, ItensPackage itensPackage) {
        this.id_travel_package = id_travel_package;
        this.package_name = package_name;
        this.description = description;
        this.itensPackage = itensPackage;
    }

    public int getId_travel_package() {
            return id_travel_package;
        }

        public void setId_travel_package(int id_travel_package) {
            this.id_travel_package = id_travel_package;
        }

        public String getPackage_name() {
            return package_name;
        }

        public void setPackage_name(String package_name) {
            this.package_name = package_name;
        }
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    public ItensPackage getItensPackage() {
        return itensPackage;
    }

    public TravelPackage setItensPackage(ItensPackage itensPackage) {
        this.itensPackage = itensPackage;
        return this;
    }

    @Override
    public TravelPackage clone() throws CloneNotSupportedException {
            TravelPackage travelPackageClone = (TravelPackage) super.clone();
            travelPackageClone.itensPackage = (ItensPackage) travelPackageClone.itensPackage.clone();
            return travelPackageClone;
    }

    @Override
    public String toString() {
        return "Pacote de Viagem{"+
                "Identificação do Pacote="+id_travel_package+
                "Nome do Paote="+package_name+
                "Descrição do pacote="+description+
                "}";
    }
}
