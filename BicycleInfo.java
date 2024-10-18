public class BicycleInfo {

    public static void main(String[] args) {

        
        Bicycle bicycle1 = new Bicycle();
        bicycle1.brand = "Giant";
        bicycle1.type = "Mountain";
        bicycle1.numberOfGears = 21;
        bicycle1.price = 750.00;

        System.out.println("Bicycle Brand: " + bicycle1.brand);
        System.out.println("Type: " + bicycle1.type);
        System.out.println("Number Of Gears: " + bicycle1.numberOfGears);
        System.out.println("Bicycle Price: " + bicycle1.price);
        System.out.println("---------------------------------------------------------");

        
        Bicycle bicycle2 = new Bicycle();
        bicycle2.brand = "Trek";
        bicycle2.type = "Road";
        bicycle2.numberOfGears = 18;
        bicycle2.price = 1200.00;

        System.out.println("Bicycle Brand: " + bicycle2.brand);
        System.out.println("Type: " + bicycle2.type);
        System.out.println("Number Of Gears: " + bicycle2.numberOfGears);
        System.out.println("Bicycle Price: " + bicycle2.price);
        System.out.println("---------------------------------------------------------");

        
        Bicycle bicycle3 = new Bicycle("Specialized", "Hybrid", 24, 950.00);
        Bicycle bicycle4 = new Bicycle("Cannondale", "Gravel", 22, 1350.00);
        Bicycle bicycle5 = new Bicycle("Santa Cruz", "Mountain", 27, 2000.00);
        Bicycle bicycle6 = new Bicycle("Bianchi", "Road", 20, 1800.00);
        Bicycle bicycle7 = new Bicycle("Scott", "Cyclocross", 25, 2200.00);
        Bicycle bicycle8 = new Bicycle("Merida", "City", 7, 400.00);
        Bicycle bicycle9 = new Bicycle("Cervelo", "Triathlon", 18, 3000.00);

        bicycle3.bicycleDetails();
        System.out.println("*********************************************************");
        bicycle4.bicycleDetails();
        System.out.println("*********************************************************");
        bicycle5.bicycleDetails();
        System.out.println("*********************************************************");
        bicycle6.bicycleDetails();
        System.out.println("*********************************************************");
        bicycle7.bicycleDetails();
        System.out.println("*********************************************************");
        bicycle8.bicycleDetails();
        System.out.println("*********************************************************");
        bicycle9.bicycleDetails();
    }
}