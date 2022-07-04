package Abstract_Test;

/**
 * @Auther: chenlong
 * @Date: 2022/03/30/14:27
 * @Description:
 */
public class Dog extends Animal{
    String name;
    int age;
    int id = 1002;
    public static final int num = 222;

    public void eat(){
        System.out.println("Dog的吃饭");
    }

    public void walk(){
        System.out.println("Dog的走路");
    }

    /*  静态方法不能重写
    public void bark(){
        System.out.println("狗叫：汪汪汪");
    }
    */


    public void canSwimming(){
        System.out.println("Dog能游泳");
    }
}
