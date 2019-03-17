import edu.emory.mathcs.backport.java.util.concurrent.Callable;
import edu.emory.mathcs.backport.java.util.concurrent.FutureTask;

/**
 * @Auther: gaoti
 * @Date: 2018/11/14 15:58
 * @Description:
 */
public class Task1 extends FutureTask {

    public Task1(Callable callable) {
        super(callable);
    }


}
