public class AirTransportation extends Transporte {

    private String name;
    private int numberOfContainers;

    public AirTransportation(String id, double weight, double distance, String name, int numberOfContainers) {
        super(id, weight, distance);
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }

    @Override
    public String getType() {
        return "Aéreo";
    }

    @Override
    public double calculateTravelTime() {
        return getDistance() / 800; // Velocidade média estimada de 800 km/h
    }

    @Override
    public String generateReport() {
        return "*Relatório de Transporte Aéreo*" +
                "\nID: " + getId() +
                "\nNome da Aeronave: " + getName() +
                "\nNúmero de Contentores: " + getNumberOfContainers() +
                "\nPeso: " + getWeight() + " kg" +
                "\nDistância: " + getDistance() + " km" +
                "\nTempo de Viagem: " + calculateTravelTime() + " horas" +
                "\nTaxa: R$" + calculateFee();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }

    @Override
    public double calculateFee() {
        return getWeight() * getDistance() * 0.04;
    }

    @Override
    public String toString() {
        return "AirTransportation{" +
                "name='" + name + '\'' +
                ", numberOfContainers=" + numberOfContainers +
                ", " + super.toString() +
                '}';
    }
}
