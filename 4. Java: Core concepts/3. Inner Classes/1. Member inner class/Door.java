package Inner_classes;

public class Door {
    private Lock lock;

    public Door() {
        lock = new Lock(true);
    }

    public Lock getLock() {
        return lock;
    }

    public void shopStatus() {
        if (lock.isLock()) {
            System.out.println("Shop is closed, please come after sometime!");
        } else {
            System.out.println("You are welcome, we are available!");
        }
    }

    // inner class - Lock class is created inside Door class
    public class Lock {
        private boolean lock;

        public Lock(boolean lock) {
            this.lock = lock;
        }

        public boolean isLock() {
            return lock;
        }

        public void setLock(boolean lock) {
            this.lock = lock;
        }
    }
}
