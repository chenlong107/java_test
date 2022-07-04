package IO;


import java.io.Serializable;

/**
 * @Auther: chenlong
 * @Date: 2022/04/14/18:35
 * @Description:
 */
public class Student implements Serializable {
    public String name;
    public int number;
    public int age;
    public static int grader = 1;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int number, int age) {
        this.name = name;
        this.number = number;
        this.age = age;
    }

    public void fanhui(int num){
        if(num <10){
            return;
        }

        System.out.println("11111111111111");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public static int setAge(int age) {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", age=" + age +
                '}';
    }
}
