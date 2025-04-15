package _003.movies;

import _003.Billboard;

import static _003.Billboard.happyNewYear;
import static _003.Messages.greet;

public class TheWolfOfWallStreet {

    public void playback(Billboard billboard) {
        billboard.accept(happyNewYear(2013));
        billboard.accept(greet("Jordan"));
        billboard.accept(greet("Donnie"));
    }
}
