package _003;

public class Messages {
    public static String greet(String person) {
        return "Hello %s, hope you have a great day".formatted(person);
    }

    public static String warn(String topic) {
        return "❗%s Warning❗".formatted(topic);
    }
}
