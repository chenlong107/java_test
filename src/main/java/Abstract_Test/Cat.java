package Abstract_Test;

/**
 * @Auther: chenlong
 * @Date: 2022/03/30/14:28
 * @Description:
 */
public class Cat extends Animal{
    String name;
    int age;
    int id = 1003;
    public static final int num = 333;


    @Override
    public void eat() {
        System.out.println("Dog的吃饭");
    }

    @Override
    // 重写抽象类中已经有的普通方法
    public void walk(){
        System.out.println("Cat的走路");
    }

    /*  静态方法不能重写
    public void bark(){
        System.out.println("猫叫：喵喵喵");
    }
    */

    public void canSwimming(){
        System.out.println("Dog能游泳");
    }

}
