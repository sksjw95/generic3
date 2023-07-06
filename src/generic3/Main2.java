package generic3;

public class Main2 {
    public static void main(String[] args) {
        /// 특정 클래스를 상속받으면서 동시에 특정 인터페이스를 구현한 클래스만 타입으로 지정할수 있도록
        // 제한하려면 아래와 같이 &를 사용하여 코드를 작성
        // 다만, 이러한 경우 클래스를 인터페이스보다 앞에 위치시켜야한다.
        Basket2<Flower> flowerBasket = new Basket2<>();
        Basket2<Rose> roseBasket = new Basket2<>();

    }
}