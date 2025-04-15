package _003.movies;

import _003.Billboard;

import static _003.Billboard.happyNewYear;
import static _003.Messages.greet;
import static _003.Messages.warn;

public class Terminator {

    public void playback(Billboard billboard) {
        billboard.message(happyNewYear(1984));
        billboard.message(greet("Sarah"));
        billboard.message(warn("Terminator"));
        billboard.message(greet("John"));
        billboard.message(warn("Molten Metal"));
    }
}
