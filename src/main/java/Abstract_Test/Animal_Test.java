package Abstract_Test;

import Multi_State.Man;

/**
 * @Auther: chenlong
 * @Date: 2022/03/30/14:28
 * @Description:
 */
public class Animal_Test {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.walk();
        animal.eat(20);
        System.out.println(animal.id);
    }
}
