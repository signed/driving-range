package _003.movies;

import _003.Billboard;

import static _003.Billboard.happyNewYear;
import static _003.Messages.greet;
import static _003.Messages.warn;

public class Armageddon {

    public void playback(Billboard billboard) {
        billboard.accept(happyNewYear(1998));
        billboard.accept(greet("Harry"));
        billboard.accept(greet("A.J."));
        billboard.accept(warn("Asteroid"));
        billboard.accept(greet("Grace"));
        billboard.accept(greet("Dan"));
        billboard.accept(greet("Chick"));
        billboard.accept(greet("Rockhound"));
        billboard.accept(greet("Oscar"));
        billboard.accept(greet("Bear"));
        billboard.accept(greet("Colonel Sharp"));
        billboard.accept(warn("Nuke"));
    }
}
