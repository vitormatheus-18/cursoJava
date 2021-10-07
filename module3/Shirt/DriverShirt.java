public class DriverShirt {
    public static void main(String[] args) {
        Shirt shirt = new Shirt("Shirt black", 4123, 49.99);
        System.out.println(shirt.Display());

        Shirt shirt2 = new Shirt("T-shirt Sport Recife");
        System.out.println(shirt2.DisplayDescription());
    }
}