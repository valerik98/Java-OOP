package WorkingWithAbstraction.Exercises.CardsWithPower;

public enum Suit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

//    public String toString() {
//        return String.format("Ordinal value: %d; Name value: %s",
//                this.ordinal(), this.name());
//    }
    private int power;

    Suit(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }
}
