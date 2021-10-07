public class Shirt {
    private String Description;
    private int ColorCode;
    private double Price;

    public Shirt() {}

    public Shirt(String description, int colorCode, double price) {
        Description = description;
        ColorCode = colorCode;
        Price = price;
    }

    public Shirt(String description) {
        Description = description;
    }

    public String Display() {
        String display = "Description: " + Description + "| Color Code: " + ColorCode + "| Price: " + Price;
        return display;
    }

    public String DisplayDescription() {
        String description = "Description: " + Description;
        return description;
    }
}