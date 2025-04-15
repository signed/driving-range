package _003.movies;

import _003.Billboard;

import static _003.Billboard.happyNewYear;
import static _003.Messages.greet;
import static _003.Messages.warn;

public class PromisingYoungWoman {
    public void playback(Billboard billboard) {
        billboard.message(happyNewYear(2020));
        billboard.message(greet("Cassandra"));
        billboard.message(greet("Ryan"));
        billboard.message(warn("Smart and Cunning"));
    }
}
