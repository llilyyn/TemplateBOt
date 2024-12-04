public class Toppings {
    private String name;
    private int fat;
    private int carbs;
    private int protein;
 
 
    public Toppings(String name, int fat, int carbs, int protein) {
        this.name = name;
        this.fat = fat;
        this.carbs = carbs;
        this.protein = protein;
    }
 
 
    public String getName() {
        return name;
    }
 
 
    public int getFat() {
        return fat;
    }
 
 
    public int getCarbs() {
        return carbs;
    }
 
 
    public int getProtein() {
        return protein;
    }
 
 
    public String getNutritionalInfo() {
        return name + " contains " + fat + "g of fat, " + carbs + "g of carbs, and " + protein + "g of protein.";
    }
 } 