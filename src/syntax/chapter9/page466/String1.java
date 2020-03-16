package syntax.chapter9.page466;

public class String1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println("String str1 = " + str1);
        System.out.println("String str2 = " + str2);
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 == str2 : " + str1.equals(str2));

        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println("String str3 = " + str3);
        System.out.println("String str4 = " + str4);
        System.out.println("str1 == str2 : " + (str3 == str4));
        System.out.println("str1 == str2 : " + str3.equals(str4));


    }
}
