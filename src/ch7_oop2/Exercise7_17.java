package ch7_oop2;

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {}
}

class Marine extends Unit {
    void move(int x, int y) {}
    void changeMode() {}
}

class Dropship extends Unit {
    void move(int x, int y) {}
    void load() {}
    void unload() {}
}

public class Exercise7_17 {
}
