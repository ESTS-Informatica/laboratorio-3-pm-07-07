
/**
 * Escreva uma descrição da classe m aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transporte {

    private String licensePlate;

    public GroundTransportation(String id, double weight, double distance, String licensePlate) {
        super(id, weight, distance);
        this.licensePlate = licensePlate;
    }

    @Override
    public String getType() {
        return "Terrestre";
    }

    @Override
    public double calculateTravelTime() {
        return getDistance() / 100; // Velocidade média de 100 km/h
    }

    @Override
    public String generateReport() {
        return "*Relatório de Transporte Terrestre*\n" +
                "ID: " + getId() + "\n" +
                "Matrícula: " + getLicensePlate() + "\n" +
                "Peso: " + getWeight() + " kg\n" +
                "Distância: " + getDistance() + " km\n" +
                "Tempo de Viagem: " + calculateTravelTime() + " horas\n" +
                "Taxa: " + calculateFee() + "€";
    }

    @Override
    public double calculateFee() {
        return getWeight() * getDistance() * 0.03;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}