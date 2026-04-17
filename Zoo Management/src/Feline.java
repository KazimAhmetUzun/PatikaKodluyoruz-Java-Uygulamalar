public class Feline extends Animal {

    public Feline(String speciesName, double weight, int age) {
        super(speciesName, weight, age);
    }

    @Override
    public String getDosage() {
        return "Feline dosage: " + (weight * 0.20) + " mg";
    }

    @Override
    public String getFeedSchedule() {
        return "Feline feeding schedule: 2 times a day";
    }
}