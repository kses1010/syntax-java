package syntax.chapter11.page629;

import java.util.Arrays;

public class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println(Arrays.toString(strArr));
    }
}
