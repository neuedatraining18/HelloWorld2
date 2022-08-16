import java.math.BigDecimal;

public class Money {
    public static void main(String[] args) {
        String cost = "17.3";
        Double price = Double.parseDouble(cost);
        System.out.println(price);
        int yourAge; //0
        Integer myAge; //null

        double twiceThePrice = price * 2;

        //not good for precision math
        Double d = 1d;
        for (int i=1; i<10; i++) {
            d+=0.1;
            System.out.println(d);
        }

        BigDecimal total = BigDecimal.ONE;
        for (int i=1; i<10; i++) {
            total = total.add(new BigDecimal("0.1"));
            System.out.println(total);
        }

    }
}
