package ch6_oop;

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x, int y) {
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }
}
