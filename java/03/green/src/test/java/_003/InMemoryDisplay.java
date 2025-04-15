package _003;

import java.util.ArrayList;
import java.util.List;

class InMemoryDisplay implements Display {

    private final List<String> messages = new ArrayList<>();

    @Override
    public void show(String message) {
        messages.add(message);
    }

    public List<String> shownMessages() {
        return messages;
    }
}
