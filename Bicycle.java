class Bicycle {
    String brand;
    String type;
    int numberOfGears;
    double price;

    
    public Bicycle() {
        System.out.println("No parameterized constructor");
    }

    
    public Bicycle(String brand, String type, int numberOfGears, double price) {
        this.brand = brand;
        this.type = type;
        this.numberOfGears = numberOfGears;
        this.price = price;
    }

    
    public static void rentBicycle() {
    
    }

    public static void serviceBicycle() {
       
    }

    public static void sellBicycle() {
        
    }

    
    public void bicycleDetails() {
        System.out.println("Bicycle Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Number of Gears: " + numberOfGears);
        System.out.println("Price: " + price);
    }
}