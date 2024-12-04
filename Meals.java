public class Meals {
    private String name;
    private double price;
    private int calories;
    private int fat;
    private int carbs;
    private int protein;
    // Constructor to initialize the name, price, and nutritional info of the meal
    public Meals(String name, double price, int calories, int fat, int carbs, int protein) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.fat = fat;
        this.carbs = carbs;
        this.protein = protein;
    }
    // Getter for the meal name
    public String getName() {
        return name;
    }
 
 
    // Getter for the meal fat
 
 
    public int getFat() {
        return fat;
    }
 
 
    // Getter for the meal calories
 
 
    public int getCalories() {
        return calories;
    }
 
 
    // Getter for the meal carbs
 
 
    public int getCarbs() {
        return carbs;
    }
 
 
    // Getter for the meal protein
 
 
    public int getProtein() {
        return protein;
    }
    // Getter for the meal price
    public double getPrice() {
        return price;
    }
    // Getter for the meal's nutritional information
    public String getNutritionalInfo() {
        return name + " contains " + calories + " calories, " + fat + "g of fat, " +
                carbs + "g of carbs, and " + protein + "g of protein.";
    }
    // Getter for price information
    public String getPriceInfo() {
        return name + " is $" + price + ".";
    }
 } 