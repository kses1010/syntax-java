package syntax.chapter12.page698;

public class EnumEx3 {
    public static void main(String[] args) {
        System.out.println("버스 요금 : " + Transportation.BUS.fare(100));
        System.out.println("기차 요금 : " + Transportation.TRAIN.fare(200));
        System.out.println("선박 요금 : " + Transportation.SHIP.fare(300));
        System.out.println("비행 요금 : " + Transportation.PLAIN.fare(400));
    }
}
