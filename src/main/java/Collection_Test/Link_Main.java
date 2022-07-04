package Collection_Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: chenlong
 * @Date: 2022/04/21/14:46
 * @Description:
 */
public class Link_Main {
    public static void main(String[] args) {
        Link link = new Link();
        link.add("aa");
        link.add("bb");
        link.add("cc");
        link.add("dd");
        link.add("ee");

        link.travel();
        System.out.println("-------------------------");
        link.delete("ee");
        link.travel();
    }
}
