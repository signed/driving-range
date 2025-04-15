package _003;

public class Billboard {

    public static String happyNewYear(int year) {
        return "Happy New Year!\n%d".formatted(year);
    }

    private final Display display;

    public Billboard(Display display) {
        this.display = display;
    }

    public void accept(String message) {
        display.show(message);
    }
}
