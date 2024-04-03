
/**
 * Escreva uma descrição da classe l aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public abstract class Transporte {

    private String id;
    private double weight;
    private double distance;

    public Transporte(String id, double weight, double distance) {
        this.id = id;
        this.weight = weight;
        this.distance = distance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public abstract double calculateFee();

    @Override
    public String toString() {
        return "Transporte{" +
                "id='" + id + '\'' +
                ", weight=" + weight +
                ", distance=" + distance +
                '}';
    }

    public abstract String getType();

    public abstract double calculateTravelTime();

    public abstract String generateReport();
}
