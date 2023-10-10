public class Salad {
    private Vegetable[] vegetables;

    public Salad(Vegetable[] vegetables){
        this.vegetables = vegetables;
    }

    public double calculateTotalCalories(){
        double totalCalories = 0;
        for (Vegetable veg : vegetables){
            totalCalories += veg.calculateCalories();
        }
        return totalCalories;
    }

    public Vegetable findMostCaloricVegetable(){
        Vegetable mostCaloric = null;
        double maxCalories = 0;
        for (Vegetable veg : vegetables){
            if (veg.calculateCalories() > maxCalories){
                maxCalories = veg.calculateCalories();
                mostCaloric = veg;
            }
        }
        return mostCaloric;
    }

    public String getNameOfMostCaloricVegetable(){
        Vegetable mostCaloricVegetable = findMostCaloricVegetable();
        if (mostCaloricVegetable != null){
            return mostCaloricVegetable.getName();
        }else{
            return "Нет данных";
        }
    }
}
