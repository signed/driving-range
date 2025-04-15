package _003.movies;

import _003.Billboard;

import static _003.Billboard.happyNewYear;
import static _003.Messages.greet;
import static _003.Messages.warn;

public class Armageddon {

    public void playback(Billboard billboard) {
        billboard.message(happyNewYear(1998));
        billboard.message(greet("Harry"));
        billboard.message(greet("A.J."));
        billboard.message(warn("Asteroid"));
        billboard.message(greet("Grace"));
        billboard.message(greet("Dan"));
        billboard.message(greet("Chick"));
        billboard.message(greet("Rockhound"));
        billboard.message(greet("Oscar"));
        billboard.message(greet("Bear"));
        billboard.message(greet("Colonel Sharp"));
        billboard.message(warn("Nuke"));
    }
}
