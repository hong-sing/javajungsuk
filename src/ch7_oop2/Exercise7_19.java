package ch7_oop2;

import java.util.Arrays;

public class Exercise7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv1());
        b.buy(new Computer());
        b.buy(new Tv1());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product1[] cart = new Product1[3];  // 구입한 제품을 저장하기 위한 배열
    int i = 0;  // Product배열 cart에 사용될 index

    void buy(Product1 p) {
        if (p.price>money) {
            System.out.println("잔액이 부족하여 " + p + "을/를 살수 없습니다.");
            return;
        }
        money -= p.price;
        add(p);
    }

    void add(Product1 p) {
        if (i>=cart.length) {
            Product1[] newCart = Arrays.copyOf(cart, cart.length*2);
            cart = newCart;
        }
        cart[i] = p;
        i++;
        // cart[i++]=p; 위 두 줄을 하나로
    }

    void summary() {
        String result = "구입한 물건:";
        int sum = 0;
        for (int i=0; i< cart.length; i++) {
            if (cart[i]==null) break;
            result += cart[i] + ",";
            sum += cart[i].price;
        }
        System.out.println(result);
        System.out.println("사용한 금액:"+sum);
        System.out.println("남은 금액:"+money);
    }
}

class Product1 {
    int price;

    Product1(int price) {
        this.price = price;
    }
}

class Tv1 extends Product1 {
    Tv1() { super(100); }

    public String toString() { return "Tv"; }
}

class Computer extends Product1 {
    Computer() { super(200); }

    public String toString() { return "Computer"; }
}

class Audio extends Product1 {
    Audio() { super(50); }

    public String toString() { return "Audio"; }
}
