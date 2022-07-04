package Thread_Test;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: chenlong
 * @Date: 2022/04/07/14:36
 * @Description:
 */
public class Thread_Main {
    public static void main(String[] args) {
        My_Thread my_thread = new My_Thread();
        Thread thread1 = new Thread(my_thread);
        Thread thread2 = new Thread(my_thread);
        thread1.start();
        thread2.start();

        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
    }
}
