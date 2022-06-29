package pl.javastart.overriden;

class Course {
    private String name;
    private String description;
    private double price;

    public Course(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Nazwa: %s, opis: %s, cena: %.2fzł".formatted(name, description, price);
    }
}
