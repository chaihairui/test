import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Test1 test1 = new Test1() {
            @Override
            public int get1(int a, int b) {
                return a + b;
            }
        };

        Test1 test2 = (a, b) -> a + b;
       // System.out.println(test2.get1(2, 2));

       /* // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);


*/

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyyMMdd");
        String strDate2 = dtf2.format(ldt);
        System.out.println(strDate2);
    }


    interface Test1 {
        int get1(int a, int b);
        default int addition(int a, int b){
            return a+b;
        }

    }

    interface GreetingService {
        void sayMessage(String message);
    }







}
