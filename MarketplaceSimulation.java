interface Sellable {
    void displayItemDetails();
    double getPrice();
}

abstract class Product implements Sellable {
    String name;
    String category;
    double price;

    Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    abstract double calculateDiscount();

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Item: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }
}

class ElectronicItem extends Product {

    ElectronicItem(String name, double price) {
        super(name, "Electronics", price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.10;
    }
}

class ClothingItem extends Product {

    ClothingItem(String name, double price) {
        super(name, "Clothing", price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.20;
    }
}

public class MarketplaceSimulation {
    public static void main(String[] args) {
        Product laptop = new ElectronicItem("Laptop", 50000);
        Product tshirt = new ClothingItem("T-Shirt", 2000);

        laptop.displayItemDetails();
        double laptopDiscounted = laptop.getPrice() - laptop.calculateDiscount();
        System.out.println("Discounted Price: " + laptopDiscounted);

        System.out.println();

        tshirt.displayItemDetails();
        double tshirtDiscounted = tshirt.getPrice() - tshirt.calculateDiscount();
        System.out.println("Discounted Price: " + tshirtDiscounted);
    }
}
