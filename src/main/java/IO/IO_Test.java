package IO;


import java.io.*;

/**
 * @Auther: chenlong
 * @Date: 2022/04/06/14:37
 * @Description:
 */
public class IO_Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileReader fileReader;
        FileWriter fileWriter;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;

        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;

        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;

        InputStreamReader inputStreamReader;
        OutputStreamWriter outputStreamWriter;

//        String filename = "workbook.csv";
        String filename = "a.txt";

//        fileInputStream = new FileInputStream(filename);
//        int num ;
//        while ((num = fileInputStream.read()) != -1){
//            System.out.print((char) num);
//        }
//        fileInputStream.close();


//        fileReader = new FileReader(filename);
//        bufferedReader = new BufferedReader(fileReader);
//        String line ;
//        while ((line = bufferedReader.readLine()) != null){
//            System.out.println(line);
//        }
//        bufferedReader.close();

//        Student s1 = new Student();
        Student s1 = new Student("chenlong", 26, 28);
        Student.grader = 999;

        objectOutputStream = new ObjectOutputStream(new FileOutputStream("Serializable"));
        objectOutputStream.writeObject(s1);

        objectInputStream = new ObjectInputStream(new FileInputStream("Serializable"));
        System.out.println(objectInputStream.readObject());
        System.out.println(Student.grader);



    }
}
