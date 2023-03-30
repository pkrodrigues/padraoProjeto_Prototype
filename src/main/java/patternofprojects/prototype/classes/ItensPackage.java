package patternofprojects.prototype.classes;

public class ItensPackage implements Cloneable {
    private String arline_tickets ;
    private String accommodation;
    private String food;
    private String tours;
    private String transfer;

    public ItensPackage(String arline_tickets, String accommodation, String food, String tours) {
        this.arline_tickets = arline_tickets;
        this.accommodation = accommodation;
        this.food = food;
        this.tours = tours;
        this.transfer = transfer;
    }

    public String getArline_tickets() {
        return arline_tickets;
    }

    public void setArline_tickets(String arline_tickets) {
        this.arline_tickets = arline_tickets;
    }

    public String getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getTours() {
        return tours;
    }

    public void setTours(String tours) {
        this.tours = tours;
    }

    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    @Override
    public ItensPackage clone() throws CloneNotSupportedException {
        ItensPackage itensPackageClone = (ItensPackage) super.clone();
        return itensPackageClone;
    }

    @Override
    public String toString() {
        return "Itens do Pacote{"+
                "Passagem aerea="+arline_tickets+
                ", Hospedagem = "+accommodation+
                ", Refeição ="+food+
                ", Transportes="+transfer+
                "}";
    }
}
