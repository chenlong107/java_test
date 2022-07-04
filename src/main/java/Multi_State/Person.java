package Multi_State;

/**
 * @Auther: chenlong
 * @Date: 2022/03/30/14:22
 * @Description:
 */
interface Person {
    int age = 50;  // 接口的常量必须有值，不能为空
    int id = 1001;
    public String name = "aa";
    public static final String gender = "男"; // 默认都是public static final修饰

    // 没有构造器
//    public Person() {}

    // 默认都是public public abstract 修饰，没有方法体
    void eat();

    public abstract void say();

    // 默认方法，有方法体
    default void sing(){
        System.out.println("接口的默认方法sing");
    }

    // 静态方法，有方法体
    public static void shopping(){
        System.out.println("接口的静态方法shopping");
    }

}
