package Thread_Test;



/**
 * @Auther: chenlong
 * @Date: 2022/04/07/14:36
 * @Description:
 */
//public class My_Thread extends Thread{
//    int counter = 200;
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            counter -= 2;
//            System.out.println(Thread.currentThread().getName() + " counter = " + counter);
//        }
//    }
//}


public class My_Thread implements Runnable{
    int counter = 200;
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            synchronized (this){
                counter -= 2;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " counter = " + counter);
            }
        }
    }
}
