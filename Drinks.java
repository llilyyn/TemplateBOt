public class Drinks {
    private String name;
    private int sugar;
    private int calories;
 
 
    public Drinks(String name, int sugar, int calories) {
        this.name = name;
        this.sugar = sugar;
        this.calories = calories;
    }
 
 
    public String getName() {
        return name;
    }
 
 
    public int getSugar() {
        return sugar;
    }
 
 
    public int getCalories() {
        return calories;
    }
 
 
    public String getNutritionalInfo() {
        return name + " has " + calories + " calories and " + sugar + "g of sugar.";
    }
 } 