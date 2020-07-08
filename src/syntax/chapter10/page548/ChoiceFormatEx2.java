package syntax.chapter10.page548;

import java.text.ChoiceFormat;

public class ChoiceFormatEx2 {
    public static void main(String[] args) {
        String pattern = "60#D|70#C|80<B|90#A";
        int[] scores = {91, 90, 88, 70, 80, 52, 60};

        ChoiceFormat form = new ChoiceFormat(pattern);

        for (int score : scores) {
            System.out.println(score + ":" + form.format(score));
        }
    }
}
