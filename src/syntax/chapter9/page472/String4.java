package syntax.chapter9.page472;

import java.util.Arrays;
import java.util.StringJoiner;

public class String4 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        System.out.println(Arrays.toString(arr));

        System.out.println(String.join(" ", arr));

        StringJoiner sj = new StringJoiner("/", "[", "]");
        for (String s: arr) {
            sj.add(s);
        }

        System.out.println(sj.toString());
    }
}
