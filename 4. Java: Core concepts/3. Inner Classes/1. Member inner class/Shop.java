package Inner_classes;

public class Shop {
    public static void main(String args[]) {
        Door door = new Door();
        door.shopStatus();
        door.getLock().setLock(false);
        door.shopStatus();
    }
}
