package Local_inner_classes;

public class Door {
    public boolean isLocked(String key) {
        // local inner class
        class Lock {
            public boolean isLocked(String key) {
                if (key.equals("qwerty")) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return new Lock().isLocked(key);
    }
}
