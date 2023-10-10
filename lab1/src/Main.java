// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vegetable tomato = new Vegetable("Помидор", 18, 150);
        Vegetable cucumber = new Vegetable("Огурец", 16, 100);
        Vegetable carrot = new Vegetable("Морковь", 41, 75);
        Vegetable lettuce = new Vegetable("Латук", 5, 200);
        Vegetable broccoli = new Vegetable("Брокколи", 55, 80);

        Vegetable[] vegetables = {tomato, cucumber, carrot, lettuce, broccoli};
        Salad salad = new Salad(vegetables);

        double totalCalories = salad.calculateTotalCalories();
        String mostCaloricVegetableName = salad.getNameOfMostCaloricVegetable();

        System.out.println("Общая калорийность салата: " + totalCalories);
        System.out.println("Самый калорийный овощ: " + mostCaloricVegetableName);
    }
}
