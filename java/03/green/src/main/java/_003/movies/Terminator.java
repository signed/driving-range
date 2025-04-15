package _003.movies;

import _003.Billboard;

import static _003.Billboard.happyNewYear;
import static _003.Messages.greet;
import static _003.Messages.warn;

public class Terminator {

    public void playback(Billboard billboard) {
        billboard.accept(happyNewYear(1984));
        billboard.accept(greet("Sarah"));
        billboard.accept(warn("Terminator"));
        billboard.accept(greet("John"));
        billboard.accept(warn("Molten Metal"));
    }
}
