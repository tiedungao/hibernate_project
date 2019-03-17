/**
 * @Auther: gaoti
 * @Date: 2018/11/13 10:16
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        int i = 10;
        System.out.println(111);
        here:
        for (int j = 0; j < i; j++) {
            System.out.println("循环内部！"+j);

                if (j==5){
                    break here;
                }else{
                    System.out.println(" is not five");
                }
        }

        System.out.println(222);
    }
}
