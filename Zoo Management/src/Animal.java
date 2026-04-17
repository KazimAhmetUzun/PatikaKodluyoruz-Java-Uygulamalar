public abstract class Animal {
    protected String speciesName;
    protected double weight;
    protected int age;

    public Animal(String speciesName, double weight, int age) {
        this.speciesName = speciesName;
        this.weight = weight;
        this.age = age;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public abstract String getDosage();
    public abstract String getFeedSchedule();
}