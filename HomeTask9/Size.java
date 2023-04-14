package HomeTask9;

public enum Size {
    SMALL("S", 20, 5),
    MEDIUM("M", 30, 10),
    LARGE("L", 40, 20),
    EXTRA_LARGE("XL", 50, 30);

    private String shortSizeName;
    private int width;
    private int height;

    Size(String shortSizeName, int width, int height) {
        this.shortSizeName = shortSizeName;
        this.width = width;
        this.height = height;
    }

    public String getShortSizeName() {
        return shortSizeName;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        String template = "%s size: height = %d width = %d";
        return String.format(template, this.shortSizeName, this.height, this.width);
//        return shortSizeName + " size: height = " + height + " width = " + width;

    }
}
