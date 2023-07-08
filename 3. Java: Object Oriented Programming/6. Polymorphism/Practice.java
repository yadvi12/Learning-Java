package Polymorphism;

public class Practice {
    public static void main(String args[]) {
        /*Phone phone = new Phone("Nokia 3310");
        System.out.println(phone.getModel());
        phone.features();

        SamsungNote8 note8 = new SamsungNote8("Note 8");
        System.out.println(note8.getModel());
        note8.features();*/

//        Phone nokia3310 = new Nokia("Nokia 3310");
        Phone nokia3310 = new Practice().getPhone(1);
        System.out.println(nokia3310.getModel());
        nokia3310.features(); // application of polymorphism

//        Phone note8 = new Samsung("Note 8");
        Phone note8 = new Practice().getPhone(2);
        System.out.println(note8.getModel());
        note8.features(); // application of polymorphism
    }

    public Phone getPhone(int dailyDriver) {
        switch (dailyDriver) {
            case 1:
                return new Nokia("3310");
            case 2:
                return new Samsung("Note 5");
        }
        return null;
    }
}
