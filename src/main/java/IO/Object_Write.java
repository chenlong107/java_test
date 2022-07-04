package IO;

import java.io.*;

/**
 * @Auther: chenlong
 * @Date: 2022/04/15/12:35
 * @Description:
 */
public class Object_Write {
    public static void main(String[] args) throws IOException {

        ObjectOutputStream  objectOutputStream;

        Student s1 = new Student("chenlong", 26, 28);
        Student.grader = 999;

        objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Serializable")));
        objectOutputStream.writeObject(s1);

        objectOutputStream.close();

    }
}
