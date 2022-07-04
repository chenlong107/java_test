package Abstract_Test;

/**
 * @Auther: chenlong
 * @Date: 2022/03/30/14:22
 * @Description:
 */
public abstract class Animal {
    String name;  // 可以有普通变量
    int age;
    int id = 1001;
    public static final int num = 111; // 可以有全局静态常量

    // 可以有无参构造器
    public Animal() {
    }

    // 可以有多参构造器
    public Animal(String name, int age){this.name = name;this.age = age;}

    // 可以有普通法方法
    public void walk(){System.out.println("Animal的走路");}

    // 抽象方法
    public abstract void eat();

    // 可以有与抽象方法同名的方法，但形参列表不能一样
    public void eat(int age){System.out.println(age + "岁的Animal的吃饭");}

    // 可以有静态方法,但不能被子类重写
    public static void bark(){System.out.println("抽象类中的静态方法");}

//    public abstract static void stand(); // abstract 不能跟static在一块

}
