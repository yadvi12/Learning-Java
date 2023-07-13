package Final_keyword;

public class B extends A {
    // Whenever we mark a variable as final, then reassignment is not possible.
    //private int x = 5;
    private final int x;
  /*  public B() {
        super();
    }*/

    public B(int x) {
        super();
        this.x = x;
    }

    public int getX() {
        return x;
    }

    /*public void setX(int x) {
        this.x = x;
    }*/
}
