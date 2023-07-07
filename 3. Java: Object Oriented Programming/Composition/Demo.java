package Composition;

public class Demo {
    public static void main(String args[]) {
        /*Laptop dell = new Laptop();
        System.out.println(dell);
        System.out.println(dell.getProcessor());
        System.out.println(dell.getProcessor().getBrand());*/

        Processor processor = new Processor("Intel", "7200U", 7, 4, 4, "6 MB", "2.5 Ghz", "2.5 Ghz", "3.1 Ghz");
        GraphicsCard graphicsCard = new GraphicsCard("Nvidia", 1050, "4 GB");
        Laptop gamingLaptop = new Laptop(17f, processor, "DDR4", "2 TB", graphicsCard, null, "backlit");
        System.out.println(gamingLaptop);

        gamingLaptop.gamingMode();
        System.out.println("Gaming Mode Enabled!");
        System.out.println(gamingLaptop.getProcessor().getFrequency());
    }
}
