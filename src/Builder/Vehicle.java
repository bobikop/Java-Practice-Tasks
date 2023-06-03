package Builder;

public class Vehicle {

    private String name;
    private Integer crew;
    private Double fuel;
    private String destination;
    private String cargo;


    protected Vehicle(String name, Integer crew, Double fuel, String destination, String cargo) {
        this.name = name;
        this.crew = crew;
        this.fuel = fuel;
        this.destination = destination;
        this.cargo = cargo;
    }

    public String getName() {
        return name;
    }

    public Integer getCrew() {
        return crew;
    }

    public Double getFuel() {
        return fuel;
    }

    public String getDestination() {
        return destination;
    }

    public String getCargo() {
        return cargo;
    }

    // we need to override toString method in order we can see print in our runner main class
    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", crew=" + crew +
                ", fuel=" + fuel +
                ", destination='" + destination + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
