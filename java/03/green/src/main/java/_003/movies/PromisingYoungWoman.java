package _003.movies;

import _003.Billboard;

import static _003.Billboard.happyNewYear;
import static _003.Messages.greet;
import static _003.Messages.warn;

public class PromisingYoungWoman {
    public void playback(Billboard billboard) {
        billboard.accept(happyNewYear(2020));
        billboard.accept(greet("Cassandra"));
        billboard.accept(greet("Ryan"));
        billboard.accept(warn("Smart and Cunning"));
    }
}
