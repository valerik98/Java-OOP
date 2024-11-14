package CarShop;

public class Seat extends BaseCar implements Sellable{
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;
    private Double price;

    public Seat(String model,String color, Integer horsePower,
                String countryProduced, Double price){
        super(model,color,horsePower,countryProduced);
        this.price = price;
    }
    public Double getPrice(){
        return this.price;
    }
    public String toString() {
        return String.format(super.toString() + "\nLeon sells for %f", getPrice());
    }
}
