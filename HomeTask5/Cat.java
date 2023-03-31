package HomeTask5;

public class Cat extends Animal {
    private String color;

    public Cat(boolean isVegetarian, String nutrition, int legsCount) {
        super(isVegetarian, nutrition, legsCount);
        this.color = "blue";
    }

    public Cat(boolean isVegetarian, String nutrition, int legsCount, String color) {
        super(isVegetarian, nutrition, legsCount);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
