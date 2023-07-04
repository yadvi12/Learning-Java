public class loops {
    public static void main(String args[]) {

        // for loop
        /*for(int i = 1; i <= 10; i++){
            System.out.print("Value of i: ");
            System.out.println(i);
        }*/

        // while loop
        /*int j = 1;
        while(j <= 10) {
            System.out.println(j);
            j++;
        }*/

        /*while(true){
            System.out.println("Infinite Loop");
            break;
        }*/

        // do while loop
        // Here the loop will get executed at least for 1 time even if the condition is not true.
        /*int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);*/

        /*for (int i = 1, j = 1; i < 10 || j < 10; i++, j++) {
            j++;
            System.out.println("i = " + i + " and j = " + j);
        }*/

        /*int i = 1, j = 1;
        while (i < 10 || j < 10) {
            i++;
            j++;
            System.out.println("i = " + i + " and j = " + j);
        }*/

        int i = 1, j = 1;
        do {
            i++;
            j++;
            System.out.println("i = " + i + " and j = " + j);
        } while (i < 10 || j < 10);

    }
}
