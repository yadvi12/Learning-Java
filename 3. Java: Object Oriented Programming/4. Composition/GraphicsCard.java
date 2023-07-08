package Composition;

public class GraphicsCard {
    private String brand;
    private int series;
    private String memory;

    public GraphicsCard() {
        this.brand = "Nvidia";
        this.series = 940;
        this.memory = "2 GB";
    }

    public GraphicsCard(String brand, int series, String memory) {
        this.brand = brand;
        this.series = series;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public int getSeries() {
        return series;
    }

    public String getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "brand='" + brand + '\'' +
                ", series=" + series +
                ", memory='" + memory + '\'' +
                '}';
    }
}
