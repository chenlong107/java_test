package Multi_State;

/**
 * @Auther: chenlong
 * @Date: 2022/03/30/14:28
 * @Description:
 */
public class Women implements Person{
    String name;
    int age;
    int id = 1003;

    @Override
    public void eat(){
        System.out.println("Women的吃饭");
    }

    @Override
    public void say() {

    }

    public void walk(){
        System.out.println("Women的走路");
    }

    public void isBeauty(){
        System.out.println("Women漂亮");
    }
}
