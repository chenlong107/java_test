package DATE;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * @Auther: chenlong
 * @Date: 2022/04/01/14:49
 * @Description:
 */
public class Date_Test {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
    }
}
