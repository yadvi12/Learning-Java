package Local_inner_classes;

public class Shop {
    public static void main(String args[]) {
        Door door = new Door();
        if (door.isLocked(args[0])) {
            System.out.println("Shop is closed, please visit later!");
        } else {
            System.out.println("Welcome, we are open!");
        }
        //System.out.println(door.isLocked("test"));
    }
}
