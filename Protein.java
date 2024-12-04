public class Protein {
    private String name;
    private int fat;
    private int protein;
    private int carbs;

    public Protein(String name, int fat, int protein, int carbs) {
        this.name = name;
        this.fat = fat;
        this.protein = protein;
        this.carbs = carbs;
    }

    public String getName() {
        return name;
    }

    public int getFat() {
        return fat;
    }

    public int getProtein() {
        return protein;
    }

    public int getCarbs() {
        return carbs;
    }

    public String getNutritionalInfo() {
        return name + " contains " + fat + "g of fat, " + carbs + "g of carbs, and " + protein + "g of protein.";
    }
}