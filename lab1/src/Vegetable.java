public class Vegetable {
    private String name;
    private double calories;
    private double weight;

    public Vegetable(String name, double calories, double weight){
        this.name = name;
        this.calories = calories;
        this.weight = weight;
    }

    public double calculateCalories(){
        return (calories * weight) / 100;
    }

    public String getName(){
        return name;
    }

    public double getCalories(){
        return calories;
    }

    public double getWeight(){
        return weight;
    }
}
