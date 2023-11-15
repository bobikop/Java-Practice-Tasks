package BobanNOTES.Constructor;

public class Animal {

    public String name;
    public int age;
    public int weight;
    public String color;

    public String weightUnits;

    private int weightInLbs;


    public Animal(String name, int age, int weight, String color, String weightUnits) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.weightUnits = weightUnits;

        if ("KG".equals(weightUnits)){
            this.weightInLbs = (int) (this.weight * 2.20462);
        }else{
            this.weightInLbs = weight;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeightInLbs() {
        return weightInLbs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;

        if (getAge() != animal.getAge()) return false;
        if (getWeight() != animal.getWeight()) return false;
        if (getWeightInLbs() != animal.getWeightInLbs()) return false;
        if (getName() != null ? !getName().equals(animal.getName()) : animal.getName() != null) return false;
        return getColor() != null ? getColor().equals(animal.getColor()) : animal.getColor() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        result = 31 * result + getWeight();
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + getWeightInLbs();
        return result;
    }


}
