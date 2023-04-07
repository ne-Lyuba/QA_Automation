package HomeTask5;

public class Animal {
    private boolean isVegetarian;
    private String nutrition;
    private int legsCount;

    public Animal() {
    }

    public Animal(boolean isVegetarian, String nutrition, int legsCount) {
        this.isVegetarian = isVegetarian;
        this.nutrition = nutrition;
        this.legsCount = legsCount;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public String getNutrition() {
        return nutrition;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }
}
