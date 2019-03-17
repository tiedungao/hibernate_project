import edu.emory.mathcs.backport.java.util.concurrent.Callable;
import javafx.beans.binding.StringBinding;

/**
 * @Auther: gaoti
 * @Date: 2018/11/13 14:49
 * @Description:
 */
public class Test1 {
    public static void main(String[] args) throws StackOverflowError {
        byte b = 'b';
        byte[] a = {b};
        //byte[] a = {'a'};
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyRun());
        thread1.setPriority(1);
        thread2.setPriority(10);
        thread1.setDaemon(true);
        thread1.start();
        thread2.start();
        Callable callable = new CallableImpl();
        Thread thread3 = new Thread(new Task1(callable));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
