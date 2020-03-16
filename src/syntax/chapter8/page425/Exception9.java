package syntax.chapter8.page425;

public class Exception9 {
    public static void main(String[] args) {
        try {
            throw new Exception("고의로 발생시킴.");
        } catch (Exception e) {
            System.out.println("에러메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
