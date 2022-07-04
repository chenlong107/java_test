package Multi_State;

import Multi_State.Person;

/**
 * @Auther: chenlong
 * @Date: 2022/03/30/14:27
 * @Description:
 */
public class Man implements Person {
    String name;
    int age;
    int id = 1002;

    @Override
    public void eat(){
        System.out.println("Man的吃饭");
    }

    @Override
    public void say() {
        System.out.println("Man的说话");
    }

    public void walk(){
        System.out.println("Man的走路");
    }

    public void earnMoney(){
        System.out.println("Man要赚钱");
    }


}
