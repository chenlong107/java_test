package Generic_Test;

/**
 * @Auther: chenlong
 * @Date: 2022/04/13/11:37
 * @Description:
 */
public class Generic_Main {
    public static void main(String[] args) {
        String aaa = My_Generic.get("aaa");
        System.out.println("aaa = " + aaa);

        My_Generic<String> myGeneric = new My_Generic<>();
        String bbb = myGeneric.test("bbb");
        System.out.println("bbb = " + bbb);
    }
}
