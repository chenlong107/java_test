package String_Test;

/**
 * @Auther: chenlong
 * @Date: 2022/04/20/17:01
 * @Description:
 */
public class String_Test {
    public static void main(String[] args) {
        int a = 65;
        char b = 65;
        double c = 65.0;
        char d = 'A';

        System.out.println(a == b);//true
        System.out.println(a == c);//true
        System.out.println(a == d);//true
        System.out.println(b == c);//true
        System.out.println(c == d);//true

        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1 == o2);//false

        System.out.println(o1.equals(o2));

//        String str1 = new String("chenlong");
//        String str2 = new String("chenlong");
//        System.out.println(str1.equals(str2));//true

        String str1 = "chenlong";
        String str2 = "chenlong";
        String str3 = new String("chenlong");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);


    }
}
