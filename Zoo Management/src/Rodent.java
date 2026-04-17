public class Rodent extends Animal {

    public Rodent(String speciesName, double weight, int age) {
        super(speciesName, weight, age);
    }

    @Override
    public String getDosage() {
        return "Rodent dosage: " + (weight * 0.05) + " mg";
    }

    @Override
    public String getFeedSchedule() {
        return "Rodent feeding schedule: 4 times a day";
    }
}