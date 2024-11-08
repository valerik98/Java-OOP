package ShoppingSpree;

public class Product {
    private String name;

    private double cost;

    public Product(String name, double cost) {
        setCost(cost);
        setName(name);
    }

    public String getName () {
        return this.name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank() || name.trim().isBlank()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getCost () {
        return this.cost;

    }

    public void setCost(double cost) {
        if (cost<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }

    public String toString() {
        return this.name;
    }
}