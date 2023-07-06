package generic3;

public class Main {
    public static void main(String[] args) {
        // 특정 인터페이스를 구현한 클래스만 타입으로 지정할 수 있도록 제한할 수도 있습니다.
        // 이 경우 동일하게 extends 키워드를 사용한다.
        Basket<Flower> flowerBasket = new Basket<>();
        Basket<Rose> roseBasket = new Basket<>();

    }
}