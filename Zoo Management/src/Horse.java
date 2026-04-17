public class Horse extends Animal {

    public Horse(String speciesName, double weight, int age) {
        super(speciesName, weight, age);
    }

    @Override
    public String getDosage() {
        return "Horse dosage: " + (weight * 0.10) + " mg";
    }

    @Override
    public String getFeedSchedule() {
        return "Horse feeding schedule: 3 times a day";
    }
}