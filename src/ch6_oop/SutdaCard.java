package ch6_oop;

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    String info() {
        num = this.num;
        isKwang = this.isKwang;
        if (isKwang==true) {
            return num+"K";
        } else {
            return num + "";
        }
        // return num + ( isKwang ? "K" : "");
    }
}
