package Builder.demo;

import Builder.Vehicle;
import Builder.VehicleBuilder;

public class VehicleBuilderDemo {

    public static void main(String[] args) {


        // we can't create new vehicle here since we have protected constructor in vehicle class which is available only at the same package
        // for this reason we will use our builder
//        Vehicle car = new Vehicle("zuti", 1215,2.56,"leskovac","Jabuke");



        // Create first vehicle
        Vehicle myVehicle = new VehicleBuilder()
                .cargo("Bananas")
                .crew(200)
                .fuel(5.56)
                .destination("Kopasnica")
                .build();


        // create second vehicle
        Vehicle bike = new VehicleBuilder()
                .name("Tricikl")
                .crew(2)
                .destination("Stratosohere")
                .build();

        System.out.println("This is my vehicle" + myVehicle);
        System.out.println("This is my vehicle" + bike);


    }
}
