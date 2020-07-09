package syntax.chapter11.page641;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }

        // TreeSet은 저장할 때 이미 정렬함. 정렬 코드를 넣을 필요가 없다.
        System.out.println(set);
    }
}
