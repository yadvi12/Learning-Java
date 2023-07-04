import java.util.Locale;

public class Switch {
    public static void main(String args[]) {
        String name = "Author";
        switch (name.toLowerCase()) {
            case "author":
                System.out.println("Yadvi");
                break;
            case "team":
                System.out.println("Team");
                break;
            case "editor":
                System.out.println("Editor");
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
    }
}
