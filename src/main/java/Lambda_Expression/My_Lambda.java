package Lambda_Expression;

import IO.Student;

import java.util.*;
import java.util.concurrent.RecursiveTask;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: chenlong
 * @Date: 2022/04/18/11:55
 * @Description:
 */
public class My_Lambda {
    public static void main(String[] args) {

        Optional<Student> op = Optional.ofNullable(null);
        Student student = op.orElseGet(()-> new Student("CHENLONG",28));
        System.out.println(student);


    }
}
