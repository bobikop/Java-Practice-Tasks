package BobanNOTES.Constructor;

public class Main {

    public static void main(String[] args) {


        Animal dog = new Animal("Maki",41,25, "black", "LB");


        int weightInLbs = dog.getWeightInLbs();


        System.out.println(weightInLbs);

    }
}
