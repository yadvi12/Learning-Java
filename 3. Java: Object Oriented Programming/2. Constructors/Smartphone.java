public class Smartphone {
    private String brand = "Samsung";

    // default constructor looks like below
    /*public Smartphone() {

    }*/

    // if we add our own constructor, then Java will overwrite the default constructor
    public Smartphone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
