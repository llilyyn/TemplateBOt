public class Dips {
    private String name;
    private int calories;
    private int fat;

    public Dips(String name, int calories, int fat) {
        this.name = name;
        this.calories = calories;
        this.fat = fat;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public String getNutritionalInfo() {
        return name + " has " + calories + " calories and " + fat + "g of fat.";
    }
}