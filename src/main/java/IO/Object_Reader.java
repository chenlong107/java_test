package IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: chenlong
 * @Date: 2022/04/15/12:30
 * @Description:
 */
public class Object_Reader {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        ObjectInputStream objectInputStream;
//
//        objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Serializable")));
//
//        Student s1 = (Student) objectInputStream.readObject();
//
//        System.out.println(Student.grader);
//
//        objectInputStream.close();

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.stream().forEach(System.out::println);
    }
}
