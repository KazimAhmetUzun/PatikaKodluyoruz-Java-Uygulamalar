public class Main {
    public static void main(String[] args) {
        Animal horse = new Horse("Zebra", 320.5, 8);
        Animal feline = new Feline("Tiger", 210.0, 5);
        Animal rodent = new Rodent("Beaver", 18.0, 3);

        System.out.println(horse.getSpeciesName());
        System.out.println(horse.getDosage());
        System.out.println(horse.getFeedSchedule());

        System.out.println();

        System.out.println(feline.getSpeciesName());
        System.out.println(feline.getDosage());
        System.out.println(feline.getFeedSchedule());

        System.out.println();

        System.out.println(rodent.getSpeciesName());
        System.out.println(rodent.getDosage());
        System.out.println(rodent.getFeedSchedule());
    }
}