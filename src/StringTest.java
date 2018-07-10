import java.util.ArrayList;
import java.util.List;

public class StringTest {
    public static void main(String[] args){
        Double one =1.00;
        Double two = 2.345;
        Double toul = add(one, two);
        System.out.println(toul);
        for (int i = 0; i < 10; i++) {
            System.out.println("i="+i);
        }

        List <String> list = new ArrayList<>();
        list.add("abc");
        list.add("ggh");
        list.add("hgg");
        System.out.println(list.toString());
    }

    private static Double add(Double a, Double b) {
        return a+b;
    }
}
