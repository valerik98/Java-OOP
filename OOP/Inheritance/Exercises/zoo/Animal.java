package zoo;

public class Animal {
    private String name;

    public Animal(String name) {
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
