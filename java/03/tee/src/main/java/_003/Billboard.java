package _003;

public class Billboard {

    private final Display display;

    public Billboard(Display display) {
        this.display = display;
    }

    public void greet(String person) {
        display.show("Hello %s, hope you have a great day".formatted(person));
    }

    public void warn(String topic) {
        display.show("❗%s Warning❗".formatted(topic));
    }

    public void happyNewYear(int year) {
        display.show("Happy New Year!\n%d".formatted(year));
    }
}
