package ch7_oop2;


class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // (1) 배열 SutdaCard를 적절히 초기화 하시오.
        for (int i=0; i<CARD_NUM; i++) {
            if (i<10) {
                if (i==0 || i==2 || i==7) {
                    cards[i] = new SutdaCard(i+1,true);
                } else {
                    cards[i] = new SutdaCard(i+1,false);
                }
            } else {
                cards[i] = new SutdaCard(i-9,false);
            }
        }

//        for (int i=0; i< cards.length; i++) {
//            int num = i%10+1;
//            boolean isKwang = (i<10) && (num==1||num==3||num==8);
//            cards[i] = new SutdaCard(num,isKwang);
//        }
    }
}

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

    // info() 대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K":"");
    }
}

class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i=0; i<deck.cards.length; i++) {
            System.out.println(deck.cards[i]+",");
        }
    }
}
