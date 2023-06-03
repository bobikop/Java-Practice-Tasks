package Builder;

public class VehicleBuilder {

    private String name;
    private Integer crew;
    private Double fuel;
    private String destination;
    private String cargo;


    public Vehicle build(){
        // we can validate here for example crew size
        //we can validate any of bellow constructors
        if(crew <= 0)
            throw new IllegalStateException("Missing crew members" + crew);
        return new Vehicle(name, crew, fuel, destination, cargo);
    }


    // create method for each property so we can create our object with any argument we need
    public VehicleBuilder name( String name){
        this.name = name;
        return this;
    }
    public VehicleBuilder crew( Integer crew){
        this.crew = crew;
        return this;
    }
    public VehicleBuilder fuel( Double fuel){
        this.fuel = fuel;
        return this;
    }
    public VehicleBuilder destination( String destination){
        this.destination = destination;
        return this;
    }
    public VehicleBuilder cargo( String cargo){
        this.cargo = cargo;
        return this;
    }

    @Override
    public String toString() {
        return "VehicleBuilder{" +
                "name='" + name + '\'' +
                ", crew=" + crew +
                ", fuel=" + fuel +
                ", destination='" + destination + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
