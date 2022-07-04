package Multi_State;

/**
 * @Auther: chenlong
 * @Date: 2022/03/30/14:28
 * @Description:
 */
public class Person_Test {
    public static void main(String[] args) {
        Person p2 = new Man();

        p2.eat();
        p2.sing();
        Person.shopping();

//        p2.walk();
        System.out.println(p2.id);
        Man man = new Man();


    }
}
