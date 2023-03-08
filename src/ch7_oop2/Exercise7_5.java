package ch7_oop2;

class Product {
    int price;
    int bonusPoint;

//    Product() {}

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product {
    Tv() {}

    public String toString() {
        return "Tv";
    }
}

class Exercise7_5 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}

/*
 Product를 상속받았기 때문에 생성자 Tv()가 호출되면 Product의 기본생성자가 호출된다.
 하지만 Product에는 기본생성자가 없기 때문에 에러가 발생한다. 따라서 Product의 기본생성자를 추가해야한다.

*/