import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divider {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dividend:");
        String dividend = reader.readLine();
        int dividend_int = Integer.parseInt(dividend);

        System.out.println("Divisor:");
        String divisor = reader.readLine();
        int divisor_int = Integer.parseInt(divisor);

        int result = dividend_int/divisor_int;
        int remainder = dividend_int%divisor_int;

        System.out.println(dividend + "/" + divisor + " = " + result + "\tremainder = " + remainder);
    }
}
