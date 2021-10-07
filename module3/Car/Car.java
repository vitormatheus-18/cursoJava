public class Car {
    public String Brand;
    public int ColorCode;
    public double Price;

    public Car() {}

    public Car(String brand, int colorCode, double price) {
        Brand = brand;
        ColorCode = colorCode;
        Price = price;
    }

    public String Honk() {
        return "Bi bi!";
    }

    public String Display() {
        return "Brand: " + Brand +
                "| Color Code: " + ColorCode +
                "| Price: " + Price;
    }
}